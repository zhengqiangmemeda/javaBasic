/**
 * 
 */
package javaCases;

/**   
 * @ClassName:  ObjectDemo   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: zhengqiang
 * @date:   2017年12月26日 上午10:34:43
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
