package hw_9_1;

import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.IResultMap;
import org.testng.annotations.Test;

public class FirstTest {
    @Test
    public void testAbbr20() {

        String res = First.abbr("Group dream team java - the best group!", 25);
        Assert.assertEquals(res, "Group dream team java ...");
    }
}
