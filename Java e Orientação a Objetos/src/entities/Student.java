package entities;

public class Student {

	public String name;
	public double grade1, grade2, grade3;

	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}

	public double result() {
		if (finalGrade() < 60.0) {
			return 60.0 - finalGrade();
		} else {
			return 0.0;
		}
	}
}
