package collections.listexamples;

public class Product implements Comparable<Product>{
	String productName;
	String brandName;
	int price;
	int productId;
	
	Product(String productName,String brandName,int price, int productId){
		this.productName=productName;
		this.brandName=brandName;
		this.price=price;
		this.productId=productId;
		
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", brandName=" + brandName + ", price=" + price + ", productId="
				+ productId + "]";
	}

	@Override
	public int compareTo(Product id) {
		
		return productName.compareTo(productName);
//		if(productId==id.productId) {
//			return 0;
//		}else if(productId>id.productId) {
//			return 1;
//		}
//		return-1;
//		
		
	}
	


}
