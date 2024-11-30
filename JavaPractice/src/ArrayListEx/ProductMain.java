package ArrayListEx;

import java.util.ArrayList;
import java.util.Iterator;

public class ProductMain {

	public static void main(String[] args) {
		ArrayList<Product> prdList = new ArrayList<Product>();
		
		Product p1 = new Product(10001, "Monitor", 200000);
		Product p2 = new Product(10002, "Key Board", 30000);
		Product p3 = new Product(10003, "Moust", 10000);
		
		prdList.add(p1);
		prdList.add(p2);
		prdList.add(p3);
		
		for(int i=0; i<prdList.size(); i++) {
			System.out.println(prdList.get(i));
		}
		
		for(Product prd : prdList) {
			System.out.println(prd);
		}
		
		Iterator<Product> iter = prdList.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}

	}

}
