package interfaces;

import java.util.List;

public class HibernateProductDao implements ProductDao{

	@Override
	public void add(Product product) {
		System.out.println(product.getName() + ": Hibernate ile eklendi");
		
	}

	@Override
	public void update(Product product) {
		System.out.println(product.getName() + ": Hibernate ile güncellendi");		
	}

	@Override
	public void delete(Product product) {
		System.out.println(product.getName() + ": Hibernate ile silindi");		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
