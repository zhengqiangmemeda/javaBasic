/**
 * 
 */
package concurrent21;

/**   
 * @ClassName:  MoreBasicThread   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: zhengqiang
 * @date:   2018年1月25日 上午10:21:54
 */

class LiftOff implements Runnable{

	private int countDown=10;
	private static int taskCount=0;
	private final int id=taskCount++;
	
	LiftOff(){}
	LiftOff(int countDown){
		this.countDown=countDown;
	}
	
	public String status(){
		if(countDown>0)
			return "#"+id+"("+countDown+").";
		else
			return "LiftOff.";
	}
	public void run() {
		// TODO Auto-generated method stub
		while(countDown-->0){
			System.out.print(status());
			Thread.yield();
		}
		System.out.println();	
	}
	
}
public class MoreBasicThread {

	/**   
	 * @Title: main   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LiftOff l=new LiftOff();
		//l.run();
		for(int i=0;i<5;i++)
			new Thread(new LiftOff()).start();
		System.out.println("I am main()");

	}

}
