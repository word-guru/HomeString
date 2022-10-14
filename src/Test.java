import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class Test {
    MyString string;
    @Before
    public void setUp(){
        string=new MyString();
    }

    @After
    public void tearDown(){
        string = null;
    }

    @org.junit.Test
    public void testIsVowel(){
        int result = string.isVowel("awerdd");
        assertEquals(2,result,0);
    }
    @org.junit.Test
    public void testConsonants(){
        int result = string.consonants("awerdd");
        assertEquals(4,result,0);
    }
    @org.junit.Test
    public void testPalindrome(){
        boolean result = string.palindromeCheck("awerdd");
        assertFalse("false",result);
    }
    @org.junit.Test
    public void testEntry(){
        int result = string.entry("aze as gedv wwwd as dfdf","as");
        assertEquals(2,result,0);
    }

}
