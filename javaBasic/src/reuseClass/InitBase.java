/**
 * 
 */
package reuseClass;

/**   
 * @ClassName:  InitBase   
 * @Description:TODO(������һ�仰��������������)   
 * @author: zhengqiang
 * @date:   2017��12��28�� ����3:24:14
 */
//������������캯������ô��ʹ���Ĭ�ϲ��������Ĺ��캯������������ˣ���ô����������Ϊ����Ҫ��ȥ�����ˡ�
class Base{
	Base(int i){
		System.out.println("Base construct");
	}
}
public class InitBase extends Base{

	/**   
	 * @Title: main   
	 * @Description: TODO(������һ�仰�����������������)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	InitBase(int i){
		super(i);//��������ù��캯������ô�������ͻ��Ҳ���Ĭ�ϵĹ��캯��
		System.out.println("kid's construct");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InitBase b=new InitBase(1);
	}

}
