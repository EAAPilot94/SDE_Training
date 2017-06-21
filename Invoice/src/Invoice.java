
public class Invoice {
	
	private String partNumber;
	private String partDesc;
	private int quantity;
	private double price;
	
	public Invoice(String partNumber, String partDesc, int quantity, double price){
		this.partNumber = partNumber;
		this.partDesc = partDesc;
		this.quantity = quantity;
		this.price = price;
	}
	
	public void setPartNumber(String partnumber){
		this.partNumber = partNumber;
	}
	
	public String getPartNumber(){
		return partNumber;
	}
	
	public void setPartDesc(String partDesc){
		this.partDesc = partDesc;
	}
	
	public String getPartDesc(){
		return partDesc;
	}
	
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public double getPrice(){
		return price;
	}
	
	public double getInvoiceAmount(){
		return quantity * price;
	}
}
