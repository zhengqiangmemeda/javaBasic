/**
 * 
 */
package polymorphic8;

/**   
 * @ClassName:  UpwardTransition   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: zhengqiang
 * @date:   2017年12月29日 上午9:52:45
 */

class Cycle{
	void ride(){
		System.out.println("Cycle ride()");
	}
}

class Unicycle extends Cycle{
	//void ride(){
	//	System.out.println("Unicycle ride()");
	//}
}

class Bicycle extends Cycle{
	void ride(){
		System.out.println("Bicycle ride()");
	}
}
public class UpwardTransition {

	/**   
	 * @Title: main   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cycle c=new Cycle();
		Cycle cu=new Unicycle();
		Cycle cb=new Bicycle();
		c.ride();
		cu.ride();
		cb.ride();
	}

}
