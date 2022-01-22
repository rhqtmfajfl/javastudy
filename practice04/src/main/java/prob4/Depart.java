package prob4;


public class Depart extends Employee{
	private String department;
	
	Depart(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}
	
	@Override
	public void getInformation() {
		System.out.println( "이름:" + super.getName() + " 연봉:" + super.getSalary() + " 부서:" + department);
	}
}