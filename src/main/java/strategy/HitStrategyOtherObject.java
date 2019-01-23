package strategy;

import model.Hit;

import java.util.Deque;

/**
 * Created by ilkayaktas on 2019-01-23 at 11:09.
 */

public class HitStrategyOtherObject extends HitStrategy {
    public void addTick(Deque<Hit> hitCounter){
        hitCounter.addLast(new Hit());
    }

    public long getFilteredHitCount(Deque<Hit> hitCounter){
        return hitCounter.stream().filter(hit -> {
            long now = System.currentTimeMillis();
            return now - hit.getHitTime().getTime() <= FIVE_MIN_IN_MILIS*2;
        }).count();
    }
}
