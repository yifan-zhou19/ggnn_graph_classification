package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		int i;
		int k;
		int e;
		int max;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a[i]) = Integer.parseInt(tempVar2);
			}

		}
		for (k = 1;k <= n;k++)
		{
			max = 0;
			for (i = 0;i <= n - k;i++)
			{
				if (a[i] > a[max])
				{
					max = i;
				}
			}
			if (max != n - k)
			{
				e = a[max];
				a[max] = a[n - k];
				a[n - k] = e;

			}

		}
		for (i = 0;i < n;i++)
		{
			if ((a[i]) % 2 == 1)
			{
				if (i == n - 2 || i == n - 1)
				{
				System.out.printf("%d",a[i]);
				}
			else
			{
				System.out.printf("%d,",a[i]);
			}
			}
		}
	return 0;
	}

}

