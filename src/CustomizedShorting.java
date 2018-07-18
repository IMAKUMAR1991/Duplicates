import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {

	private String name;
	private int roll;

	public Student(String name, int roll) {
		this.name = name;
		this.roll = roll;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String toString() {
		return name + "...." + roll;
	}
}

public class CustomizedShorting {

	public static void main(String[] args) {
		List<Student> person = new ArrayList<Student>();
		person.add(new Student("ANAND", 1));
		person.add(new Student("Xbk", 1));
		person.add(new Student("ZANwND", 1));
		person.add(new Student("YNAND", 1));
		person.add(new Student("YNAND", 1));
		person.add(new Student("EANAND", 1));
		person.add(new Student("MANAND", 1));
		Integer i1 = 45;
		person.add(new Student("Rahul", i1));

		Collections.sort(person, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				// TODO Auto-generated method stub
				return s1.getName().compareTo(s2.getName());
			}

		});
		System.out.println(person);

	}
}
