import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Hand hand;

    @Before
    public void setUp(){
        player = new Player("Crawford");
        hand = new Hand();
    }
    @Test
    public void canGetName(){
        assertEquals("Crawford", player.GetName());

    }

}
