package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int k;
		int[] n = new int[150];
		int i;
		int j;
		int m;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		double[] x = new double[2000];
		double[] a = new double[150];
		double[] S = new double[150];
		double[] l = new double[150];
		double[] s = new double[150];
		for (i = 1;i <= k;i++)
		{
			s[i] = 0;
			l[i] = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
			for (j = 1;j <= n[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = Double.parseDouble(tempVar3);
				}
			}
			for (m = 1;m <= n[i];m++)
			{
				l[i] = l[i] + x[m];
			}
			a[i] = l[i] / n[i];
			for (e = 1;e <= n[i];e++)
			{
				s[i] = s[i] + Math.pow((x[e] - a[i]),2);
			}
			S[i] = Math.sqrt(s[i] / n[i]);
		}
		for (i = 1;i <= k;i++)
		{
			System.out.printf("%.5lf\n",S[i]);
		}
	}
}

