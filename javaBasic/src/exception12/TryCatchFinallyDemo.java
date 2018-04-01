/**
 * 
 */
package exception12;

/**   
 * @ClassName:  TryCatchFinallyDemo   
 * @Description:TODO(������һ�仰��������������)   
 * @author: zhengqiang
 * @date:   2018��4��1�� ����2:15:29
 */
public class TryCatchFinallyDemo {

	/**
	 * 
	 * @Title: beforeFinally   
	 * @Description: �ӽ���Ͽ���ò��`finally` ����������`return` ֮��ִ�еģ���ʵ��Ȼ��ʵ����`finally` 
	 * ������������`return` ֮ǰִ�еġ���ô�������ˣ���Ȼ����֮ǰִ�У���Ϊʲô`a` ��ֵû�б������ˣ�
	 * ʵ�ʹ����������ģ�������ִ�е�try{}����е�return����ʱ���������ôһ���£���Ҫ���صĽ���洢��һ��
	 * ��ʱջ�У�Ȼ����򲻻��������أ�����ȥִ��finally{}�еĳ��� ��ִ��`a = 2`ʱ����������Ǹ�����a��ֵ��
	 * ������ȥ������ʱջ�е��Ǹ�Ҫ���ص�ֵ ��ִ����֮�󣬾ͻ�֪ͨ������finally�ĳ���ִ����ϣ��������󷵻��ˡ���
	 * ��ʱ���ͻὫ��ʱջ�е�ֵȡ�������ء�����Ӧ������ˣ�Ҫ���ص�ֵ�Ǳ�������ʱջ�еġ�  
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	public static int beforeFinally1(){
		int a=1;
		try{
			a=2;
			return a;
		}finally{
			a=3;
		}
	}
	/**
	 * 
	 * @Title: beforeFinally2   
	 * @Description: �����finally{}��Ҳ��һ��return����ô��ִ�����returnʱ���ͻ������ʱջ�е�ֵ��
	 * ͬ������ִ����finally֮�󣬾ͻ�֪ͨ���������󷵻��ˣ�������ʱջ�е�ֵȡ�������ء��ʷ���ֵ��2. 
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	@SuppressWarnings("finally")
	public static int beforeFinally2(){
		int a=1;
		try{
			a=2;
			return a;
		}finally{
			a=3;
			return a;
		}
	}
	/**   
	 * @Title: main   
	 * @Description: TODO(������һ�仰�����������������)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(beforeFinally1());
		System.out.println(beforeFinally2());
	}

}
