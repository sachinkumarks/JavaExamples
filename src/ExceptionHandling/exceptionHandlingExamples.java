package ExceptionHandling;


public class exceptionHandlingExamples {
	 
	public static void main(String[] args) {
		String name1="1243";
		int []arr= {3,4,6,8,9,7};
		try {
			int a=10, b=0;
			int c= a/b;
			System.out.println(c);
			String name="sachin";
			
			System.out.println(name.charAt(7));
			
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(Integer.parseInt(name1));
		System.out.println(arr[10]);
		
		System.out.println("Hi Hello Welcome to Java world");
		
		
		
	}

}
