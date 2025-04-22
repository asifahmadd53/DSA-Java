package Loops;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
//        System.out.println("Enter the number I gave uh table till 10 ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i = 1; i<=10; i++){
//            System.out.println("Helo My name is Asif!!");
//            System.out.println(n+"*"+i + "="+ n*i);
//        }

//        int j = 12;
//        while (j<=10){
//            System.out.println(j);
//            j++;
//        }

//        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//        do {
//            System.out.println(i);
//        }while (i==5);

        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i<=num; i++){
            sum = sum+num;
            i++;
        }
        System.out.println("The sum of the number is "+sum);


    }
}
