package chap07;

import java.util.Scanner;

public class BreakStatement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 카운터 변수
        int count = 0;

        System.out.println(" ===== 반복 시작 ===== ");
        while(true){
            System.out.print("반복을 시작하려면 'y'를 눌러주세요.");
            String result = sc.nextLine();

            // 입력판정
            if(result.equals("y")){
                // 카운트 1증가
                count++;
                System.out.println(count+"번째 반복됨");
                System.out.println();
            }else{
                System.out.println("y 이외의 " + result + "가 입력되었으므로 종료합니다.");
                break;
            }
        }
        System.out.println(" ===== 반복 종료 ====== ");
    }

}
