/**
 * 
 */
package polymorphic8;

/**   
 * @ClassName:  UpwardTransition   
 * @Description:TODO(������һ�仰��������������)   
 * @author: zhengqiang
 * @date:   2017��12��29�� ����9:52:45
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
	 * @Description: TODO(������һ�仰�����������������)   
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
