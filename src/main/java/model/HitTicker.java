package model;

import strategy.HitStrategy;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by ilkayaktas on 2019-01-23 at 10:24.
 */

public class HitTicker implements IHitQuery, IHitTicker, IHitOptimizer {

    private HitStrategy hitStrategy;
    private Deque<Hit> hitList;

    public HitTicker(HitStrategy hitStrategy) {
        this.hitStrategy = hitStrategy;
        hitList = new LinkedList<>();
    }

    @Override
    public synchronized void tick() {
        hitStrategy.addTick(hitList);
    }

    @Override
    public synchronized long getHitCount() {
        return hitStrategy.getFilteredHitCount(hitList);
    }

    @Override
    public synchronized void optimize() {
        // You can delete aged hits
    }
}
