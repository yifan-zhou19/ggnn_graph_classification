package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[500];
		int i;
		int k;
		int e;
		int m;
		int n;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i = i + 1)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		}
		for (k = 1 ; k <= n ; k++)
		{
		for (i = 0; i < n - k; i++)
		{
				if (a[i] > a[i + 1])
				{
						e = a[i + 1];
						a[i + 1] = a[i];
						a[i] = e;
				}
		}
		}

		for (i = 0;i <= n - 1;i++)
		{
			if (a[i] % 2 != 0)
			{
				m = i;
			}
		}
			for (i = 0;i <= n - 1;i++)
			{
				if ((a[i] % 2 != 0) && (i < m))
				{
					System.out.printf("%d,",a[i]);
				}
			}
			System.out.printf("%d",a[m]);
			return 0;
	}


}

