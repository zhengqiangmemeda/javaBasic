/**
 * 
 */
package polymorphic8;

/**   
 * @ClassName:  ConstructorOrder   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: zhengqiang
 * @date:   2017年12月29日 下午2:49:53
 */

class Meal{
	Meal(){
		System.out.println("Meal..");
	};
}

class Bread{
	Bread(){
		System.out.println("Bread..");
	};
}

class Cheese{
	Cheese(){
		System.out.println("Cheese..");
	};
}

class Lettuce{
	Lettuce(){
		System.out.println("Lettuce..");
	};
}

class Lunch extends Meal{
	Lunch(){
		System.out.println("Lunch..");
	};
}

class PorttableLunch extends Lunch{
	PorttableLunch(){
		System.out.println("PorttableLunch..");
	};
}

public class ConstructorOrder extends PorttableLunch{

	/**   
	 * @Title: main   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	private static Bread b=new Bread();
	private Cheese c=new Cheese();
	
	ConstructorOrder(){
		System.out.println("ConstructorOrder..");
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ConstructorOrder();
	}

}
