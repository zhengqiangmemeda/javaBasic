/**
 * 
 */
package polymorphic8;

/**   
 * @ClassName:  ConstructorOrder   
 * @Description:TODO(������һ�仰��������������)   
 * @author: zhengqiang
 * @date:   2017��12��29�� ����2:49:53
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
	 * @Description: TODO(������һ�仰�����������������)   
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
