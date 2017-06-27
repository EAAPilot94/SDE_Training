import java.util.Date;

public class ElectronicBook extends Book implements BookStore{
	
	private Date dateSent;
	
	public ElectronicBook(Author author, String title, Date dateSent){
		super(author, title);
		this.dateSent = dateSent;
	}
	
	public Date getDateSent(){
		return dateSent;
	}
	
	public String transmit(){
		return "Transmitted";
	}
	
	public double calculatePrice(){
		return 1.0;
	}
	
	@Override
	public String toString(){
		return "The electronic book's author is " + getAuthor() + " and the title is " + getTitle() 
		+ " and it was sent on " + getDateSent();
	}
}
