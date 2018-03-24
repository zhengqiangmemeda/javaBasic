/**
 * 
 */
package interface9;

/**   
 * @ClassName:  Ex4   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: zhengqiang
 * @date:   2017年12月30日 上午9:52:08
 */

abstract class Father{	
}

abstract class Father2{	
	protected abstract void print();
}

class Kid extends Father{
	protected void print(){
		System.out.println("print() of Kid");
	}
}

class Kid2 extends Father2{
	protected void print(){
		System.out.println("print() of Kid2");
	}
}

public class Ex4 {

	/**   
	 * @Title: main   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	public static void testPrint(Father f){
		((Kid)f).print();
		
	}
	public static void testPrint2(Father2 f2){
		f2.print();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex4.testPrint(new Kid());
		Ex4.testPrint2(new Kid2());
	}

}
