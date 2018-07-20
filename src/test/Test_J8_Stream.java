package test;

import java.util.Arrays;
import java.util.List;

public class Test_J8_Stream {

	public static void main(String[] args) {

		// http://www.javainuse.com/java/java8_method_References

		List<String> myList = Arrays.asList("b1", "a2", "a1", "c2", "c1");
		System.out.println("\n\n------- stream().map().forEach() using lambda expressions -------");
		myList.stream().map(s -> s.toUpperCase()).forEach(s -> System.out.print(s + " "));

		System.out.println("\n\n------- stream().map().sorted().forEach() using Class::method method reference --------");
		myList.stream().map(String::toUpperCase).sorted().forEach(System.out::print);

		// https://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/

		System.out.println("\n\n------- stream().filter().map().sorted().forEach() --------");
		myList.stream()
			.filter(s -> s.startsWith("c"))
			.map(String::toUpperCase)
			.sorted()
			.forEach(System.out::print);
		System.out.println("\n");

		System.out.println("Test_J8_Stream OK");
	}

}
