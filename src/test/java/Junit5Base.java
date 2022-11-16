import org.junit.jupiter.api.*;

public class Junit5Base {


    @BeforeAll
    public static void beforeAll(){
        System.out.println("beforeAll metodu calisti.");
    }


    @BeforeEach
    public void beforeEach(){
        System.out.println("beforeEach metodu calisti.");
    }

    /*
    @Test
    public void test1() {
        System.out.println("junit5 test1");
    }

    @Test
    public void test2() {
        System.out.println("junit5 test2");
    }

    @Test
    public void test3() {
        System.out.println("junit5 test3");
    }

     */

    @AfterEach
    public void afterEach(){
        System.out.println("aftereach metodu calisti");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("afterAll metodu calisti");
    }
}
