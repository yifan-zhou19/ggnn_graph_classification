package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 1;i <= k;i++)
		{
			int n;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			int j;
			double[] a = new double[100];
			double sum = 0;
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Double.parseDouble(tempVar3);
				}
				sum = sum + a[j];
			}
			double ave;
			ave = sum / n;
			sum = 0;
			for (j = 0;j < n;j++)
			{
				sum = sum + (a[j] - ave) * (a[j] - ave);
			}
			System.out.printf("%.5lf\n",Math.sqrt(sum / n));
		}
	}



}

