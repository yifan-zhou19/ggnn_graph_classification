package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int l;
		int cout = 0;
		int n;
		int c;
		int k;
	int[] a = new int[500];
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
			c = Integer.parseInt(tempVar2);
		}
		if (c % 2 != 0)
		{
			a[cout] = c;
			cout++;
		}
	}

	for (j = 0;j <= cout - 2;j++)
	{
		for (k = cout - 1;k > j;k--)
		{
			if (a[k] < a[k - 1])
			{
				a[k] = a[k] + a[k - 1];
				a[k - 1] = a[k] - a[k - 1];
				a[k] = a[k] - a[k - 1];
			}
		}
	}
	for (l = 0;l <= cout - 2;l++)
	{
		System.out.printf("%d,",a[l]);
	}
	System.out.printf("%d",a[cout - 1]);
	return 0;
	}
}

