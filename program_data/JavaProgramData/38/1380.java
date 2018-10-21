package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int[] m = new int[100];
		double[] a = new double[1000];
		double sum1;
		double sum2;
		double[] s = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			for (k = 1;k <= m[i];k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[k] = Double.parseDouble(tempVar3);
				}
			}
			sum1 = 0;
			sum2 = 0;
			for (k = 1;k <= m[i];k++)
			{
				sum1 += a[k];
			}
			sum1 = sum1 / m[i];
			for (k = 1;k <= m[i];k++)
			{
				sum2 += (a[k] - sum1) * (a[k] - sum1);
			}
			sum2 = sum2 / m[i];
			s[i] = (double)Math.sqrt(sum2);
		}
		for (i = 1;i <= n;i++)
		{
			System.out.printf("%.5lf\n",s[i]);
		}
		return 0;
	}
}

