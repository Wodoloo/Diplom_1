import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;
import praktikum.Database;

public class BunTest {

    @Test public void getNameTest(){
        Bun bun = new Bun("Oat bun", (float) 50.5);
        String actual = bun.getName();
        Assert.assertEquals(bun.name,actual);
    }

    @Test public void getNameTestFromDataBase(){
        Database database = new Database();
        Bun bun = database.availableBuns().get(1);
        String actual = bun.getName();
        Assert.assertEquals(bun.name,actual);
    }

    @Test public void getPriceTest(){
        Bun bun = new Bun("Булка1", (float) 56.6);
        float actual = bun.getPrice();
        Assert.assertEquals(bun.price,actual,0);
    }

    @Test public void getPriceTestFromDataBase(){
        Database database = new Database();
        Bun bun = database.availableBuns().get(1);
        float actual = bun.getPrice();
        Assert.assertEquals(bun.price,actual,0);
    }


}