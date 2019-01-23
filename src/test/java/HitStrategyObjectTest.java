import model.Hit;
import org.junit.Before;
import org.junit.Test;
import strategy.HitStrategyObject;

import java.util.Date;
import java.util.Deque;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

/**
 * Created by ilkayaktas on 2019-01-23 at 10:43.
 */
public class HitStrategyObjectTest {

    private HitStrategyObject hitStrategyObject;
    private Deque<Hit> hitCounter;

    @Before
    public void setUp(){
        if(hitStrategyObject == null){
            hitStrategyObject = new HitStrategyObject();
        }
        if(hitCounter == null){
            hitCounter = new LinkedList<>();
        }
        hitCounter.clear();
    }


    @Test
    public void addTick() {
        hitStrategyObject.addTick(hitCounter);
        hitStrategyObject.addTick(hitCounter);
        hitStrategyObject.addTick(hitCounter);

        assertEquals(3, hitCounter.size());

        hitStrategyObject.addTick(hitCounter);
        hitStrategyObject.addTick(hitCounter);

        assertEquals(5, hitCounter.size());
    }

    @Test
    public void getLastFiveMinutesHitCount() {
        addTick();

        assertEquals(5, hitStrategyObject.getFilteredHitCount(hitCounter));

        Hit old = new Hit();
        old.setHitTime(new Date(System.currentTimeMillis() - (HitStrategyObject.FIVE_MIN_IN_MILIS + 1000)));
        hitCounter.addLast(old);

        assertEquals(5, hitStrategyObject.getFilteredHitCount(hitCounter));
        assertEquals(6, hitCounter.size());

    }

}