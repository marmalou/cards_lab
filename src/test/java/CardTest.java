import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void setUP() {
        card = new Card(SuitType.HEARTS, RankType.ACE);
    }

    @Test
    public void aceHasValue10() {
        assertEquals(1, card.getValueFromEnum());
    }
}