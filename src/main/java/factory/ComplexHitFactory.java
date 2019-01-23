package factory;

import model.HitTicker;
import model.IHitQuery;
import model.IHitTicker;
import strategy.HitStrategy;
import strategy.HitStrategyOtherObject;

/**
 * Created by ilkayaktas on 2019-01-23 at 11:00.
 */

public class ComplexHitFactory implements IHitFactory {
    private HitTicker hitTicker;

    public ComplexHitFactory() {
        HitStrategy strategy = new HitStrategyOtherObject();
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
