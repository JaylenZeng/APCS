public class StatsDriver {
	public static void main(String[] args){
		Stats.mean(10,20); //should return 15.
		Stats.mean(10.0, 20.0); // should return 15.0
		Stats.mean(0,0); // should return 0.
		Stats.mean(9.0, 0.0); // should return 4.5
		Stats.mean(-1,-3); // should return -2
		Stats.max(10,20); // should return 20
		Stats.max(10.0, 20.0); //should return 20.0
		Stats.max(-4,0); //should return 0
		Stats.max(9,9); //should return 9
		Stats.geoMean(0,0); //should be 0
		Stats.geoMean(-16.0,1.0); //should be 4i or undefined depending on Stats.java	
		Stats.geoMean(10,10); //should return 10
		Stats.geoMean(10.0,10.0); //should return 10.0
	}
}
