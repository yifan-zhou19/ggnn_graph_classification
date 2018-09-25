package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] a = new int[50000];
	public static int[] b = new int[50000];
	public static int[] c = new int[50000];
	public static int Main()
	{
		int n;
		int i;
		int j;
		int e;
		int max;
		int min;
		int l;
		int m = 0;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			for (j = a[i];j < b[i];j++)
			{
				c[j] = 1;
			}
		}
	for (j = 1;j <= n;j++)
	{
		for (i = 0;i < n - j;i++)
		{
			if (a[i] > a[i + 1])
			{
				e = a[i + 1];
				a[i + 1] = a[i];
				a[i] = e;
			}
		}
	}
	for (j = 1;j <= n;j++)
	{
		for (i = 0;i < n - j;i++)
		{
			if (b[i] > b[i + 1])
			{
				e = b[i + 1];
				b[i + 1] = b[i];
				b[i] = e;
			}
		}
	}
	max = b[n - 1];
	min = a[0];
	l = max - min;
	for (i = min;i <= max;i++)
	{
		m = m + c[i];

	}
	if (m == l)
	{
		System.out.printf("%d %d",min,max);

	}
	else
	{
		System.out.print("no");
	}
	return 0;
	}

}

