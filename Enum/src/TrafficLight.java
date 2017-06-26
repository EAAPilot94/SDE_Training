
public enum TrafficLight {
	
	RED(12),
	YELLOW(10),
	GREEN(40);
	
	private int duration;
	
	TrafficLight(int duration){
		this.duration = duration;
	}
	
	public int getDuration(){
		return this.duration;
	}

}
