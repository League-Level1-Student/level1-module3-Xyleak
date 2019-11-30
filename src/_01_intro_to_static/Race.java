package _01_intro_to_static;

public class Race {

	
	 static int nextBibNumber;
	    static String raceLocation = "New York";
	    static String raceStartTime = "9.00am";

	    String name;
	    int speed;
	    int bibNumber;

	    Race (String name, int speed){
	        this.name = name;
	        this.speed = speed;
	    }

	    public static void main(String[] args) {
	        //create two athletes
	        //print their names, bibNumbers, and the location of their race. 
	    	String name = ("Bob");
	    	int speed = 999999999;
	    	int bibNumber = 1;
	    	
	    	String name2 = ("Joe");
	    	int speed2 = 1;
	    	int bibNumber2 = 2;
	    	
	    	System.out.println("");
	    	System.out.println("");
	    	
	    	System.out.println("|Name: "+name+"| |Speed: "+speed+"| |Number: "+bibNumber+"| |Location: "+raceLocation+"| |Time: "+raceStartTime+"|");
	    	
	    	System.out.println("");
	    	System.out.println("");
	    	System.out.println("");
	    	
	    	System.out.println("|Name: "+name2+"| |Speed: "+speed2+"| |Number: "+bibNumber2+"| |Location: "+raceLocation+"| |Time: "+raceStartTime+ "|");
	    	
	    	System.out.println("");
	    	System.out.println("");
	    	
	    }
	
	    
}
