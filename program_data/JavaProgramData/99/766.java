package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		double e;
		double f;
		double g;
		double h;
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m <= 18)
			{
				a = a + 1; //??????
			}
			if (m >= 19 && m <= 35)
			{
				b = b + 1; //??
			}
			if (m >= 36 && m <= 60)
			{
				c = c + 1; //??
			}
			if (m > 60)
			{
				d = d + 1; //??
			}
		}
		e = a / n * 100;
		f = b / n * 100;
		g = c / n * 100;
		h = d / n * 100;
		System.out.print("1-18:");
		System.out.print(" ");
			System.out.printf("%0.2f", e);
				System.out.print("%");
				System.out.print("\n");
				System.out.print("19-35:");
				System.out.print(" ");
				System.out.printf("%0.2f", f);
				System.out.print("%");
				System.out.print("\n");
				System.out.print("36-60:");
				System.out.print(" ");
				System.out.printf("%0.2f", g);
				System.out.print("%");
				System.out.print("\n");
				System.out.print("60??:");
				System.out.print(" ");
				System.out.printf("%0.2f", h);
				System.out.print("%");
				System.out.print("\n");
			return 0;
	}


}

