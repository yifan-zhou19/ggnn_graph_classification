package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int k;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		int[][] a = new int[300][300];
		while (m != 0 && n != 0)
		{
			for (i = 0;i <= n - 1;i++)
			{
				a[0][i] = i + 1;
			}
			p = m;
			q = n;
			k = 0;
			while (q > 1)
			{
				p = p % q;
				k = k + 1;
				if (p > 0 && p < n - k + 1)
				{
					for (i = 0;i <= n - k - p;i++)
					{
						a[k][i] = a[k - 1][i + p];
					}
					for (i = n - k - p + 1;i <= n - k;i++)
					{
						a[k][i] = a[k - 1][i - n + k + p - 1];
					}
				}
				else if (p == 0)
				{
					for (i = 0;i <= n - k;i++)
					{
						a[k][i] = a[k - 1][i];
					}
				}
					p = m;
					q = q - 1;
			}
			System.out.printf("%d\n",a[n - 1][0]);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				m = Integer.parseInt(tempVar4);
			}
		}
		return 0;
	}
}

