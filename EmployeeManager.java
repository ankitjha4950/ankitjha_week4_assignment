import java.util.HashMap;


public class EmployeeManager {
     HashMap<Integer, String> employees;

    public EmployeeManager(){
        employees = new  HashMap<>();
    }

    public void addEmployee(int ID, String name){
        employees.put(ID, name);
        System.out.println("Employee " + name + " with ID " + ID + " has been added");
    }

    //Method to get a name of employees by there id
    public String getEmployee(int ID){
        if (employees.containsKey(ID)) {
            return "Employee with ID " + ID + " is " + employees.get(ID);
        } else {
            return "Id not found";
        }
    }

    public void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees in the list.");
        } else {
            System.out.println("Employee List:");
            for (Integer ID : employees.keySet()) {
                System.out.println("ID: " + ID + ", Name: " + employees.get(ID));
            }
        }
    }

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        manager.addEmployee(204, "Ankit");
        manager.addEmployee(205, "Surbhi");
        System.out.println(manager.getEmployee(204));

        manager.displayAllEmployees();
        
    }
}
