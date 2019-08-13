package com.platform.design.decorator;

import java.math.BigDecimal;

/**
 * Espresso <br/>
 *
 * @author pengc
 * @version v3.1.0
 * @title Espresso
 * @package com.platform.design.decorator
 * @time 2019/8/13 13:49
 */
public class Espresso extends Beverage {

    public Espresso() {
        super.description = "Espresso";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal("12");
    }

}
