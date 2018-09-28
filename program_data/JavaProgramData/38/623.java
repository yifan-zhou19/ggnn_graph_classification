package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		int a;
		double[][] sz = new double[1000][100];
		double pj;
		double s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (a = 0;a < k;a++)
		{
			s = 0;
			pj = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[a][i] = Double.parseDouble(tempVar3);
				}
				pj += sz[a][i];
			}
			pj = pj / n;
			for (i = 0;i < n;i++)
			{
				s += (sz[a][i] - pj) * (sz[a][i] - pj);
			}
			s = Math.sqrt(s / n);
			System.out.printf("%.5lf\n",s);
		}
		return 0;
	}
}

