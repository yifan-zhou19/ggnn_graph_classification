package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int tot = 0;
		int i;
		int j;
		int swap;
		int[] a = new int[202];
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
				a[i] = Integer.parseInt(tempVar2);
			}
			tot += a[i];
		}
		for (i = 1;i <= n;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				if (a[i] > a[j])
				{
					swap = a[i];
					a[i] = a[j];
					a[j] = swap;
				}
			}
		}
		if ((a[1] + a[n]) * n == tot * 2)
		{
			System.out.printf("%d,%d",a[1],a[n]);
		}
		if ((a[1] + a[n]) * n > tot * 2)
		{
			System.out.printf("%d",a[n]);
		}
		if ((a[1] + a[n]) * n < tot * 2)
		{
			System.out.printf("%d",a[1]);
		}

		return 0;
	}


}

