/**
 * 
 */
package innerClass;

/**   
 * @ClassName:  Ex3   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: zhengqiang
 * @date:   2018年1月11日 上午10:32:50
 */
public class Ex3 {

	/**   
	 * @Title: main   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
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
