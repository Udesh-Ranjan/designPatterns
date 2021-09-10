package singletonDP;

import singletonDP.singleton.Singleton;
import singletonDP.singleton.BillPughSingleton;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MainClass{
	public MainClass(){}
	private MainClass(final int a,final float b,final String str){
		System.out.println("Mainclass instantiated");
		System.out.println(a);
		System.out.println(b);
		System.out.println(str);
	}
	public static void main(final String $[]){
		final Singleton singleton1=Singleton.getInstance();
		Singleton singleton2=Singleton.getInstance();
		System.out.println(singleton1);
		System.out.println(singleton2);
		///breaking it////
		Constructor[] constructors=Singleton.class.getDeclaredConstructors();
		try{
			for(final Constructor constructor: constructors){
				constructor.setAccessible(true);
				singleton2=(Singleton)constructor.newInstance();
				break;
			}
		}catch(InstantiationException | IllegalAccessException | InvocationTargetException exception){
			exception.printStackTrace();
		}
		System.out.println("singleton2 breaked : "+singleton2);
		try{
			Class mainClass=Class.forName("singletonDP.MainClass");
			System.out.println(mainClass.getName());
			constructors=mainClass.getDeclaredConstructors();
			for(Constructor constructor : constructors){
				System.out.println(constructor);
				System.out.println("is accessible : "+constructor.isAccessible());
				constructor.setAccessible(true);
				Class [] parameterTypes=constructor.getParameterTypes();
				System.out.println(parameterTypes);
				if(parameterTypes!=null){
					for(final Class parameter: parameterTypes){
						System.out.print(parameter+" ");
					}
					System.out.println();
					if(parameterTypes.length>1)
						constructor.newInstance(Integer.valueOf(1),Float.valueOf(2.2f),"Hello World");
				}
			}
		}catch(final ClassNotFoundException | InstantiationException | IllegalAccessException | InvocationTargetException exception){
			exception.printStackTrace();
		}
		//
		BillPughSingleton singleton;
		BillPughSingleton.getInstance();
	}
}
