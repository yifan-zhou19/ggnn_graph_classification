package <missing>;

public class GlobalMembers
{
	public static double calculate(int m)
	{
		double sum;
		int a;
		int b;
		int c;
		int i;
		a = 1;
		b = 2;
		sum += b * 1.0 / a;
		for (i = 1;i <= m - 1;i++)
		{
			c = a + b;
			a = b;
			b = c;
			sum += b * 1.0 / a;
		}
		return sum;
	}
	public static void Main()
	{
		int n;
		int i;
		int m;
		double sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			sum = calculate(m);
			System.out.printf("%.3f\n",sum);
		}
	}

}

