package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int j;
		int e;
		int m = 0;
		int x = 0;
		int[] a = new int[500];
		int[] b = new int[500];
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (j = 0;j < n;j++)
		{
			for (i = x;i < n;i++)
			{
				if (a[i] % 2 != 0)
				{
					x = i + 1;
					b[j] = a[i];
					m++;
					break;

				}

			}
		}
		for (k = 1;k <= m;k++)
		{
			for (j = 0;j < m - k;j++)
			{
				if (b[j] > b[j + 1])
				{
					e = b[j + 1];
					b[j + 1] = b[j];
					b[j] = e;
				}
			}

		}
		for (j = 0;j < m - 1;j++)
		{
		System.out.printf("%d,",b[j]);
		}
		System.out.printf("%d\n",b[m - 1]);

		return 0;
	}

}

