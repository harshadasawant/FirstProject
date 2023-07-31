public class Employee {
   private int empId;
    private String name;

    public Employee(int empId,String name){
        this.empId = empId;
        this.name = name;
        System.out.println("hello i am called from constructor");
    }


    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee e1 = new Employee(5,"Manisha");

//        e1.empId=7;
//        e1.name="Manisha";
//        e1.setEmpId(7);
//        e1.setName("Manisha");
        System.out.println(e1.getEmpId());
        System.out.println(e1.getName());
    }
}
