package polymorphism.methodOverloading.examples;

public class Addition {
	int add(int a, int b){
		return a+b;
	}
	
	float add(float a, int b){
		return a+b;
	}
	int add(int a, int b, int c){
		return a+b+c;
	}
	double add(int a, double b){
		return a+b;
	}
	double add(float a, double b){
		return a+b;
	}
	int add(char a, int b){
		return a+b;
	}float add(int a, int b, float c){
		return a+b+c;
	}

}
