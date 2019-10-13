package com.kaka.designpattern.factory.abstractfactory;

public interface PizzaIngredientFactory {

    /**
     * 创建面团
     * @return
     */
    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();

}
