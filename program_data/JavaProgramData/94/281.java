package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int n;
		int k = 1;
		int i = 0;
		int j = 0;
		int[] a = new int[500];
		int[] b = new int[500];
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		i = 0;
		for (i = 0;i < N;i++)
		{
			if (a[i] % 2 != 0)
			{
				b[j] = a[i];
				j++;
			}
		}
		n = j;
		i = 0;
		for (k = 1;k <= n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (b[i] > b[i + 1])
				{
					e = b[i];
					b[i] = b[i + 1];
					b[i + 1] = e;
				}
			}
		i = 0;
		}
		for (i = 0;i < n;i++)
		{
			if (i != n - 1)
			{
				System.out.printf("%d,",b[i]);
			}
			else
			{
				System.out.printf("%d",b[i]);
			}
		}

	return 0;
	}
}

