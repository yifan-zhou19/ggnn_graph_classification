package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int k;
		int e;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
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
		for (i = 0; i < n - 1; i++)
		{
		if (a[i] % 2 != 0)
		{
			s = i;
		}
		}
	for (i = 0; i < s; i++)
	{
		if (a[i] % 2 != 0)
		{
			System.out.printf("%d,",a[i]);
		}
	}
	System.out.printf("%d",a[s]);
	return 0;
	}

}

