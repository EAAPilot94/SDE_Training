
public class Time2 {
	
	private int second; //total seconds since midnight, 86,400
	
	public Time2(){
		this(0, 0, 0);
	}
	
	public Time2(int hour){
		this(hour, 0, 0);
	}
	
	public Time2(int hour, int minute){
		this(hour, minute, 0);
	}
	
	public Time2(int hour, int minute, int second){
		
		if(hour < 0 || hour >= 24)
				throw new IllegalArgumentException("Hour must be between 0 and 23");
		
		if (minute < 0 || minute >= 60)
			throw new IllegalArgumentException("Minute must be between 0 and 59");
		
		if (second < 0 || second >= 60)
			throw new IllegalArgumentException("Second must be between 0 and 59");
		
		this.second = (hour * 60 * 60) + (minute * 60) + second; 
	}
	
	public Time2(Time2 time){
		this(time.getSecond());
	}
	
	public int getSecond(){
		return second;
	}
	
	public void setTime(int hour, int minute, int second){
		
		if(hour < 0 || hour >= 24)
			throw new IllegalArgumentException("Hour must be between 0 and 23");
	
		if (minute < 0 || minute >= 60)
			throw new IllegalArgumentException("Minute must be between 0 and 59");
		
		if (second < 0 || second >= 60)
			throw new IllegalArgumentException("Second must be between 0 and 59");
		
		this.second = (hour * 60 * 60) + (minute * 60) + second;
	}
}
