package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[300];
	int m = 0;
	int n;
	int p = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	for (int i = 0;i < m;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		(a[i]) = Integer.parseInt(tempVar2);
	}
	}
	System.out.printf("%d",a[0]);
	for (n = 1;n < m;n++)
	{
	p = 0;
	for (int j = 0;j <= n - 1;j++)
	{
	if (a[n] == a[j])
	{
	p++;
	}
	}
	if (p == 0)
	{
	System.out.printf(",%d",a[n]);
	}
	else
	{
	continue;
	}
	}
	return 0;
	}

}

