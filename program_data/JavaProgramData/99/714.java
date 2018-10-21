package <missing>;

public class GlobalMembers
{
	//********************************************
	//*????9.cpp                            *
	//*?????                                *
	//*???1200012892                          *
	//*???2012.10.03                          *
	//*?????????????                *
	//********************************************
	public static int Main()
	{
		double k;
		double m;
		double n;
		double x = 0.0;
		double y = 0.0;
		double z = 0.0;
		double w = 0.0;
		double a; //??????
		double b;
		double c;
		double d;
		k = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		for (m = 1;m <= k;m = m + 1) //????
		{
			n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	if (n <= 18)
	{
		x = x + 1;
	}
	if (n <= 35 && n >= 19)
	{
		y = y + 1;
	}
	if (n <= 60 && n >= 36)
	{
		z = z + 1;
	}
	if (n >= 61)
	{
		w = w + 1;
	}
		}
		a = x / k * 100;
		b = y / k * 100;
		c = z / k * 100;
		d = w / k * 100; //?????
		System.out.printf("%.2f", "1-18: ");
		System.out.printf("%.2f", a);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "19-35: ");
		System.out.printf("%.2f", b);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "36-60: ");
		System.out.printf("%.2f", c);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "60??: ");
		System.out.printf("%.2f", d);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
	return 0; //?????
	}
}

