package com.platform.design.decorator;

import java.math.BigDecimal;

/**
 * Soy Condiment <br/>
 *
 * @author pengc
 * @version v3.1.0
 * @title SoyCondiment
 * @package com.platform.design.decorator
 * @time 2019/8/13 14:37
 */
public class SoyCondiment extends CondimentDecorator {

    public SoyCondiment(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", soy";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal("2").add(super.cost());
    }
}
