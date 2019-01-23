package main;

import model.IHitTicker;

import java.util.TimerTask;

/**
 * Created by ilkayaktas on 2019-01-23 at 10:54.
 */

public class TickJob extends TimerTask {
    private IHitTicker hitTicker;

    public TickJob(IHitTicker hitTicker) {
        this.hitTicker = hitTicker;
    }

    @Override
    public void run() {
        hitTicker.tick();
    }
}
