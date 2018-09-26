package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		double[] b = new double[100];
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			double[] a = new double[100];
			double ave = 0;
			double sum = 0;
			double ss = 0;
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Double.parseDouble(tempVar3);
				}
			}
			for (j = 0;j < n;j++)
			{
				sum += a[j];
			}
			ave = sum / n;
			for (j = 0;j < n;j++)
			{
				ss += Math.pow(a[j] - ave, 2);
			}
			b[i] = Math.pow(ss / n,0.5);
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%.5lf\n", b[i]);
		}
		return 0;
	}
}

