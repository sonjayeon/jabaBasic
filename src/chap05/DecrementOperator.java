package chap05;

public class DecrementOperator {

    public static void main(String[] args) {

        int num = 9;

        System.out.println(" ===== 전치 감소 ===== ");
        System.out.println(num); // 초기값 표시
        System.out.println(--num); // 감소 후 표시
        System.out.println(num); // 전치감소 후 값 표시

        num = 10;

        System.out.println(" ====== 후치 감소 ====== ");
        System.out.println(num); // 초기값 표시
        System.out.println(num--); // 감소 후 표시
        System.out.println(num); // 후치 감소 후 값 표시
    }
}
