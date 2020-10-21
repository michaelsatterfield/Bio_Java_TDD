import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {
//annotation
    @Test
    public void testIsSameString(){
        String expected = "Codeup";
        String actual = "Codeup";
        assertEquals(expected,actual);
        assertNotEquals(expected,actual.toLowerCase());

    }

    @Test
    public void testIfArraysEquals(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages);
    }
    @Test
    public void testIfArraysAreEqual(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        int[] masNumbers = {1, 2, 3};
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers,otherNumbers);
        assertNotEquals(masNumbers,numbers);

    }

    @Test
    public void testIfStatementsAreTrue(){
        String language = "PHP";
        language.contains("H"); // use assertTrue for this statement
        language.contains("J"); // use assertFalse for this statement

        assertTrue("PHP contains letter H",language.contains("H"));
        assertFalse("PHP contains letter J",language.contains("J"));
    }


     @Test
    public void  testIfHashPasswordWorks(){

     }





}
