/**
 * 
 */
package innerClass;

/**   
 * @ClassName:  Ex3   
 * @Description:TODO(������һ�仰��������������)   
 * @author: zhengqiang
 * @date:   2018��1��11�� ����10:32:50
 */
public class Ex3 {

	/**   
	 * @Title: main   
	 * @Description: TODO(������һ�仰�����������������)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	private String s;
	Ex3(){
		s="love";
	}
	
	class Inner{
		Inner(){
			System.out.println("Inner()");
		}
		
		public String toString(){
			System.out.println(s);
			return s;
		}
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inner o=new Ex3().new Inner();
		o.toString();
	}

}
