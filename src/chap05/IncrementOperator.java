package chap05;

public class IncrementOperator {
    public static void main(String[] args) {

        int num = 15;

        System.out.println(" ===== 전치 증가 ===== ");
        System.out.println(num); // 초기값 출력
        System.out.println(++num); // 합쳐진 후 출력
        System.out.println(num); // 전치증가 후 값 표시

        num = 10;

        System.out.println(" ===== 후치 증가 ===== ");
        System.out.println(num); // 초기값 출력
        System.out.println(num++); // 출력 후 더함
        System.out.println(num); // 후치 증가 후 값 출력

    }
}
