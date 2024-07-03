package stream;

import java.util.ArrayList;
import java.util.List;

public class MatchingExamples_4 {

	public static void main(String[] args) {
		List<Person> people = getPeople();
		
		//any match
		
		boolean anymatch =people.stream().anyMatch(p->p.getName().equalsIgnoreCase("Lamesh"));
		System.out.println(anymatch);
		//allmatch
		boolean allmatch =people.stream().allMatch(p->p.getAge()<40);
		System.out.println(allmatch);
		//NoneMatch
		boolean nonematch =people.stream().noneMatch(p->p.getAge()>40);
		System.out.println(nonematch);
	}
	
	private static List<Person> getPeople() {
		
		List<Person> listPerson = new ArrayList<Person>();
		listPerson.add(new Person("Ayush", 20, Gender.MALE));
		listPerson.add(new Person("Ramesh", 33, Gender.FEMALE));
		listPerson.add(new Person("Suresh", 20, Gender.MALE));
		listPerson.add(new Person("Kriti", 20, Gender.FEMALE));
		listPerson.add(new Person("Mahesh", 20, Gender.MALE));
		return listPerson;
	}

}

enum Gender{
	MALE,FEMALE;
}
class Person {

    private final String name;
    private final int age;
    private final Gender gender;

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + ", gender=" + gender + '}';
    }
}
