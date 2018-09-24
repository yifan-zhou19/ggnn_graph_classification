package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int j;
		double[] u = new double[1000];
		double sum;
		double ava;
		double sum2;
		double ava2;
		double x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			sum = 0;
			sum2 = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < k;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					u[j] = Double.parseDouble(tempVar3);
				}
				sum += u[j];
			}
			ava = sum / (double)k;
			for (j = 0;j < k;j++)
			{
				u[j] = (u[j] - ava) * (u[j] - ava);
				sum2 += u[j];
			}
			ava2 = sum2 / (double)k;
			x = Math.pow(ava2,0.5);
			System.out.printf("%.5lf\n",x);
		}
		return 0;
	}
}

