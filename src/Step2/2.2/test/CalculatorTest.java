package test;

import org.junit.Test;
import src.Calculator;

/* JUnit4 설정법
 * junit4 라이브러리르 import한다.
 * 1. 테스트 파일을 담을 디렉터리를 생성한다.
 * 2. 테스트할 클래스파일이 담긴 상위 폴더 우클릭 후 Open Module Settings(F4) 후 1번에서 생성한 디렉터리를 Test로 mark 한다.
 * 3. mark한 디렉터리에 자바클래스를 생성후 함수에 @Test 어노테이션을 추가한후 출력을 확인한다.
 */
public class CalculatorTest {
    @Test
    public void add() {
        Calculator cal = new Calculator();
        System.out.println(cal.add(8,3));
    }

    @Test
    public  void subtract(){
        Calculator cal = new Calculator();
        System.out.println(cal.subtract(7,3));
    }
}
