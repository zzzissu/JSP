package prj01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService {
	Map<String, Product> products = new HashMap<>();
	public ProductService() {
		Product p = new Product("101", "애플폰", "애플전자", 1800000, "2024.01.23");
		products.put("101", p);
		p = new Product("102", "갤럭시", "삼성전자", 2000000, "2023.11.07");
		products.put("102", p);
		p = new Product("103", "LG폰", "LG전자", 1500000, "2021.6.18");
		products.put("103", p);
	}
	public List<Product> findAll() {
		return new ArrayList<>(products.values());
	}
	public Product find(String id) {
		return products.get(id);
	}
}
