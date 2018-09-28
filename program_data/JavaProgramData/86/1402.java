package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] a = new int[10000];
		int i;
		int j;
		int k;
		int[] cs = new int[10000];
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
				m = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Integer.parseInt(tempVar3);
				}
			}
			if (a[m - 1] + 3 * m < 60)
			{
				cs[i] = 60 - 3 * m;
			}
			if (a[m - 1] + 3 * m >= 60)
			{
				for (k = m - 1;k >= 0;k--)
				{
					if ((a[k] + 3 * (k + 1)) <= 60)
					{
						break;
					}
				}
				if (60 - (a[k] + 3 * (k + 1)) + a[k] > a[k + 1])
				{
					cs[i] = 60 - 3 * (k + 1) - 1;
				}
				else
				{
					cs[i] = 60 - 3 * (k + 1);
				}

			}

		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",cs[i]);
		}




		return 0;

	}
}

