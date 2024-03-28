package polymorphism.methodOverloading.examples;

public class test {
	
	public static void main(String[] args) {
		Addition addition=new Addition();
		System.out.println(addition.add('s', 10));
		System.out.println(addition.add(22, 34.556));
	}
	

}
