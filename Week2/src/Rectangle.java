
public class Rectangle {
	
	double length = 1.0;
	double width = 1.0;
	
	public double getLength(){
		return length;
	}
	
	public void setLength(double length){
		if(length >= 0.0 && length <= 20.0)
			this.length = length;
	}
	
	public double getWidth(){
		return width;
	}
	
	public void setWidth(double width){
		if(width >= 0.0 && width <= 20.0)
			this.width = width;
	}
	
	public double calulatePerimiter(){
		return (width * 2) + (length * 2);
	}
}
