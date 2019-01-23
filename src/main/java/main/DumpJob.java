package main;

import model.IHitQuery;

import java.util.TimerTask;

/**
 * Created by ilkayaktas on 2019-01-23 at 11:18.
 */

public class DumpJob extends TimerTask {
    private IHitQuery query;

    public DumpJob(IHitQuery query) {
        this.query = query;
    }

    @Override
    public void run() {
        System.out.println(query.getHitCount());
    }
}
