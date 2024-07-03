package methodReference;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class StaticMethodReferencesDemo {
	
	public static int add(int a, int b){
		return a+b;
	}
	
	public static int supplierTest(){
		return 10;
	}

	
	public static void main(String[] args) {
		
		//lambas expression
		Function<Integer, Double> function =  (Integer a)-> Math.sqrt(a);
        System.out.println(function.apply(10));
        //method refernce
        Function<Integer, Double> function1 =  Math::sqrt;
        System.out.println(function1.apply(10));
        
        BiFunction<Integer, Integer, Integer> bifn = (a,b)-> StaticMethodReferencesDemo.add(a, b);
        System.out.println(bifn.apply(10,20));
        //static refrence
        BiFunction<Integer, Integer, Integer> bifn1 = StaticMethodReferencesDemo::add;
        System.out.println(bifn1.apply(10,20));
        
        /*Consumer<Integer> con = (a)-> System.out.println(a*a);
        con.accept(10);*/
        
       /* Supplier<Integer> sup = ()-> StaticMethodReferencesDemo.supplierTest();
        System.out.println(sup.get());*/
	}

}
