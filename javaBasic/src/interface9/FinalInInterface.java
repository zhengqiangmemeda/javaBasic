/**
 * 
 */
package interface9;

/**   
 * @ClassName:  FinalInInterface   
 * @Description:TODO(������һ�仰��������������)   
 * @author: zhengqiang
 * @date:   2017��12��30�� ����4:41:23
 */

class AA{
	AA(){System.out.println("AA()");}
}

interface BB{
	public static final AA a=new AA();
	
}

class CC implements BB{
	CC(){System.out.println("CC()");}
}
public class FinalInInterface {

	/**   
	 * @Title: main   
	 * @Description: TODO(������һ�仰�����������������)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CC c = new CC();
	}

}
