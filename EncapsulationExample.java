import java.util.Scanner;

public class EncapsulationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee id :");

        Employee emp = new Employee();

        System.out.println("Enter the id");
        emp.setId(sc.nextInt());

        System.out.println("Enter the name");
        emp.setName(sc.next());

        System.out.println("Enter the Salary");
        emp.setSalary(sc.nextInt());

  System.out.println("Employee name  :"+ emp.getName() );
  System.out.println("Employee id  :"+" "+ emp.getId());
  System.out.println(" Employee salary  :"+ emp.getSalary());
    }
}

class Employee {
    private int id;
    private String name;
    private int salary;

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
