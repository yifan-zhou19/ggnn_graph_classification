package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int i;
		int n;
		int[] b = new int[300];
		int j;
		int k;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = 1;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		b[0] = a[0];
		for (i = 1;i < n;i++)
		{
			k = i;
			for (j = 0;j < i;j++)
			{
				if (a[j] != a[i])
				{
					k = k - 1;
				}
				else
				{
					k = k;
				}
				if (k == 0)
				{
					b[m] = a[i];
					m++;
				}
			}
		}
			for (i = 0;i < m - 1;i++)
			{
				System.out.printf("%d,",b[i]);
			}
			System.out.printf("%d",b[m - 1]);

	}
}

