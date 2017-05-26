/*
 * Copyright 2012-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package example.cassandratest;

import com.datastax.driver.core.utils.UUIDs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleCassandraApplication implements CommandLineRunner {

	@Autowired
	private CustomerRepository repository;

	@Override
	public void run(String... args) throws Exception {
		//this.repository.deleteAll();

		// save a couple of customers
		this.repository.save(new Customer(UUIDs.timeBased(), "Aliceq", "Smithy"));
		this.repository.save(new Customer(UUIDs.timeBased(), "Boby", "Smithy"));

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Customer customer : this.repository.findAll()) {
			System.out.println(customer);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Customer found with findByFirstName('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(this.repository.findByFirstName("Aliceq"));

		System.out.println("Customers found with findByLastName('Smith'):");
		System.out.println("--------------------------------");
		for (Customer customer : this.repository.findByLastName("Smithy")) {
			System.out.println(customer);
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(SampleCassandraApplication.class, args);
	}

}