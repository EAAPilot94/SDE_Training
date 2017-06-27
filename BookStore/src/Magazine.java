
public class Magazine extends Book implements BookStore{
	
	private Publisher publisher;
	
	public Magazine(Author author, String title, Publisher publisher){
		super(author, title);
		this.publisher = publisher;
	}
	
	public Publisher getPublisher(){
		return publisher;
	}
	
	public String transmit(){
		return "";
	}
	
	public double calculatePrice(){
		return ((double) getAuthor().getFirstName().length() + (double) getAuthor().getLastName().length()) * 12;
	}
	
	@Override
	public String toString(){
		return "The magazine's author is " + getAuthor() + " and the title is " + getTitle() 
			+ " and the publisher is " + getPublisher();
	}
}
