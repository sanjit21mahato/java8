package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountStream_9 {

	public static void main(String[] args) {

    List<String> list = Arrays.asList("Sanjit", "Ranjit","Anjit");
    long count = list.stream().count();
    System.out.println(count);
    
    List<Person> peopleList = getPeople();
    
   // long countOfPeople = peopleList.stream().count();
    Long noOfElements = peopleList.stream()
        .collect(Collectors.counting());
    System.out.println("Total elements : " + noOfElements);

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
