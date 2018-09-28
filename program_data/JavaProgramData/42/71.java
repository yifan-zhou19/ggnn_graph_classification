package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	final int h = n;
	int[] a = new int[h];
	for (b = 0;b <= n - 1;b++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[b] = Integer.parseInt(tempVar2);
		}
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		c = Integer.parseInt(tempVar3);
	}
	f = 0;
	for (d = 0;d <= n - 1;d++)
	{
		while (a[d] == c)
		{
			for (e = d;e <= n - 2;e++)
			{
		a[e] = a[e+1];
			}
	if (c != 0)
	{
		a[n - 1] = 0;
	}
	else
	{
		a[n - 1] = 1;
	}
	f = f + 1;
		}
	}
	for (g = 0;g < n - f - 1;g++)
	{
		System.out.printf("%d ",a[g]);
	}
	System.out.printf("%d",a[g]);
	return 0;
	}
}

