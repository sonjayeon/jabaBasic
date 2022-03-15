package chap05;

public class PriorityCheck {

    public static void main(String[] args) {

        int a = 10;
        int b = 14;
        int c = 35;
        int d = 45;

        int answer;

        System.out.print("a = ");
        System.out.println(a);

        System.out.print("b = ");
        System.out.println(b);

        System.out.print("c = ");
        System.out.println(c);

        System.out.print("d = ");
        System.out.println(d);

        answer = (a / b) + c - d;
        System.out.print("(a / b) + c - d = ");
        System.out.println(answer);

        answer = a - (b + c) - d;
        System.out.print("a - (b + c) - d = ");
        System.out.println(answer);

        answer = a % d - b + c;
        System.out.print("a % d - b + c = ");
        System.out.println(answer);



    }
}
