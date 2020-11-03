public class DriverCircle
{
	public static void main(String[] args)
	{
	Circle bulat = new Circle();

	Circle bulat1 = new Circle(5);

	Circle bulat2 = new Circle(8, "DITP3133");


	System.out.println("Jejari bulat1 - " + bulat1.getJejari());
	System.out.println("Jejari bulat - " + bulat.getJejari());
	System.out.println("Jejari bulat2 - " + bulat.getJejari());

	//System.out.format("Luas ialah %2.2f" , bulat.KiraLuas());
}
}