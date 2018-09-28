package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double a = 0;
		double x;
		int n;
		int k;
		int i;
		int m = 4;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		if (n > 7)
		{
			m = 15000000;
		}
		while ((a < 1) || (a != (int)a))
		{
			m++;
			x = 0;
			for (i = 1;i <= n;i++)
			{
				a = (m - i * k - x) / n;
				x = x + a;
			}
		}
		System.out.printf("%ld",m);
	}

}

