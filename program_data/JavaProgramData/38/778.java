package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		int j;
		double[] s = new double[100];
		double[] a = {0.0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		double sum = 0.0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			sum = 0.0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					s[j] = Double.parseDouble(tempVar3);
				}
				sum += s[j];
			}
			sum = sum / (1.0 * n);
			for (j = 0;j < n;j++)
			{
				a[i] += (1.0 * s[j] - sum) * (1.0 * s[j] - sum);
			}
			a[i] = Math.sqrt(a[i] / (1.0 * n));
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%.5lf\n",a[i]);
		}
		return 0;
	}
}

