/**
 * 
 */
package javaCases;

/**   
 * @ClassName:  ObjectDemo   
 * @Description:TODO(������һ�仰��������������)   
 * @author: zhengqiang
 * @date:   2017��12��26�� ����10:34:43
 */

class Person {
    String name = "No name";
    public Person(String nm) {
        name = nm;
    }
}
class Employee extends Person {
    String empID = "0000";
    public Employee(String id) {
    	super("No name");
        empID = id;
    }
}
public class ObjectDemo {
    public static void main(String args[]) {
        Employee e = new Employee("123");
        System.out.println(e.empID);
    }
}
