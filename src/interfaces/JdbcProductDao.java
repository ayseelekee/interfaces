package interfaces;

import java.util.List;
//Contract
public class JdbcProductDao implements ProductDao{

	@Override
	public void add(Product product) {
		System.out.println(product.getName() + ": Jdbc ile eklendi");
	}

	@Override
	public void update(Product product) {
		System.out.println(product.getName() + ": Jdbc ile güncellendi");
		
	}

	@Override
	public void delete(Product product) {
		System.out.println(product.getName() + ": Jdbc ile silindi");
		
	}

	@Override
	public List<Product> getAll() {
		return null;
	}

}
