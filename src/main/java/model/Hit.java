package model;

import java.util.Date;

/**
 * Created by ilkayaktas on 2019-01-23 at 10:21.
 */

public class Hit {
    private Date hitTime;

    public Hit() {
        hitTime = new Date(System.currentTimeMillis());
    }

    public Date getHitTime() {
        return hitTime;
    }

    public void setHitTime(Date hitTime) {
        this.hitTime = hitTime;
    }
}
