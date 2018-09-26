package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int n;
		int j;
		double[] s = {0.0};
		double a;
		double b;
		double e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			a = 2;
			b = 1;
			for (j = 1;j <= n;j++)
			{
				s[i] = s[i] + (a / b);
				e = a;
				a = a + b;
				b = e;
			}
		}
		for (i = 1;i <= m;i++)
		{
			System.out.printf("%.3lf\n",s[i]);
		}
		return 0;
	}
}

