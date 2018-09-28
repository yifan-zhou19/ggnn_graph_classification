package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	float a;
	float b;
	float c;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (n > 0)
	{
		double x;
		double y;
		double xi;
		double yi;
		double d;
		a = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		b = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		c = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		d = b * b - 4 * a * c; //?????
		if (d > 0)
		{
				x = (-b + Math.sqrt(d)) / (2 * a); //d>0?????
			y = (-b - Math.sqrt(d)) / (2 * a);
			System.out.print("x1=");
			System.out.printf("%.5f", x);
			System.out.printf("%.5f", ";x2=");
			System.out.printf("%.5f", y);
			System.out.printf("%.5f", "\n");
		}
		else if ((d) == 0)
		{
				x = (-b) / (2 * a);
			System.out.printf("%.5f", "x1=x2=");
			System.out.printf("%.5f", x);
			System.out.printf("%.5f", "\n");
		} //d=0??????
		else
		{
				if (b != 0F)
				{
			x = (-b) / (2 * a);
				}
			else
			{
				x = b / (2 * a);
			}
				xi = Math.sqrt(-d) / (2 * a);
				yi = Math.sqrt(-d) / (2 * a);
			System.out.printf("%.5f", "x1=");
			System.out.printf("%.5f", x);
			System.out.printf("%.5f", "+");
			System.out.printf("%.5f", xi);
			System.out.printf("%.5f", "i;x2=");
			System.out.printf("%.5f", x);
			System.out.printf("%.5f", "-");
			System.out.printf("%.5f", yi);
			System.out.printf("%.5f", "i");
			System.out.printf("%.5f", "\n");
		} //d<0?????
			n--;

	}

	 return 0;

	}


}

