import java.util.Scanner;

public class weightConverter {

    public static double ConverterLBStoKG(Double enteredWeight){
        return enteredWeight*0.4535924;
    }
    public static double ConverterKGtoLBS(Double enteredWeight){
        return enteredWeight*2.204623;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome!! to the weight converter\nConverter can be used to convert lbs to kgs and vica versa!!");
        double result;
        System.out.print("Enter your choice\nEnter 1 for lbs to kg else Enter 2 for lbs to kg:");
        int choice=sc.nextInt();



        if(choice==1){
            System.out.println("Converting lbs to kg: ");

            System.out.print("Enter the weight: ");
            Double enteredWeight = sc.nextDouble();

            result = ConverterLBStoKG(enteredWeight);
            System.out.println(enteredWeight+" Pound"+" in kgs: "+result+" kg");
        }
        else if(choice==2){
            System.out.println("Converting kg to lbs: ");

            System.out.print("Enter the weight: ");
            Double enteredWeight = sc.nextDouble();

            result = ConverterKGtoLBS(enteredWeight);
            System.out.println(enteredWeight+" kg"+" in lbs: "+result+" Pounds");
        }
        else{
            System.out.println("Invalid choice.");
        }

    sc.close();
    }
}
