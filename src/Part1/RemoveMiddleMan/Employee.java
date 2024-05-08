package Part1.RemoveMiddleMan;

public class Employee {
    private String name;
    private Department department;

    // Конструктор та інші методи класу...

    public String getDepartmentManagerName() {
        return department.getManagerName();
    }

    public String getName() {
        return name;
    }
}