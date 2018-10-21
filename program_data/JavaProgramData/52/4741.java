package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	int i;
	int j;
	int[] a = new int[1000];
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
	for (i = 0;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = n + m - 1;i >= m;i--)
	{
	a[i] = a[i - m];
	}
	for (i = 0;i <= m - 1;i++)
	{
	a[i] = a[i + n];
	}
	for (i = 0;i < n;i++)
	{
		System.out.printf("%d",a[i]);
	if (i != n - 1)
	{
		System.out.print(" ");
	}
	}
	return 0;
	}

}

