package com.tchoko.java.revision.JavaRevision;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.tchoko.java.revision.JavaRevision.model.Developer;

public class App {

	public static void main(String[] args) {
		List<Developer> developers = getDevelopers();
		
		developers.stream().filter(d -> d.getName().contains("n")).map(Developer::getSalary).forEach(System.out::println);
		
	}

	private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
		result.add(new Developer("alvin", new BigDecimal("80000"), 20));
		result.add(new Developer("jason", new BigDecimal("100000"), 10));
		result.add(new Developer("iris", new BigDecimal("170000"), 55));

		return result;

	}
}
