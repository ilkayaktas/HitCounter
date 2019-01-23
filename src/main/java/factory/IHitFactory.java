package factory;

import model.IHitQuery;
import model.IHitTicker;

/**
 * Created by ilkayaktas on 2019-01-23 at 10:57.
 */

public interface IHitFactory {
    IHitQuery hitForClient();
    IHitTicker hitForTicker();
}
