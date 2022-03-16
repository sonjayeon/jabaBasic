package chap06;

public class StringTest {
    /*
① 변수 num은 0 이상 9 이하
② 변수 num은 0보다 작거나 9보다 크다.
③ 변수 num1은 5와 같고 변수 num2는 999와 같지 않다.
④ 변수 char1은 'y'와 같거나 변수 str1은 'yes'와 같음
⑤ 변수 month 는 3 이상 5 이하
⑥ 변수 month 는 6 이상 8 이하
⑦ 변수 month 는 9 이상 11 이하
⑧ 변수 month는 12와 같거나 0보다 크고 2 이하
⑨ 변수 i와 w가 같지 않고 변수 num1과 num2가 동일하다.
⑩ 변수 a와 x가 같거나 변수 b와 y가 같거나 변수 c와 z가 같음

 */

    public static void main(String[] args){
        int num = 1;
        int num1 = 5;
        int num2 = 6;
        char char1 = 'y';
        String str = "yes";
        int month = 8;
        int i = 2, w = 3;
        int a = 4, b = 5, c = 6, x = 7, y = 8, z = 9;

        // 1번
        if(num >= 0 && num <= 9){
            System.out.println("1");
        }
        // 2번
        if(num < 0 || num > 9){
            System.out.print("2");
        }
        // 3번
        if(num1 == 5 && num2 != 999){
            System.out.println("3");
        }
        // 4번
        if(char1 == 'y' || str.equals("yes")){
            System.out.println("4");
        }

        // 5번
        if(month >= 3 && month <= 5){
            System.out.println("5");
        }

        // 6번
        if(month >= 6 && month <= 8){
            System.out.println("6");
        }

        // 7번
        if(month >= 9 && month <= 11){
            System.out.println("7");
        }

        // 8번
        if(month == 12 || (month > 0 && month <= 2)){
            System.out.println("8");
        }

        // 9번
        if((i != w) && (num1 == num2)){
            System.out.println("9");
        }

        // 10번
        if(a == x || b == y || c == z){
            System.out.println("10");
        }


    }
}
