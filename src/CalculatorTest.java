import static org.junit.jupiter.api.Assertions.*;

/** Test class for Calculator, each method is the test for that respective method in Calculator. At the beginning
 * of each test for the method, the value of total for obj1 is 0
 * @version 1.1 second commit
 * @since 1.1
 */
class CalculatorTest {

    Calculator obj1 = new Calculator();
    @org.junit.jupiter.api.Test
    //test by adding 1 to total first. Then using assertEquals to check result of
    //mult method

    void multTest() {
        obj1.add(1);
        assertEquals(1, obj1.getTotal());
        obj1.mult(10);
        assertEquals(10, obj1.getTotal());
        obj1.mult(-7);
        assertEquals(-70, obj1.getTotal());
        obj1.mult(0);
        assertEquals(0, obj1.getTotal());
        System.out.println(obj1.toString());
    }

    @org.junit.jupiter.api.Test
        //test by adding 10 to total first. Then using assertEquals to check result of
        //div method
    void divTest() {
        obj1.add(30);
        obj1.div(3);
        assertEquals(10, obj1.getTotal());
        obj1.div(-2);
        assertEquals(-5, obj1.getTotal());
        obj1.div(-60);
        assertEquals(0, obj1.getTotal());
        System.out.println(obj1.toString());
    }

    @org.junit.jupiter.api.Test
        //test by adding 5 to total first. Then using assertEquals to check result of
        //power method
    void powerTest() {
        obj1.add(5);
        obj1.power(3);
        assertEquals(125, obj1.getTotal());
        obj1.power(0);
        assertEquals(1, obj1.getTotal());
        obj1.power(-10);
        assertEquals(0, obj1.getTotal());
        System.out.println(obj1.toString());
    }
}