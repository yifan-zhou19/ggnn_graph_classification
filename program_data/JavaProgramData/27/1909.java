package <missing>;

public class GlobalMembers
{
	public static double a;
	public static double b;
	public static double c;
	public static double x1;
	public static double x2;
	public static double p;
	public static double q;
	public static int n;
	public static int Main()
	{

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		   if ((b * b - 4 * a * c) > 0)
		   {
			x1 = (0 - b + Math.sqrt(b * b - 4 * a * c)) / (a * 2);
			x2 = (0 - b - Math.sqrt(b * b - 4 * a * c)) / (a * 2);
			System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
		   }
		else if ((b * b - 4 * a * c) == 0)
		{
			   x1 = (0 - b + Math.sqrt(b * b - 4 * a * c)) / (a * 2);
			x2 = (0 - b - Math.sqrt(b * b - 4 * a * c)) / (a * 2);
		   System.out.printf("x1=x2=%.5f\n",x1);
		}
		else if ((b * b - 4 * a * c) < 0)
		{
			   x1 = (0 - b) / (a * 2);
			   p = Math.sqrt(4 * a * c - b * b) / (a * 2);
			x2 = (0 - b) / (a * 2);
			q = -Math.sqrt(4 * a * c - b * b) / (a * 2);
			System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",x1,p,x2,p);
		}
		}
		return 0;

	}

}

