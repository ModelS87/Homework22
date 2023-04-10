import java.util.HashMap;

public class EmployeeBook {
    private final Map<String,Employee> employees;
    public Employee(){
        employees = new HashMap<>();
    }
    private String getKey(Employee employee) {
        return employee.getName() + " " + employee.gerSurname;
}
