package spring;

public class StudentService {

	private SchoolService sc;

	public void doRegister() {

		System.out.println("I'm intrested to registar on fall semester");
		sc.admision();
	}

	public SchoolService getSc() {
		return sc;
	}

	public void setSc(SchoolService sc) {
		this.sc = sc;
		
	}

}
