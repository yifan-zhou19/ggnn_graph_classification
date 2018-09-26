package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int k;
	int e;
	int[] a = new int[500];
	char x = ',';
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
	for (i = 0;i < n - 1;i++)
	{
	if ((a[i] % 2 == 1) && (i < n - 2))
	{
	System.out.printf("%d%c",a[i],x);
	}
	else if ((a[i] % 2 == 1) && (i = n - 1) != 0)
	{
	 System.out.printf("%d",a[i - 1]);
	}

	}


	return 0;
	}

}

