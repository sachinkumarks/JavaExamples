package inheritanceConcepts;

public class Test {

	public static void main(String[] args) {
     
		BabyDog baby= new BabyDog();
		
		baby.eating="Dog is eating";
		baby.sleeping=" dog is sleeping";
	    baby.barking="dog is barking";
		baby.WaggngTaile=" dog is wagging tail";
		baby.milk="dog is dring milk";
		
		baby.getanimalDetails();
		baby.getmesaage("sleeting");
		baby.getconditionMessage("eating bone");
		baby.getdogDetails();
		baby.getbabyDogDetails();
		
		
	}

	@Override
	public String toString() {
		return "Test [toString()=" + super.toString() + "]";
	}

}
