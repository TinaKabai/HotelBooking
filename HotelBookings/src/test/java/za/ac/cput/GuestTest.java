package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;

public class GuestTest {
    @Test
    public void guest(){
        String details = "Moipone Kabai";
        int age = 20;
        Assert.assertEquals( details, "Moipone Kabai");
    }
}
