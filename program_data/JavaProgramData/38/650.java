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
		double ave;
		double[] sum = new double[100];
		double[] s1 = new double[100];
		double[] s = new double[100];
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
				n = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Double.parseDouble(tempVar3);
				}
				sum[i] += a[j];
			}
			ave = sum[i] / n;
			for (j = 0;j < n;j++)
			{
				s1[i] += (a[j] - ave) * (a[j] - ave);
			}
			s[i] = Math.sqrt(s1[i] / n);
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%.5lf\n",s[i]);
		}
		return 0;
	}
}

