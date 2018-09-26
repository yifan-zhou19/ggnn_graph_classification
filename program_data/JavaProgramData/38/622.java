package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		double[] a = new double[100];
		double sum;
		double sum1;
		double aver;
		double S;
		double n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Double.parseDouble(tempVar2);
			}
			sum = 0;
			sum1 = 0;
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(a[j]) = Double.parseDouble(tempVar3);
				}
				sum += a[j];
			}
			aver = sum / n;
			for (j = 0;j < n;j++)
			{
				a[j] = (a[j] - aver) * (a[j] - aver);
				sum1 += a[j];
			}
			S = Math.sqrt(sum1 / n);
			System.out.printf("%.5lf\n",S);
		}
		return 0;

	}
}

