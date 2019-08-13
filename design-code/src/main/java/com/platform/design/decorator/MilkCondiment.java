package com.platform.design.decorator;

import java.math.BigDecimal;

/**
 * Milk Condiment<br/>
 *
 * @author pengc
 * @version v3.1.0
 * @title MilkCondiment
 * @package com.platform.design.decorator
 * @time 2019/8/13 13:56
 */
public class MilkCondiment extends CondimentDecorator {

    public MilkCondiment(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", milk";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal("1").add(super.cost());
    }

}
