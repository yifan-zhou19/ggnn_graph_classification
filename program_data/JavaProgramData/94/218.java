package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int r;
		int[] sz = new int[200];
		int[] jsz = new int[200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		if (i = n - 1)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}

		r = 0;
		for (i = 0;i < n;i++)
		{
			if (sz[i] % 2 != 0)
			{
				jsz[r] = sz[i];
				r++;
			}
			else
			{
				r = r;
			}
		}
		for (k = 1;k < r;k++)
		{
			int tmp = jsz[k];
			for (j = k - 1;j >= 0;j--)
			{
				if (tmp < jsz[j])
				{
					jsz[j + 1] = jsz[j];
					jsz[j] = tmp;
				}
				else
				{
					jsz[j + 1] = tmp;
					break;
				}
			}
		}
		for (j = 0;j < r - 1;j++)
		{
			System.out.printf("%d,",jsz[j]);
		}
		if (j = r - 1)
		{
			System.out.printf("%d",jsz[j]);
		}
		return 0;
	}
}

