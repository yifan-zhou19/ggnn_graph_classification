package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int kk = 0;
		String zs = new String(new char[9]);
		double[] xb = new double[999];
		double[] sg = new double[999];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zs = tempVar2.charAt(0);
			}
			if (zs.charAt(0) == 'm')
			{
				xb[i] = 1;
			}
			if (zs.charAt(0) == 'f')
			{
				xb[i] = 0;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sg[i] = Double.parseDouble(tempVar3);
			}
		}
		int[] sx = new int[999];
		int[] xs = new int[999];
		int e;
		for (i = 1;i <= n;i++)
		{
			if (xb[i] == 1)
			{
				k++;
				sx[k] = i;
			}
		}
		for (i = 1;i <= k - 1;i++)
		{
			for (j = 1;j <= k - i;j++)
			{
				if (sg[sx[j]] > sg[sx[j + 1]])
				{
					e = sx[j];
					sx[j] = sx[j + 1];
					sx[j + 1] = e;
				}
			}
		}


		for (i = 1;i <= n;i++)
		{
			if (xb[i] == 0)
			{
				kk++;
				xs[kk] = i;
			}
		}
		for (i = 1;i <= kk - 1;i++)
		{
			for (j = 1;j <= kk - i;j++)
			{
				if (sg[xs[j]] > sg[xs[j + 1]])
				{
					e = xs[j];
					xs[j] = xs[j + 1];
					xs[j + 1] = e;
				}
			}
		}
		System.out.printf("%.2lf",sg[sx[1]]);
		for (i = 2;i <= k;i++)
		{
			System.out.printf(" %.2lf",sg[sx[i]]);
		}
		for (i = kk;i >= 1;i--)
		{
			System.out.printf(" %.2lf",sg[xs[i]]);
		}
		return 0;
	}

}

