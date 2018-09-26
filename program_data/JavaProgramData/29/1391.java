package <missing>;

public class GlobalMembers
{
	public static double fei(int n)
	{
		double result = 0;
		int a = 1;
		int b = 1;
		int k;
		for (k = 1;k <= n;k++)
		{
			int d = a;
			a += b;
			b = d;
			result += 1.0 * a / b;
		}
		return result;
	}
	public static int Main()
	{
		int i;
		int m;
		int n;
		double result = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			result = fei(n);
			System.out.printf("%.3lf\n",result);
		}
		return 0;
	}
}

