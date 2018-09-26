package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int k;
	int e;
	int[] a = new int[1000];
	int[] b = new int[1000];
	int x = 1;
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
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b[i] = Integer.parseInt(tempVar3);
		}
	}
	for (k = 1;k <= n;k++)
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
	for (k = 1;k <= n;k++)
	{
		for (i = 0;i < n - k;i++)
		{
			if (b[i] > b[i + 1])
			{
			e = b[i + 1];
														 b[i + 1] = b[i];
														 b[i] = e;
			}
		}
	}
	for (i = 0;i < n;i++)
	{
		if (a[i + 1] > b[i])
		{
			x = 0;
									   break;
		}
	}
	if (x == 0)
	{
		System.out.print("no");
	}
	else
	{
		System.out.printf("%d %d",a[0],b[n - 1]);
	}
	return 0;
	}
}

