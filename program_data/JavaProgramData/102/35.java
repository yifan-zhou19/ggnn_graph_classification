package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		double[][] sz = new double[40][2];
		double e;
		String s = new String(new char[7]);
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
				s = tempVar2.charAt(0);
			}
			if (strcmp(s,"male") == 0)
			{
				sz[i][0] = 0;
			}
			else
			{
				sz[i][0] = 1;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i][1] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 1;i < n;i++)
		{
			for (k = 0;k < n - i;k++)
			{
				if (sz[k][0] == 1 && sz[k + 1][0] == 0 || sz[k][0] == 1 && sz[k + 1][0] == 1 && sz[k][1] < sz[k + 1][1] || sz[k][0] == 0 && sz[k + 1][0] == 0 && sz[k][1]> sz[k + 1][1])
				{
					e = sz[k][1];
					sz[k][1] = sz[k + 1][1];
					sz[k + 1][1] = e;
					e = sz[k][0];
					sz[k][0] = sz[k + 1][0];
					sz[k + 1][0] = e;
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%.2lf ",sz[i][1]);
		}
		System.out.printf("%.2lf",sz[n - 1][1]);

		return 0;
	}
}

