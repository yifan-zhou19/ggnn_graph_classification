package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int[] n = new int[100];
		double[] x = new double[100];
		double[] m = new double[100];
		double[] s = new double[100];
		double[] sum = new double[100];
		double[] a = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0; i < k; i++)
		{
			sum[i] = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0; j < n[i]; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = Double.parseDouble(tempVar3);
				}
				sum[i] = sum[i] + x[j];
			}
			a[i] = sum[i] / n[i];
			m[i] = 0;
			for (j = 0; j < n[i]; j++)
			{
				m[i] += (x[j] - a[i]) * (x[j] - a[i]);
			}
			s[i] = Math.sqrt(m[i] / n[i]);
		}
		for (i = 0; i < k; i++)
		{
			System.out.printf("%.5lf\n", s[i]);
		}
		return 0;
	}

}

