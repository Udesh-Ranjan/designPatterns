package decoratorDP.mainClass;

import decoratorDP.pizza.*;
import decoratorDP.pizza.decorator.*;

public class MainClass{
	public static void main(String...$){
		Pizza pizza=new PaneerPizza();
		pizza=new TomatoDecorator(pizza);
		System.out.println(pizza.getCost());
		System.out.println(pizza.getDescription());
	}
}
