package interfaces;

public class HibernateCustomerDao implements CustomerDao{

	@Override
	public void add(Customer customer) {
		System.out.println("Hibernate ile eklendi: " + customer.getName());
		
	}

}
