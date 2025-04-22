package Loops;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args){

        System.out.println("Enter the number I gave uh table till 10 ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=10; i++){
//            System.out.println("Helo My name is Asif!!");
            System.out.println(n+"*"+i + "="+ n*i);
        }
    }
}
