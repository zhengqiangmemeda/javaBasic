/**
 * 
 */
package string;

/**   
 * @ClassName:  Equals_HashCode   
 * @Description:TODO(������һ�仰��������������)   
 * @author: zhengqiang
 * @date:   2018��3��26�� ����11:05:20
 */
public class Equals_HashCode {

	/**   
	 * @Title: main   
	 * @Description: TODO(������һ�仰�����������������)   
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
