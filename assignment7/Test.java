package assignment7;

public class Test {

	public static void main(String[] args) {
		Patient c = new Patient();
		c.setName("Bathri");
		c.setSsn("Nothing to display");
		c.setId(90321);
		System.out.println("ID " + c.getId());
		System.out.println("First Name " + c.getName());
		System.out.println(c.getSsn());

	}

}
