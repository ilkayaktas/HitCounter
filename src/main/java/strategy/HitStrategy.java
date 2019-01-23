package strategy;

import model.Hit;

import java.util.Deque;

/**
 * Created by ilkayaktas on 2019-01-23 at 10:51.
 */

public abstract class HitStrategy {

    public static final int FIVE_MIN_IN_MILIS = 5 * 60 * 1000;

    public abstract void addTick(Deque<Hit> hitCounter);
    public abstract long getFilteredHitCount(Deque<Hit> hitCounter);
}
