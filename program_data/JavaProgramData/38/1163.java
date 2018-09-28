package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] m = new int[n];
		double[] sum = new double[n];
		double[] s = new double[n];
		double[][] num = new double[n][1000];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			for (k = 0;k < m[i];k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					num[i][k] = Double.parseDouble(tempVar3);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			sum[i] = 0.0;
			s[i] = 0.0;
			for (k = 0;k < m[i];k++)
			{
				sum[i] += num[i][k];
			}
			for (k = 0;k < m[i];k++)
			{
				s[i] += (num[i][k] - sum[i] / m[i]) * (num[i][k] - sum[i] / m[i]);
			}
			System.out.printf("%.5f\n",Math.sqrt(s[i] / m[i]));
		}
		return 0;
	}


}

