package com.app.how.stack;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import static com.app.how.stack.examples.GenericStackUsingArraysExample.genericStackExample;
import static com.app.how.stack.examples.GenericStackUsingLinkedListsExample.genericStackUsingLinkedListsExample;
import static com.app.how.stack.examples.SimpleIntegerStackUsingArrays.simpleIntegerStackExample;
import static com.app.how.stack.examples.SimpleStackUsingLinkedListExample.simpleStackUsingLinkedListExample;
import static com.app.how.stack.examples.SimpleStringStackUsingArrays.simpleStringStackExample;

public class HandsOnWithDsaStacksApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HandsOnWithDsaStacksApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String featureEnabled = args[0];

		if (featureEnabled.equalsIgnoreCase("all")) {

			/* Chapter-1 : Simple String Stack Implementation */
			simpleStringStackExample();

			/* Chapter-1 : Simple Integer Stack Implementation */
			simpleIntegerStackExample();

			/* Chapter-3 : Generic Stack Implementation */
			genericStackExample();

			/* Chapter-4 : Stack Implementation using Linked Lists */
			simpleStackUsingLinkedListExample();

		} else {

			/* Chapter-4 : Generic Stack Implementation using Linked Lists */
			genericStackUsingLinkedListsExample();
			
		}
	}
}