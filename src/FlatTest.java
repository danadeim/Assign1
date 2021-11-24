import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.swing.text.View;

public class FlatTest {
    public Flat <Cost,Integer> c = new Flat<>();
    public Flat <Meters, Integer> m = new Flat<>();
    public Flat <Area, Integer> a = new Flat<>();

    @Before
    public void before() {
        c.add(new Cost(750));
        c.add(new Cost(123));
        c.add(new Cost(630));

        m.add(new Meters(60));
        m.add(new Meters(100));
        m.add(new Meters(48));

        a.add(new Area(1));
        a.add(new Area(2));
        a.add(new Area(1));
    }
    @Test
    public void aggregateAllElements(){
        int c_result =  c.aggregateAllElements();
        Assert.assertEquals(1503,c_result);


    }
    @Test
    public void cloneElementAtIndex(){
        Cost clone = c.cloneElementAtIndex(1);
        Assert.assertEquals(c.get(1).cash(),clone.cash());
        Assert.assertNotSame(c.get(1) , clone);
    }

}