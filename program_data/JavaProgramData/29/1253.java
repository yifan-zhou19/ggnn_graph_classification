package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 0;
		int i;
		int n;
		int t;
		int[] x = new int[100];
		double[] c = new double[1000];
		double sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			int a = 1;
			int b = 2;
			sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Integer.parseInt(tempVar2);
			}
			for (n = 0;n < x[i];n++)
			{
				c[n] = b / (a * 1.0);
				t = a;
				a = b;
				b = t + b;
				sum = sum + c[n];
			}
			System.out.printf("%.3lf\n",sum);
		}

		return 0;
	}
}

