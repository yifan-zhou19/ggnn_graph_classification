package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int k;
		int[] n = new int[111];
		int i;
		int j;
		double[][] x = new double[111][111];
		double[] a = new double[111];
		double[] s = new double[111];
		double[] m = new double[111];
		double[] S = new double[111];
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
				n[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < n[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[i][j] = Double.parseDouble(tempVar3);
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			s[i] = 0;
			for (j = 0;j < n[i];j++)
			{
				s[i] += x[i][j];
			}
			a[i] = s[i] / n[i];
		}
		for (i = 0;i < k;i++)
		{
			m[i] = 0;
			for (j = 0;j < n[i];j++)
			{
				m[i] += (x[i][j] - a[i]) * (x[i][j] - a[i]);
			}
			S[i] = Math.sqrt(m[i] / n[i]);
			System.out.printf("%.5lf\n",S[i]);
		}
	}
}

