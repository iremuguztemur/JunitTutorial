import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Junit4Example extends Junit4Base {

    @Test
    public void assertEquals() {
        Assert.assertEquals("Degerler esit degil!", 1, 1);
        System.out.println("pass");
    }

    @Test
    public void assertNotEquals() {
        Assert.assertNotEquals("Degerler esit.", "1", "2");
        System.out.println("pass");
    }

    @Test
    public void arrayEquals() {
        String[] array1 = {"Testinium", "Test", "QA"};
        String[] array2 = {"Testinium", "QA", "Test"};
        Arrays.sort(array1);
        Arrays.sort(array2);
        Assert.assertArrayEquals(array1, array2);
        System.out.println("Array karsilastirmasi basarili");
    }

    @Test
    public void arrayNotEquals() {
        String[] array1 = {"Testinium", "Test", "QA"};
        String[] array2 = {"Testinium", "Qa", "Test"};
        Arrays.sort(array1);
        Arrays.sort(array2);
        Assert.assertFalse(Arrays.equals(array1, array2));
        System.out.println("Array karsilastirmasi basarili");
    }

    @Test
    public void assertListEquals() {
        List<Integer> intList1 = new ArrayList<>() {{
            add(1);
            add(2);
            add(3);
        }};
        List<Integer> intList2 = new ArrayList<>() {{
            add(2);
            add(1);
            add(3);
        }};

        Collections.sort(intList1);
        Collections.sort(intList2);

        Assert.assertEquals("Bu test fail oldu", intList1, intList2);
        System.out.println("List karsilastirmasi basarili");

    }

    @Test
    public void assertListNotEquals() {
        List<Integer> intList1 = new ArrayList<>() {{
            add(1);
            add(2);
            add(3);
        }};
        List<Integer> intList2 = new ArrayList<>() {{
            add(2);
            add(1);
            add(5);
        }};

        Collections.sort(intList1);
        Collections.sort(intList2);

        Assert.assertNotEquals("Bu test fail oldu", intList1, intList2);
        System.out.println("List karsilastirmasi basarili");

    }

    @Test
    public void assertTrue() {
        int a = 11;
        Assert.assertTrue("a bire esit degil veya ondan buyuk degil.", a == 1 || a > 10);
        System.out.println("pass");
    }

    @Test
    public void assertFalse() {
        int a = 11;
        Assert.assertFalse("a 4ten buyuk ve cift", a > 4 && (a % 2 == 0));
        System.out.println("pass");
    }

    @Test
    public void assertNull() {
        String a = null;
        Assert.assertNull("Deger null degil", a);
        System.out.println("pass");
    }

    @Test
    public void assertNotNull() {
        String a = "";
        Assert.assertNotNull("deger null", a);
        System.out.println("pass");
    }

    @Test
    @Ignore
    public void testIgnore(){
        System.out.println("Test Ignore");
    }

}
