package com.platform.design.decorator;

import java.math.BigDecimal;

/**
 * 饮料抽象基类<br/>
 *
 * @author pengc
 * @version v3.1.0
 * @title Beverage
 * @package com.platform.design.decorator
 * @time 2019/8/13 11:57
 */
public abstract class Beverage {

    /**
     * 描述
     */
    String description;

    /**
     * 饮料价格计算
     * @return BigDecimal 饮料价格
     */
    public abstract BigDecimal cost();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
