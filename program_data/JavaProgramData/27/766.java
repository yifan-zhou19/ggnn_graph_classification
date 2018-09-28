package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double a;
		double b;
		double c;
		double x1;
		double x2;
		while (n-- != 0)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if ((b * b - 4 * a * c) > 0)
			{
				x1 = (-b) / (2 * a);
				x2 = (Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.printf("x1=%.5f;x2=%.5f\n",x1 + x2,x1 - x2);
			}
			else if ((b * b - 4 * a * c) < 0)
			{
				x1 = (0 - b) / (2 * a);
				//if(x1 == 0) x1 = 0;
				x2 = (Math.sqrt(4 * a * c - b * b)) / (2 * a);
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",x1,x2,x1,x2);
			}
			else
			{
				System.out.printf("x1=x2=%.5f\n",(-b) / (2 * a));
			}
		}
		return 0;
	}
}

