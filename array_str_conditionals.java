import java.util.Scanner;

class array_str_conditionals {
    public static void main(String[] args) {
        int count = 0;
        char []vowels={'a','e','i','o','u','A','E','I','O','U'};
        int no_Of_vowels=0;
        int len=0;

        System.out.println("Alphabets from a to z : ");
        for(char ch='a';ch<='z';ch++){
            System.out.print(ch+"  ");
        }
        System.out.println("\nAlphabets from A to Z : ");
        for(char ch='A';ch<='Z';ch++){
            System.out.print(ch+"  ");
            count++;
        }

        System.out.println("\nNumber of Letters in English language: "+count);

        char []vowelsIn=new char[10];

        //String sentence="My name is Vaibhav Rawat";
        String sentence;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the sentence : ");
        sentence=input.nextLine();

        char []vowelsINstring=new char[sentence.length()];

        for(int i=0;i<sentence.length();i++){
            for(int j=0;j<10;j++){
                if(sentence.charAt(i)==vowels[j]){
                    no_Of_vowels++;
                    vowelsINstring[len]=sentence.charAt(i);
                    len++;

                }
            }
        }
        System.out.print("Vowels Found in Entered sentence : ");
        for(int j=0;j<no_Of_vowels;j++){
            System.out.print(vowelsINstring[j]+" ");
        }
        System.out.println("\nNumber of vowels in given sentence is :"+no_Of_vowels);
        System.out.println("End Of Program!!");
        input.close();
    }
}
