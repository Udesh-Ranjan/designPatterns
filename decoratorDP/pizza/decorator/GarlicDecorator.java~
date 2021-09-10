package decoratorDP.pizza.decorator;

import decoratorDP.pizza.Pizza;

public class GarlicDecorator extends PizzaDecorator{
	public class GarlicDecorator(Pizza pizza){
		super(pizza);
		this.cost=30;
		this.description="GarlicPizza";
	}
	@Override
	public double getCost(){
		return cost+pizza.getCost();
	}
	@Override
	public String getDescription(){
		return pizza.getDescription()+","+description;
	}
}
