package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[] people = new double[100];
		for (i = 1; i <= k ; i++)
		{
			people[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (people[i] <= 18)
			{
				a = a + 1;
			}
			else if (people[i] <= 35)
			{
				b = b + 1;
			}
			else if (people[i] <= 60)
			{
				c = c + 1;
			}
			else
			{
				d = d + 1;
			}
		}
		double e;
		double f;
		double g;
		double h;
		double x;
		x = k;
		e = 100 * a / x;
		f = 100 * b / x;
		g = 100 * c / x;
		h = 100 * d / x;
		System.out.print("1-18: ");
		System.out.printf("%.2f", e);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "19-35: ");
		System.out.printf("%.2f", f);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "36-60: ");
		System.out.printf("%.2f", g);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "60??: ");
		System.out.printf("%.2f", h);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		return 0;
	}

}

