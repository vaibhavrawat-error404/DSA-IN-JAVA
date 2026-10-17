
import java.util.Scanner;

public class practice{


    public static void logger(String email,String password,String enteredPassword){
        if(password.equals(enteredPassword)){
            System.out.print("Entered password is Valid\nYou are Logged In");
        }
        else{
            System.out.println("Invalid Password");
        }
    }

    public static void checker(String email){
        if(email.contains("@")){
            String domain;
            String username;
            System.out.println("Entered email address is Valid");
            username=email.substring(0,email.indexOf("@"));
            domain=email.substring(email.indexOf("@")+1);
            System.out.println("Your username: "+username);
            System.out.println("Your domain: "+domain);
        }
        else{
            System.out.println("Invalid Email!!\nPlease enter a valid Email");
        }
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String password="ALPHA123@";

        System.out.print("Enter email address: ");
        String email = sc.nextLine();
        System.out.print("Enter password: ");
        String enteredPassword=sc.nextLine();

        //function to obtain the username and the domain of the entered email address
        checker(email);

        //function to check if password is valid or not
        logger(email,password,enteredPassword);

        sc.close();
    }
}