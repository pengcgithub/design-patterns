package com.platform.design.decorator;

import java.math.BigDecimal;

/**
 * Mocha Condiment<br/>
 *
 * @author pengc
 * @version v3.1.0
 * @title MochaCondiment
 * @package com.platform.design.decorator
 * @time 2019/8/13 15:22
 */
public class MochaCondiment extends CondimentDecorator {

    public MochaCondiment(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", mocha";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal("3").add(super.cost());
    }
}
