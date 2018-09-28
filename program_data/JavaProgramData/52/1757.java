package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[200];
	int m;
	int n;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	for (i = 1;i <= n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 1;i <= m;i++)
	{
	a[n + i] = a[n - m + i];
	}
	for (i = 1;i <= n - m;i++)
	{
	a[n - i + 1] = a[n - m - i + 1];
	}
	for (i = 1;i <= m;i++)
	{
	a[i] = a[n + i];
	}
	System.out.printf("%d",a[1]);
	for (i = 2;i <= n;i++)
	{
	System.out.printf(" %d",a[i]);
	}
	return 0;
	}

}

