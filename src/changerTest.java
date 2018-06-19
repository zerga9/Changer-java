import org.junit.Test;
import static org.junit.Assert.*;

import java.util.*;


public class changerTest {

    List<Integer> coins(Integer...ints) {
        return new ArrayList<>(Arrays.asList(ints));
    }

    @Test
    public void givesChangeFor1(){
        assertEquals(coins(1), changer.changed(1));
    }

    @Test
    public void givesChangeFor5(){
        assertEquals(coins(5), changer.changed(5));
    }

    @Test
    public void givesChangeFor9(){
        assertEquals(coins(5, 2 ,2), changer.changed(9));
    }

    @Test
    public void givesChangeFor99(){
        assertEquals(coins(50, 20, 20, 5, 2, 2), changer.changed(99));
    }
    @Test
    public void givesChangeFor88(){
        assertEquals(coins(50, 20, 10, 5, 2, 1), changer.changed(88));
    }
    @Test
    public void givesChangeFor108(){
        assertEquals(coins(50, 50, 5, 2, 1), changer.changed(108));
    }
}