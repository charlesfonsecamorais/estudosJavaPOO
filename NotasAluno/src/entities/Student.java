package entities;

public class Student {
	public String name;
	public Double note1, note2, note3;
	
	public Double finalGrade() {
		return note1 + note2 + note3;
	}
}
