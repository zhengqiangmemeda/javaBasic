/**
 * 
 */
package interface9;

/**   
 * @ClassName:  FinalInInterface   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: zhengqiang
 * @date:   2017年12月30日 下午4:41:23
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
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CC c = new CC();
	}

}
