/**
 * 
 */
package initializeAndClearup;


/**   
 * @ClassName:  Overload   
 * @Description:TODO(������һ�仰��������������)   
 * @author: zhengqiang
 * @date:   2017��12��26�� ����10:02:46
 */
public class Overload {

	/**   
	 * @Title: main   
	 * @Description: TODO(������һ�仰�����������������)   
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
