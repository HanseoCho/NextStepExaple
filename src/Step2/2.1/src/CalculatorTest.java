package src;

import java.util.Calendar;

public class CalculatorTest {
    /* 2.1_2 테스트를 담당하는 별도의 클래스를 추가했지만 main() 메소드 하나에 프로덕션 코드의 여러 메소드를 동시에 테스트 하고있다.
     * 이는 프로덕션 코드의 복잡도가 증가하면 증가할수록, main() 메소드의 복잡도도 증가하고, 결과적으로 main()메소드를 유지하는 데 부담이 된다.
     * 이 같은 무문제를 해결하기 위해 테스트 코드를 각 메소드별로 분리할수 잇다.
     */
//    public static void main(String[] args) {
//        Calculator cal = new Calculator();
//        System.out.println(cal.add(1,4));
//        System.out.println(cal.subtract(7,3));
//        System.out.println(cal.multiply(4,3));
//        System.out.println(cal.divide(6,3));
//    }

    /* 2.1_3 이 코드의 단점은 클래스가 가지고있는 모든 메소드에 관심이 있는 것이 아니라 한가지 메소드에만 집중하고 싶지만
     * Calculator 클래스가 가지고 있는 모든 메소드를 테스트 할 수밖에 없다.
     * 또 다른 문제점은 테스트 결과를 매번 콘솔에 출력되는 값을 통해 수동으로 확인해야 한다.
     * 로직의 복잡도가 높을 경우, 결과 값이 정상적으로 출력되는지 일일이 확인해야 하는 번거로움이 생긴다.
     * 이를 해결 하기 위해 등장한 라이브러리가 jUnit이다.
     * jUnit은 내가 관심을 가지는 메소드에 대한 테스트만 가능하고 결과값 확인을 프로그래밍을 통해 자동화가 가능하다.
     */
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        add(cal);
        subtract(cal);
        multiply(cal);
        divide(cal);
    }

    private static void add(Calculator cal){
        System.out.println(cal.add(8, 3));
    }

    private static void subtract(Calculator cal){
        System.out.println(cal.subtract(9, 3));
    }

    private static void multiply(Calculator cal){
        System.out.println(cal.multiply(9,3));
    }

    private static void divide(Calculator cal) {
        System.out.println(cal.divide(9, 3));
    }
}
