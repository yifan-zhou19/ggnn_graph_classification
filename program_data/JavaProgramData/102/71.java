package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k = 0;
		int r;
		double[] nan = new double[40];
		double[] nv = new double[40];
		double[] gao = new double[40];
		double e;
		char[][] nannv = new char[40][10];
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
				nannv[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				gao[i] = Double.parseDouble(tempVar3);
			}
			if (nannv[i][0] == 'm')
			{
				nan[j] = gao[i];
				j++;
			}
			else
			{
				nv[k] = gao[i];
				k++;
			}
		}
		for (r = j - 1;r > 0;r--)
		{
			for (i = 0;i < r;i++)
			{
				if (nan[i] > nan[i + 1])
				{
					e = nan[i];
					nan[i] = nan[i + 1];
					nan[i + 1] = e;
				}
			}
		}
		System.out.printf("%.2lf",nan[0]);
		for (i = 1;i < j;i++)
		{
			System.out.printf(" %.2lf",nan[i]);
		}
		for (r = k - 1;r > 0;r--)
		{
			for (i = 0;i < r;i++)
			{
				if (nv[i] > nv[i + 1])
				{
					e = nv[i];
					nv[i] = nv[i + 1];
					nv[i + 1] = e;
				}
			}
		}
		for (i = k - 1;i >= 0;i--)
		{
			System.out.printf(" %.2lf",nv[i]);
		}
		System.out.print("\n");
		return 0;
	}

}

