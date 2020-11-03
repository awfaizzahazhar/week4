public class Circle 
{
	//field/attribute
	private double jejari = 1;

	public void SetJejari(double Jejari)
	{
		this.jejari=jejari;

	}


	public double getJejari()
	{
		return jejari;
	}
//default constructor
	public Circle()
	{
		System.out.println("Default constructor dipanggil");
	}

	public Circle (double r)
	{
		jejari = r;
		System.out.println("Jejari = " - jejari);
	}


	public Circle (double r)
	{
		jejari = r;
	}

	public Circle (double r, String s)
	{
		jejari = r;
		System.out.println("Jejari = " + jejari + "String =" +s);
	}


	//method
	public double KiraLuas() 
	{
		return jejari*jejari* Math.PI;
	}
}