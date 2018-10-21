package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int j;
		int a;
		int b;
		double[] sz = new double[100];
		double sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1; i <= n; i++)
		{
			sum = 0;
			a = 1;
			b = 2;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (j = 0; j < m; j++)
			{
				sz[j] = 1.0 * b / a;
				b = b + a;
				a = b - a;
				sum = sum + sz[j];
			}
			System.out.printf("%.3f\n", sum);
		}
		return 0;
	}
}

