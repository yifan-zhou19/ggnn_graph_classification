package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		double[] sum = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			sum[i] = 0;
		}


		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			int a = 2;
			int b = 1;

			for (j = 0;j < n;j++)
			{
			sum[i] += 1.0 * a / b;
			a = a + b;
			b = a - b;
			}
			System.out.printf("%.3lf\n",sum[i]);

		}

		return 0;
	}


}

