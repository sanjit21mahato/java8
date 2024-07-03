package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortListOfObjectbyMultipleFields_5 {

	public static void main(String[] args) {

		List<Person> people = getPeople();
		
		
		List<Person> sortedPeople1 =people.stream().
				sorted(Comparator.comparing(Person::getAge).
				thenComparing(Person::getGender)).collect(Collectors.toList());
		sortedPeople1.forEach(System.out::println);
	
		
	}
	
private static List<Person> getPeople() {
		
		List<Person> listPerson = new ArrayList<Person>();
		listPerson.add(new Person("Ayush", 20, Gender.MALE));
		listPerson.add(new Person("Ranju", 33, Gender.FEMALE));
		listPerson.add(new Person("Suresh", 10, Gender.MALE));
		listPerson.add(new Person("Kriti", 40, Gender.FEMALE));
		listPerson.add(new Person("Mahesh", 60, Gender.MALE));
		return listPerson;
	}


}


