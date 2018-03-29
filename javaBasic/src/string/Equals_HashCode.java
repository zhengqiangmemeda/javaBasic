/**
 * 
 */
package string;

/**   
 * @ClassName:  Equals_HashCode   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: zhengqiang
 * @date:   2018年3月26日 上午11:05:20
 */
public class Equals_HashCode {

	/**   
	 * @Title: main   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	public void testHashCode(String s){
		System.out.println("HashCode is: "+s.hashCode());
	}
	public static void main(String[] args) {
		Equals_HashCode eq=new Equals_HashCode();
		eq.testHashCode("ab");
		char c='a';
		System.out.println(c-'0');
		// TODO Auto-generated method stub
		/*
		String s1="abcdefg";
		String s2="abcdefg";
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		*/
		
	}

}
