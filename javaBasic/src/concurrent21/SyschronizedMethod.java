/**
 * 
 */
package concurrent21;

/**   
 * @ClassName:  SyschronizedMethod   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: zhengqiang
 * @date:   2018年3月25日 上午10:05:28
 */
public class SyschronizedMethod {

	/**   
	 * @Title: main   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	private int count=0;
	public void increase(){
		count++;
	}
	public void decrease(){
		count--;
	}
	public int getCount(){
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
