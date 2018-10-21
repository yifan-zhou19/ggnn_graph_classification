package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		double[] a = new double[1000];
		double s;
		double x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			double sum = 0;
			double sumx = 0;
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
					a[j] = Double.parseDouble(tempVar3);
				}
				sum = sum + a[j];
			}
			x = (double)sum / k;
			for (j = 0;j < k;j++)
			{
				sumx = sumx + (a[j] - x) * (a[j] - x);
			}
			s = (double)Math.sqrt(sumx / k);
			System.out.printf("%.5lf\n",s);
		}
		return 0;
	}
}

