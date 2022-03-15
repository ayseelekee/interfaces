package interfaces;

public class EmailMessage implements Message{

	@Override
	public void msc(String message) {
		System.out.println("Email: " +message);
		
	}

}
