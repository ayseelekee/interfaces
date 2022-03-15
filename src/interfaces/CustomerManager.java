package interfaces;

public class CustomerManager {
	private CustomerDao customerDao;
	private Logger[] logger;
	private Message[] message;
	
	public CustomerManager(CustomerDao customerDao, Logger[] logger, Message[] message) {
		super();
		this.customerDao = customerDao;
		this.logger=logger;
		this.message= message;
	}
	

	public void add(Customer customer) {
		customerDao.add(customer);
		
		for (Logger logger2 : logger) {
			logger2.log("Loglandi.");
		}
		
		for (Message message2 : message) {
			message2.msc(customer.getName());
			
		}
	}
	
	
}
