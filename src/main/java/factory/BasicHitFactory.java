package factory;

import model.HitTicker;
import model.IHitQuery;
import model.IHitTicker;
import strategy.HitStrategy;
import strategy.HitStrategyObject;

/**
 * Created by ilkayaktas on 2019-01-23 at 10:58.
 */

public class BasicHitFactory implements IHitFactory {
    private HitTicker hitTicker;

    public BasicHitFactory() {
        HitStrategy strategy = new HitStrategyObject();
        hitTicker = new HitTicker(strategy);
    }

    @Override
    public IHitQuery hitForClient() {
        return hitTicker;
    }

    @Override
    public IHitTicker hitForTicker() {
        return hitTicker;
    }
}
