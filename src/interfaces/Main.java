package interfaces;

public class Main {

	public static void main(String[] args) {
		ProductManager productManager = new ProductManager(new HibernateProductDao(),new FileLogger());
		productManager.add(new Product(1,"Elma"));
		
		Logger[] loggers= {new DatabaseLogger(), new FileLogger()};
		Message[] messages= {new EmailMessage()};
		
		
		CustomerManager customerManager = new CustomerManager(new HibernateCustomerDao(),loggers,messages);
		customerManager.add(new Customer(1,"Ayse"));
		
	
		
		
	}

}
