package com.platform.design.decorator;

import java.math.BigDecimal;

/**
 * 装饰类<br/>
 *
 * @author pengc
 * @version v3.1.0
 * @title CondimentDecorator
 * @package com.platform.design.decorator
 * @time 2019/8/13 13:53
 */
public abstract class CondimentDecorator extends Beverage {

    private Beverage beverage;

    public CondimentDecorator (Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public BigDecimal cost() {
        return beverage.cost();
    }

}
