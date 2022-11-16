import org.junit.*;

public class Junit4Base {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Beforeclass metodu calisti.");
    }

    @Before
    public void before() {
        System.out.println("Before metodu calisti.");
    }

    /*
    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

    @Test
    public void test3() {
        System.out.println("test3");
    }

     */

    @After
    public void after(){
        System.out.println("After metodu calisti");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Afterclass metodu calisti.");
    }

}
