/**
 * 
 */
package innerClass;

/**   
 * @ClassName:  Ex1   
 * @Description:TODO(������һ�仰��������������)   
 * @author: zhengqiang
 * @date:   2017��12��30�� ����8:55:29
 */

public class Ex1 {

	/**   
	 * @Title: main   
	 * @Description: TODO(������һ�仰�����������������)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	class Inner{
		Inner(){
			System.out.println("Inner()");
		}
	}
	
	Ex1(){
		System.out.println("Ex1()");
	}
	
	public Inner returnInner(){return new Inner();}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1 o=new Ex1();
		Inner i =o.returnInner();
	}

}
