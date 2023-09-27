package com.graphql.learn.graphqlproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.graphql.learn.graphqlproject.entities.Book;
import com.graphql.learn.graphqlproject.services.BookService;

@SpringBootApplication(scanBasePackages = {
	"com.graphql.learn.graphqlproject"
})
public class GraphqlProjectApplication implements CommandLineRunner {

	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(GraphqlProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Book b1 = new Book();
		b1.setTitle("Complete Reference");
		b1.setDesc("For learning Java");
		b1.setPages(2000);
		b1.setPrice(5000);
		b1.setAuthor("Deepak");
		Book b2 = new Book();
		b2.setTitle("Head first to Spring");
		b2.setDesc("For learning Spring in Java");
		b2.setPages(2000);
		b2.setPrice(5000);
		b2.setAuthor("Deepak");
		Book b3 = new Book();
		b3.setTitle("Head first to Hibernate");
		b3.setDesc("For learning Hibernate in Java");
		b3.setPages(2000);
		b3.setPrice(5000);
		b3.setAuthor("Deepak");
		this.bookService.create(b1);
		this.bookService.create(b2);
		this.bookService.create(b3);

	}

}
