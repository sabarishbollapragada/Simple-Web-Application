package pojo;


public class Student {
	
	String name;
	String dept;
	int id;
	String degree;
	int credits_scored;
	int credits_required;
	
	public Student() {
		super();
	}

	public Student(String name, String dept, int id, String degree, int credits_scored, int credits_required) {
		super();
		this.name = name;
		this.dept = dept;
		this.id = id;
		this.degree = degree;
		this.credits_scored = credits_scored;
		this.credits_required = credits_required;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public int getCredits_scored() {
		return credits_scored;
	}

	public void setCredits_scored(int credits_scored) {
		this.credits_scored = credits_scored;
	}

	public int getCredits_required() {
		return credits_required;
	}

	public void setCredits_required(int credits_required) {
		this.credits_required = credits_required;
	}
	

}
