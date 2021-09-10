package decoratorDP.christmasTree.decorator;

import decoratorDP.christmasTree.ChristmasTree;
import decoratorDP.christmasTree.decorator.TreeDecorator;

public class BubbleLights extends TreeDecorator{
	public BubbleLights(ChristmasTree tree){
		super(tree);
	}
	@Override
	public String decorate(){
		return super.decorate()+getBubbleLightsDecoration();
	}
	private String getBubbleLightsDecoration(){
		return " with bubble lights";
	}
}
