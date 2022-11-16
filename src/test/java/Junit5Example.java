import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestClassOrder(ClassOrderer.OrderAnnotation.class)

@Order(1)
public class Junit5Example extends Junit5Base {

    @Order(2)
    @Test
    public void assertEquals() {
        Assertions.assertEquals("1", "1", "Degerler esit degil");
        System.out.println("pass");
    }

    @Order(3)
    @ParameterizedTest
    @ValueSource(strings = {"kullanici1", "kullanici2", "kullanici3"})
    public void paramTest(String param) {
        System.out.println(param + " login oldu");
    }

    String getUsername(){
        return "Kullanici 1<br>";
    }

    @Order(1)
    @Test
    void assertEqualsTest(){
        String userName=getUsername().trim().replaceAll("<br>","");
        Assertions.assertEquals("Kullanici 1",userName,"Kullanici adı beklenen deger degil");
        System.out.println("pass");
    }

}
