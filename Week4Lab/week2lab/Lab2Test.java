import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Lab2Test {
	
	@Test
	public void testAuthor(){
		Author author = new Author("Jonah", "Berg", "El Paso");
		assertEquals("Test first name", "Jonah", author.getFirstName());
		assertEquals("Test last name", "Berg", author.getLastName());
		assertEquals("Test city", "El Paso", author.getCity());
		author.setCity("Gridley");
		assertEquals("Test new city", "Gridley", author.getCity());
		assertEquals("Test to string", "Jonah Berg is from Gridley", 
				author.getFirstName() + " " + author.getLastName() + " is from " + author.getCity());
	}
	
	@Test
	public void testBook(){
		Author author1 = new Author("Jonah", "Berg", "El Paso");
		Book book1 = new Book(author1, "Titanic");
		assertEquals("Test get author", "Jonah Berg is from El Paso", book1.getAuthor().toString());
		assertEquals("Test get title", "Titanic", book1.getTitle());
		assertEquals("Test transmitted", "", book1.transmit());
		assertEquals(9, book1.calculatePrice(), 0);
		assertEquals("Testing book to string", "The book's author is Jonah Berg and the title is Titanic", book1.toString());
	}
	
	@Test
	public void testMagazine(){
		Author author2 = new Author("Jonah", "Berg", "Bloomington");
		Publisher pub = new Publisher("ABC", "123 N Main");
		Magazine mag = new Magazine(author2, "Time", pub);
		assertEquals("Test get author", "Jonah Berg is from Bloomington", mag.getAuthor().toString());
		assertEquals("Test get publisher", "ABC is at 123 N Main", mag.getPublisher().toString());
		assertEquals("Test transmitted", "", mag.transmit());
		assertEquals("Test get title", "Time", mag.getTitle());
		assertEquals(108, mag.calculatePrice(), 0);
		assertEquals("Test to string", "The magazine's author is Jonah Berg and the title is Time " +
				"and the publisher is ABC", mag.toString());
	}
	
	@Test
	public void testPublisher(){
		Publisher pub2 = new Publisher("ABC", "123 N Main");
		pub2.setAddress("123 E Addison");
		assertEquals("Test get address", "123 E Addison", pub2.getAddress());
		assertEquals("Test to string", "ABC is at 123 E Addison", pub2.toString());
	}
	
	@Test
	public void testElectronicBook(){
		Date date = new Date();
		Author author4 = new Author("Jonah", "Berg", "El Paso");
		ElectronicBook eBook = new ElectronicBook(author4, "Crawl", date);
		assertEquals("Test get date sent", date, eBook.getDateSent());
		assertEquals("Test transmit", "Transmitted", eBook.transmit());
		assertEquals(1.0, eBook.calculatePrice(), 0);
		assertEquals("Test to string", "The electronic book's author is Jonah Berg and the title"
				+ " is Crawl and it was sent on " + date, eBook.toString());
	}
	
}