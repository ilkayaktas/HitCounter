package main;

import factory.FactoryMaker;
import factory.IHitFactory;
import model.IHitQuery;
import model.IHitTicker;

import java.util.Timer;

/**
 * Created by ilkayaktas on 2019-01-23 at 11:04.
 */

public class App {
    public static void main(String[] args) {
        IHitFactory factory = FactoryMaker.getFactory(FactoryMaker.HitType.BASIC);

        IHitQuery client = factory.hitForClient();
        IHitTicker ticker = factory.hitForTicker();

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TickJob(ticker), 0, 1000);
        timer.scheduleAtFixedRate(new DumpJob(client), 0, 1000);
    }
}
