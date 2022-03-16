package chap06;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("y입력 : ");
        String str = sc.nextLine();

        if(str.equals("y")){
            System.out.println(str + "가 입력되었습니다.");
        }else{
            System.out.println("다른 값이 " + str + "가 입력되었습니다.");
        }

        int num1 = 5;

        System.out.print("숫자입력 : ");
        int num2 = sc.nextInt();

        if(num2 > num1){
            System.out.println(num1 + "보다 " + num2 + "가 더 큽니다.");
        }else if(num2 < num1){
            System.out.println(num1 + "보다 " + num2 + "가 더 작습니다.");
        } else{
            System.out.println("num1과 num2의 값은 동일합니다.");
        }
    }

}
