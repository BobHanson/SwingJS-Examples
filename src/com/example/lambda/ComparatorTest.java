package com.example.lambda;

import java.util.Collections;
import java.util.List;
import java.util.Comparator;

/**
 * @author MikeW
 */
public class ComparatorTest {

  public static void main(String[] args) {
   
    List<Person> personList = Person.createShortList();
  
    
    // Sort with Inner Class
    System.out.println("=== Sorted Asc SurName ==="); 
    Collections.sort(personList, new Comparator<Person>(){
      public int compare(Person p1, Person p2){
        return p1.getSurName().compareTo(p2.getSurName());
      }
    });
    
    for(Person p:personList){
      p.printName();
    }
    
    // Use Lambda instead   
    System.out.println("=== Sorted Asc SurName ===");
    Collections.sort(personList, (Person p1, Person p2) -> p1.getSurName().compareTo(p2.getSurName()));

    for(Person p:personList){
      p.printName();
    }
   
    System.out.println("=== Sorted Desc SurName ===");
    Collections.sort(personList, (p1,  p2) -> {return p2.getSurName().compareTo(p1.getSurName());});

    for(Person p:personList){
      p.printName();
    }

    System.out.println("=== OK ===");

  }
}