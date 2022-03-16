package chap06;

import java.util.Scanner;

public class chap06Exercise {

    public static void main(String[] args) {

        System.out.print("숫자 입력 : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("입력숫자 [" + num + "]는 짝수입니다.");
        }else{
            System.out.println("입력숫자 [" + num + "]는 홀수입니다.");
        }

    }
}
