package com.kaka.designpattern.factory.abstractfactory;

/**
 * 原料工厂接口
 */
public interface PizzaIngredientFactory {

    /**
     * 生产面团
     *
     * @return
     */
    Dough createDough();

    /**
     * 生产酱料
     *
     * @return
     */
    Sauce createSauce();

    /**
     * 生产芝士
     *
     * @return
     */
    Cheese createCheese();

    /**
     * 生产蔬菜
     *
     * @return
     */
    Veggies[] createVeggies();

    /**
     * 生产意式腊肠
     *
     * @return
     */
    Pepperoni createPepperoni();

    /**
     * 生产蛤蜊
     *
     * @return
     */
    Clams createClam();

}
