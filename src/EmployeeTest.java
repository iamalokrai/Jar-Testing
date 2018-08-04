import com.capgemini.employee.Employee;

//Class to test the Employee class importing jar file of employee class
public class EmployeeTest {

	public static void main(String[] args) {
		// Giving the value to the emp of type Employee
		Employee emp = new Employee(155326, "Alok", 17000.00);
		emp.disp(); // Calling display method

	}

}
