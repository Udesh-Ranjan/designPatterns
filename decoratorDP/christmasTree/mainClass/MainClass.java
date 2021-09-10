package decoratorDP.christmasTree.mainClass;

import decoratorDP.christmasTree.ChristmasTree;
import decoratorDP.christmasTree.decorator.TreeDecorator;
import decoratorDP.christmasTree.decorator.Garland;
import decoratorDP.christmasTree.decorator.BubbleLights;
import decoratorDP.christmasTree.ChristmasTreeImpl;

import static java.lang.System.out;

public class MainClass{
       public static void main(String $[]){
	       ChristmasTree tree=new Garland(new ChristmasTreeImpl());
	       out.println(tree.decorate());
	       tree=new BubbleLights(tree);
	       out.println(tree.decorate());
       }	       
}
