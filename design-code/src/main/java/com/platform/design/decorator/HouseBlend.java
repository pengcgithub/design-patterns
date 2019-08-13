package com.platform.design.decorator;

import java.math.BigDecimal;

/**
 * HouseBlend <br/>
 *
 * @author pengc
 * @version v3.1.0
 * @title HouseBlend
 * @package com.platform.design.decorator
 * @time 2019/8/13 13:42
 */
public class HouseBlend extends Beverage {

    public HouseBlend () {
        super.description = "HouseBlend";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal("10");
    }

}
