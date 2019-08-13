package com.platform.design.decorator;

/**
 * 装饰者模式测试代码<br/>
 *
 * @author pengc
 * @version v3.1.0
 * @title BeverageTest
 * @package com.platform.design.decorator
 * @time 2019/8/13 14:46
 */
public class BeverageTest {

    public static void main(String args[]) {
        // 点一杯houseBeverage
        Beverage beverage = new HouseBlend();
        // 加一分牛奶调料
        beverage = new MilkCondiment(beverage);
        // 再加一分豆浆调料
        beverage = new SoyCondiment(beverage);

        // 结果输出
        System.out.println(beverage.cost());
        System.out.println(beverage.getDescription());
    }

}
