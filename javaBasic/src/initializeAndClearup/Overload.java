/**
 * 
 */
package initializeAndClearup;


/**   
 * @ClassName:  Overload   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: zhengqiang
 * @date:   2017年12月26日 下午10:02:46
 */
public class Overload {

	/**   
	 * @Title: main   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	Overload(int i){
		a=i;
	}
	
	int a;
	
	public Overload plus(){
		
		a++;
		return this;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overload ol=new Overload(2);;
		System.out.println(ol.plus().a);

	}

}
