import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class StringUtilsTest {

    @Test
    public void testStringUtils(){
        StringUtils stringUtils = new StringUtils();
        Assert.assertEquals("abcdefghijklmnopqrstuvwxyz",
                stringUtils.shiftString("abcdefghijklmnopqrstuvwxyz",0));
    }
}
