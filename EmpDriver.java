public class EmpDriver {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.eid = 101;
        e1.ename = "gaurav";
        e1.sal = 20000;
        System.out.println("Employee id: "+ e1.eid);
        System.out.println("employee name: "+ e1.ename);
        System.out.println("Employee salary: "+ e1.sal);
        System.out.println("====================================");
        Employee e2 = new Employee();
        e2.eid = 102;
        e2.ename = "om";
        e2.sal = 30000;
        System.out.println("Employee id: "+ e2.eid);
        System.out.println("employee name: "+ e2.ename);
        System.out.println("Employee salary: "+ e2.sal);

    }
}
