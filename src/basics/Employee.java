package basics;

/**
 * Created by ipseeta on 6/7/17.
 */
public class Employee {
    private int id;
    private String name;
    private String designation;
    private int age;

    public Employee(int id, String name, String designation, int age) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.age = age;
    }

    public Employee(Employee employee){
        this.id = employee.id;
        this.name = employee.name;
        this.designation = employee.designation;
        this.age = employee.age;
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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", age=" + age +
                '}';
    }
}
