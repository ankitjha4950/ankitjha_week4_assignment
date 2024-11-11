import java.util.ArrayList;

 class StudentManager {
     ArrayList<String> students;

     StudentManager() {
        students = new ArrayList<>();
    }

    // Method to add a student
    public void addStudent(String name) {
        students.add(name);
        System.out.println(name + " has been added.");
    }

    // Method to remove a student
    public void removeStudent(String name) {
        if (students.remove(name)) {
            System.out.println(name + " has been removed.");
        } else {
            System.out.println(name + " not found.");
        }
    }

    // Method to display all students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the list.");
        } else {
            System.out.println("List of students:");
            for (String student : students) {
                System.out.println("- " + student);
            }
        }
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        // Adding students
        manager.addStudent("Ankit");
        manager.addStudent("Surbhi");

        // Displaying students
        manager.displayStudents();

        // Removing a student
        manager.removeStudent("Ankit");

        // Displaying students again
        manager.displayStudents();
    }
}

