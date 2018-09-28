package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		int j;
		double[] a = new double[1000];
		double[] s1 = new double[100];
		double[] s2 = new double[100];
		double[] s = new double[100];
		double[] aver = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Integer.parseInt(tempVar2);
			}
			for (i = 0;i < k;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i] = Double.parseDouble(tempVar3);
				}
				s1[j] += a[i];
			}
			aver[j] = s1[j] / k;
			for (i = 0;i < k;i++)
			{
				s2[j] += (a[i] - aver[j]) * (a[i] - aver[j]);
			}
			s[j] = Math.sqrt(s2[j] / k);
		}
		for (j = 0;j < n;j++)
		{
			System.out.printf("%.5lf\n",s[j]);
		}
		return 0;
	}
}

