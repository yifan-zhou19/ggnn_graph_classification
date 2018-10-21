package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int j;
		int n;
		double[] x = new double[100];
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];
		double[] s = new double[100];
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
			a[i] = 0;
			for (j = 0;j < k;j++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(x[j]) = Double.parseDouble(tempVar3);
			}
			a[i] += x[j];
			}
			b[i] = a[i] / k;
			c[i] = 0;
			for (j = 0;j < k;j++)
			{
			c[i] += (x[j] - b[i]) * (x[j] - b[i]);
			}

			s[i] = Math.sqrt(c[i] / k);
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%.5lf\n",s[i]);
		}
		return 0;
	}

}

