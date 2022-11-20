class ProductException extends Exception{
	public ProductException(String s) {
		super(s);
	}
}
class Product{
	void productpricecheck(float price) {
		try {
			if(price<=0||price>=10000) {
				throw new ProductException("Invalid product price");
			}
			else {
			
				System.out.println("Product price is valid");
			}
		} catch(ProductException e) {
			e.printStackTrace();
		}

	}
}
public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p = new Product();
		p.productpricecheck(1100);

	}

}

