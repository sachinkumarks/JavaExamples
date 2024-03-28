package collections.listexamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		
		Product product=new Product("sunfeast", "britania",30, 234);
		Product product1=new Product("parlagi", "britania",30,334);
		Product product2=new Product("orio", "britania", 30,424);
		Product product3=new Product("munch", "chocklet", 30,124);
		
		List<Product> prod= new ArrayList<>();
		prod.add(product2);
		prod.add(product1);
		prod.add(product);
		prod.add(product3);
		
		Collections.sort(prod);
		
		
		for (Product prd : prod) {
			System.out.println(prd);
			
		}

	}

}
