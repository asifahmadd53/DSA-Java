package Conditions;
import java.util.*;

public class BasicQuestions {
    public static void main(String[] args){

//        Question Odd or Even

        System.out.println("Enrter the number to check weather its Even or Odd");
        System.out.print("Enter the number ");
        Scanner sc = new Scanner(System.in);
        Integer num = sc.nextInt();
        if( num%2 == 0){
            System.out.println(num + " is Even");
        }else {
            System.out.println(num+" is Odd ");
        }

    }
}
