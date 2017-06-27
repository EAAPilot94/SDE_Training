
public class Book implements BookStore{
	
	private Author author;
	private String title;
	
	public Book(Author author, String title){
		this.author = author;
		this.title = title;
	}
	
	public Author getAuthor(){
		return author;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String transmit(){
		return "";
	}
	
	public double calculatePrice(){
		return (double) getAuthor().getFirstName().length() + (double) getAuthor().getLastName().length();
	}
	
	@Override
	public String toString(){
		return "The book's author is " + getAuthor() + " and the title is " + getTitle();
	}
}
