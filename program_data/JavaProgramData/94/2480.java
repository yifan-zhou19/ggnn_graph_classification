package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int e;
		int k = 0;
		int x = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (int k = 1;k <= n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (a[i] > a[i + 1])
				{
					e = a[i + 1];
					a[i + 1] = a[i];
					a[i] = e;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((a[i]) % 2 == 1)
			{
				k++;
			}
		}
		int[] b = new int[k];
		for (i = 0;i < n;i++)
		{
			if ((a[i] % 2) == 1)
			{
				b[x] = a[i];
				x++;
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d",b[k - 1]);
		return 0;
	}

}

