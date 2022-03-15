package interfaces;
import java.util.List;


public interface ProductDao {
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	List<Product> getAll();
	
}
