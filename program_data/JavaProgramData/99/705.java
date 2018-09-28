package <missing>;

public class GlobalMembers
{
	//??? ?????
	//??? 1200012878
	//9?28?
	public static int Main()
	{
		int n;
		int i;
		int age;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		double m;
		double s;
		double p;
		double q;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			age = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (age <= 18 && age >= 1)
			{
				b = b + 1;
			}
			else
			{
				if (age <= 35 && age >= 19)
				{
					c = c + 1;
				}
			else
			{
				if (age <= 60 && age >= 36)
				{
					d = d + 1;
				}
			else
			{
				if (age >= 61)
				{
					e = e+1;
				}
			}
			}
			}
		}
		m = 1.0 * b / n * 100;
		s = 1.0 * c / n * 100;
		p = 1.0 * d / n * 100;
		q = 1.0 * e / n * 100;
		System.out.print("1-18: ");
		System.out.printf("%.2f", m);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "19-35: ");
		System.out.printf("%.2f", s);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "36-60: ");
		System.out.printf("%.2f", p);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "60??: ");
		System.out.printf("%.2f", q);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		return 0;
	}


}

