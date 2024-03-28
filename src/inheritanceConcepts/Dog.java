package inheritanceConcepts;

public class Dog extends Animal{
	String barking;
	String WaggngTaile;
	
    void getdogDetails(){
    	System.out.println("I am getanimalDetails from Animal method");
    	
    }
    String getconditionMessage(String condition){
    	return "I'm "+ condition+" ";
    }


}
