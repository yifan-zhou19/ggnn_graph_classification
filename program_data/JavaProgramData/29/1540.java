package <missing>;

public class GlobalMembers
{
	public static int fei(int n)
	{
		if (n == 1)
		{
			return 1;
		}
		if (n == 2)
		{
			return 2;
		}
		if (n > 2)
		{
			int a = fei(n - 1) + fei(n - 2);
			return a;
		}
	}

	public static int Main()
	{
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 0; k < m; k++)
		{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int a = 1; // to calculate the numerator
		int b = 1; // to calculate the denominator
		double t; // to calculate the item of the formula
		double sum = 0;
		for (int i = 1; i <= n; i++)
		{
			a = fei(i + 1);
			b = fei(i);
			t = (double)(a) / (double)(b);
			sum += t;
		}
		System.out.printf("%.3lf\n", sum);
		}
		return 0;
	}
}

