/**
 * 
 */
package reuseClass;

/**   
 * @ClassName:  FinalDemo   
 * @Description:TODO(������һ�仰��������������)   
 * @author: zhengqiang
 * @date:   2017��12��28�� ����4:32:10
 */

class FinalFather{
	final void spin(){
		System.out.println("i am spin()");
	}
	void spin2(){
		System.out.println("i am spin()");
	}
}
public class FinalDemo extends FinalFather{

	/**   
	 * @Title: main   
	 * @Description: TODO(������һ�仰�����������������)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	public void FinalArgument(final FinalFather i){
		//i=new FinalFather();
	}
	public void FinalArgument2(FinalFather i){
		i=new FinalFather();
		i.spin();
	}
	
	//void spin(){ //can not override for it is a final method
		
	//}
	void spin2(){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalDemo f=new FinalDemo();
		f.FinalArgument2(new FinalFather());

	}

}
