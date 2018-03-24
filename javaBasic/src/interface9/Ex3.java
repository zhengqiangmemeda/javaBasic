/**
 * 
 */
package interface9;

/**   
 * @ClassName:  AbstractClass   
 * @Description:TODO(������һ�仰��������������)   
 * @author: zhengqiang
 * @date:   2017��12��29�� ����5:10:36
 */

abstract class Dad{
	Dad(){
		print();
	}
	protected abstract void print();
}

class Son extends Dad{
	private int i=1;
	protected void print() {
		System.out.println("Son.i= "+ i);
	}
}

public class Ex3{
	/**   
	 * @Title: main   
	 * @Description: TODO(������һ�仰�����������������)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Process of initialization:
		* 1. Storage for Son s allocated and initialized to binary zero
		* 2. Dad() called
		* 3. Son.print() called in Dad() (s.i = 0)
		* 4. Member initializers called in order (s.i = 1)
		* 5. Body of Son() called
		*/
		Son s=new Son();
		s.print();
	}



}
