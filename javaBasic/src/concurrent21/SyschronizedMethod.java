/**
 * 
 */
package concurrent21;

/**   
 * @ClassName:  SyschronizedMethod   
 * @Description:TODO(������һ�仰��������������)   
 * @author: zhengqiang
 * @date:   2018��3��25�� ����10:05:28
 */
public class SyschronizedMethod {

	/**   
	 * @Title: main   
	 * @Description: TODO(������һ�仰�����������������)   
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
