package src;

// 2-1 main() 메소드를 활용한 테스트의 문제점
public class Calculator {
    public int add(int i, int j){
        return i + j;
    }

    public int subtract(int i, int j){
        return i - j;
    }

    public int multiply(int i, int j){
        return i * j;
    }

    public int divide(int i, int j){
        return i / j;
    }

    /* 2.1_1 이 계산기 코드의 첫 번째 문제점은 프로덕션 코드와 테스트 코드(main() 메소드)가
     * 같은 클래스에 위치하고 있다는 것이다. 테스트 코드의 경우 테스트 단계에서만 필요하기 때문에 굳이 서비스하는 시점에 같이 배포할 필요가 없다
     * 이 문제를 해결하기 위한 첫 번재 단계로 프로덕션 코드(Calculator 클래스)와 테스트 코드(Calculator)를 분리할 수 있다.
     */
/*
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(1,4));
        System.out.println(cal.subtract(7,3));
        System.out.println(cal.multiply(4,3));
        System.out.println(cal.divide(6,3));
    }
*/
}
