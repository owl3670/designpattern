package factory.abstractfactory.pizza

import factory.abstractfactory.factory.IngredientFactory

class CheesePizza(
    private val ingredientFactory: IngredientFactory
) : Pizza() {


    override fun prepare() {
        println("Preparing $name")
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
    }
}