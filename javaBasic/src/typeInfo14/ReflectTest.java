/**
 * 
 */
package typeInfo14;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**   
 * @ClassName:  ReflectTest   
 * @Description:TODO(������һ�仰��������������)   
 * @author: zhengqiang
 * @date:   2018��3��30�� ����10:57:12
 */
class Student{
	private int id;
	private String name;
	private double weight;
	public String sex;
	
	public Student(){
		
	}
	public Student(String n){
		this.name=n;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString(){
		return "(id:"+id+",name:"+name+",weight:"+weight+")";
	}
	public void addStringToName(String n){
		System.out.println("name="+name+n);
	}
}
public class ReflectTest {

	/**
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException    
	 * @Title: main   
	 * @Description: TODO(������һ�仰�����������������)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		
		Student s=new Student();
		System.out.println("-------------------��һ�����Class����-------------------- ");
		System.out.println("s.getClass(): "+s.getClass());
		System.out.println("Student.class:"+Student.class);
		System.out.println("Class.forName():"+Class.forName("typeInfo14.Student"));
		
		System.out.println("-------------------����������ʵ��-------------------- ");
		Object o1=s.getClass().newInstance();
		Constructor<Student> c=Student.class.getConstructor(String.class);
		Object o2=c.newInstance("henan");
		System.out.println("s.getClass().newInstance():"+o1.toString());
		System.out.println("Student.class.getConstructor(String.class):"+o2.toString());
		
		System.out.println("-------------------(��)��ȡ����-------------------- ");
        Method method = s.getClass().getMethod("toString");
        //getMethods()������ȡ�����з���
        System.out.println("----------------------��1��getMethods��ȡ�ķ�����---------------------");
        Method[] methods = s.getClass().getMethods();
        for(Method m:methods)
            System.out.println(m);
        //getDeclaredMethods()������ȡ�����з���
        System.out.println("-----------------------��2��getDeclaredMethods��ȡ�ķ���----------------------��");
        Method[] declaredMethods = s.getClass().getDeclaredMethods();
        for(Method m:declaredMethods)
            System.out.println(m);
        System.out.println("-------------------���ģ���ȡ��ĳ�Ա�������ֶΣ���Ϣ----------------------��");
        Field[] filed=s.getClass().getFields();
        for(Field m:filed)
            System.out.println(m.toString());
        System.out.println("-------------------���壩���÷���----------------------��");
        System.out.println(s.getClass().getMethod("toString").invoke(s.getClass().newInstance()));
        System.out.println(s.getClass().getMethod("addStringToName",String.class).invoke(s.getClass().newInstance(),"i am added"));
        
        
	}

}
