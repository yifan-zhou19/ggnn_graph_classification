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
		double ave = 0;
		double sum = 0;
		double s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
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
			}

			for (j = 0;j < k;j++)
			{
				ave += a[j];
			}
			ave = ave / k;
			for (j = 0;j < k;j++)
			{
				sum += (a[j] - ave) * (a[j] - ave);
			}
			s = Math.sqrt(sum / k);
			System.out.printf("%.5lf\n", s);

			ave = 0;
			sum = 0;
			s = 0;
		}
		return 0;
	}

}

