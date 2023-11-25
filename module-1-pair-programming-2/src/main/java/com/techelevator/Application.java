package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {
    private List<Department> departments = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();
    private Map<String, Project> projects = new HashMap<>();

    /**
     * The main entry point in the application
     *
     * @param args
     */
    public static void main(String[] args) {
        Application app = new Application(); app.run();
    }

    private void run() {
        // create some departments
        createDepartments();

        // print each department by name
        printDepartments();

        // create employees
        createEmployees();

        // give Angie a 10% raise, she is doing a great job!

        // print all employees
        printEmployees();

        // create the TEams project
        createTeamsProject();
        // create the Marketing Landing Page Project
        createLandingPageProject();

        // print each project name and the total number of employees on the project
        printProjectsReport();
    }

    /**
     * Create departments and add them to the collection of departments
     */
    private void createDepartments() {
        Department department = new Department("Marketing", 1);
        Department department1 = new Department("Sales", 2);
        Department department2 = new Department("Engineering", 3); departments.add(department);
        departments.add(department1); departments.add(department2);
    }

    /**
     * Print out each department in the collection.
     */
    private void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");
        for (Department d : departments) {
            System.out.println(d.getName());
        }
    }

    /**
     * Create employees and add them to the collection of employees
     */
    private void createEmployees() {
        Employee Dean = new Employee(); Dean.setFirstName("Dean"); Dean.setEmployeeId(1);
        Dean.setDepartment(departments.get(2)); Dean.setLastName("Johnson");
        Dean.setEmail("djohnson@teams.com"); Dean.setHireDate("08/21/2020"); employees.add(Dean);

        Employee Angie = new Employee(2, "Angie", "Smith", "asmith@teams.com", departments.get(2)
                , "08/21/2020");
        Angie.raiseSalary(10); employees.add(Angie);

        Employee Margaret = new Employee(0, "Margaret", "Thompson", "mthompson@teams.com",
                departments.get(0), "08/21/2020");
        employees.add(Margaret);
    }

    /**
     * Print out each employee in the collection.
     */
    private void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");
        for (Employee e : employees) {
            System.out.println(e.getFullName() + " " + e.getSalary() + " " + e.getDepartment());
        }
    }

    /**
     * Create the 'TEams' project.
     */
    private void createTeamsProject() {
        Project Team = new Project("TEams", "Project Management Software", "10/10/2020",
                "11/10" + "/2020");
        for (Employee e : employees) {
            if (e.getDepartment().getName().equals("Engineering")) {
                Team.addTeamMember(e);
            }
        } projects.put(Team.getName(), Team);
    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private void createLandingPageProject() {
        Project Marketing = new Project("Marketing Landing Page", "Lead Capture Landing Page for "
                + "Marketing", "10/10/2020", "10/17/2020");
        for (Employee e : employees) {
            if (e.getDepartment().getName().equals("Marketing")) {
                Marketing.addTeamMember(e);
            }
        } projects.put(Marketing.getName(), Marketing);
    }

    /**
     * Print out each project in the collection.
     */
    private void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");
        for (Map.Entry<String, Project> key : projects.entrySet()) {
            System.out.println(key.getKey() + ": " + key.getValue().getTeamMembers().size());
        }
    }
}
