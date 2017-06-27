import java.util.Date;
public class BookStoreTest {

	public static void main(String[] args) {
		
		Date date1 = new Date(2016, 11, 16);
		Date date2 = new Date(2016, 10, 12);
		
		Author author1 = new Author("Jonah", "Berg", "El Paso");
		Author author2 = new Author("Rosa", "Berg", "El Paso");
		
		Publisher pub = new Publisher("Times Publishing Company", "123 E Main Street, Bloomington, IL");
		
		Book book1 = new Book(author1, "Perfect");
		Book book2 = new Book(author2, "Harry Potter");
		
		Magazine mag1 = new Magazine(author1, "Drivers Digest", pub);
		Magazine mag2 = new Magazine(author2, "Time", pub);
		
		ElectronicBook electBook1 = new ElectronicBook(author1, "The Longest Winter", date1);
		ElectronicBook electBook2 = new ElectronicBook(author2, "Killing Lincoln", date2);
		
		Book[] books = {book1, book2, mag1, mag2, electBook1, electBook2};
		
		//loop for calculating price
		for (Book book : books){
			System.out.printf("%s costs $%.2f\n", book.getTitle(), book.calculatePrice());
		}
		
		System.out.println("");
		//loop for printing each books toString method
		for (Book book : books){
			System.out.println(book);
		}
	}
}
