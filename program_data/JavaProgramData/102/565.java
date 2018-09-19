package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int n;
		double[] sz = new double[99];
		double e;
		String tmp = new String(new char[9]);
		char[][] sex = new char[99][99];
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
				sex[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Double.parseDouble(tempVar3);
			}

		}
		for (k = 0;k < n;k++)
		{
			for (i = 0;i < (n - k);i++)
			{
				if (sex[i][0] == 'm' && sex[i + 1][0] == 'm' && sz[i] > sz[i + 1] || sex[i][0] == 'f' && sex[i + 1][0] == 'm' || sex[i][0] == 'f' && sex[i + 1][0] == 'f' && sz[i] < sz[i + 1])
				{
					tmp = sex[i];
					sex[i] = sex[i + 1];
					sex[i + 1] = tmp;
					e = sz[i];
					sz[i] = sz[i + 1];
					sz[i + 1] = e;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				System.out.printf("%.2lf",sz[i]);
			}
			else
			{
				System.out.printf(" %.2lf",sz[i]);
			}
		}





	return 0;

	}
}

