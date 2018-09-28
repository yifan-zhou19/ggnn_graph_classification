package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] k = new int[100];
		double[] sum = new double[100];
		double[] a = new double[100];
		double[] s = new double[100];
		double[] h = new double[100];
		double[] b = new double[100];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < k[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Double.parseDouble(tempVar3);
				}
				sum[i] = sum[i] + a[j];
			}
			b[i] = sum[i] / k[i];
			for (j = 0;j < k[i];j++)
			{
				h[i] = h[i] + (a[j] - b[i]) * (a[j] - b[i]);
			}
			s[i] = Math.sqrt(h[i] / k[i]);
			System.out.printf("%.5lf\n",s[i]);
		}
		return 0;
	}


}

