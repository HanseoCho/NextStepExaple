package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import src.Calculator;

import static org.junit.Assert.assertEquals;

/* 2.2.3 테스트 코드 중복 제거
 * 개발자가 가져야 할 좋은 습관 중의 하나는 중복 코드를 제거하는 것이다.
 * jUnit에는 @RunWith, @Rule 같은 어노테이션을 사용해 기능을 확장할 수 있는데, @Before안이어야만
 * @RunWith, @Rule에서 초기화된 객체에 접근할 수 있다는 제약사항이 있다.
 * @Before 어노테이션으로 초기화 작업을 하는게 추우 문제가 발생할 소지를 없앨 수 있다.
 *
 */
public class CalculatorTest3 {
    private Calculator cal;

    @Before // 각 메소드 실행 전 동작
    public void setup(){
        cal = new Calculator();
        System.out.println("before");
    }

    @After // 각 메소드 실행 후 동작
    public void teardown(){
        System.out.println("teardown");
    }

    @Test
    public void add() {
        assertEquals(7, cal.add(4,3));
        System.out.println("add");
    }

    @Test
    public void subtract(){
        assertEquals(5,cal.subtract(6,3));
        System.out.println("subtract");
    }
}
