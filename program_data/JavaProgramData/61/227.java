package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a = 1;
		double b = 1;
		double l = (1 + Math.sqrt(5)) / 2;
		double m = (1 - Math.sqrt(5)) / 2;
		double c;
		int i;
		int n;
		int k;
		int h;
		int an;
		h = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k <= h;k++)
		{
		   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   a = 1;
		   b = 1;
		for (i = 1;i <= n;i++)
		{

						 a = a * l;
						 b = b * m;
		}
		c = (a - b) / (l - m);
		System.out.print(c);
		System.out.print("\n");
		}
	   return 0;
	}

}

