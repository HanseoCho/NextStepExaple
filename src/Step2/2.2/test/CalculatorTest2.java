package test;

import org.junit.Test;
import src.Calculator;

import static org.junit.Assert.assertEquals;

/* 2.2.2 결과값을 눈이 아닌 프로그램 통해 자동화
 * assertEquals는 Static 메소드라 import static으로 메소드를 import한 후 위와 같이 구현할 수 있다.
 * 메소드의 첫 번째 인자는 기대하는 결과 값이고 두 번째 인자는 프로덕션 코드의 메소드를 실행한 결과 값이다.
 * 이외에도 ture/false를 확인하는 assertTrue(), assertFasle() 결과 값이 null 유무를 판단하는 assertNull(), assertNotNull()
 * 배열값이 같은지를 검증하는 assertArrayEquals() 메소드 등을 제공한다.
 */
public class CalculatorTest2 {
    @Test
    public void add() {
        Calculator cal = new Calculator();
        assertEquals(7, cal.add(4,3));
    }

    @Test
    public void subtract(){
        Calculator cal = new Calculator();
        assertEquals(5,cal.subtract(6,3));
    }
}
