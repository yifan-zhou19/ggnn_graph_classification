package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int t;
	int n;
	int m = 0;
	int[] a = new int[500];
	int[] b = new int[500];
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
	for (i = 0;i < n;i++)
	{
	if (a[i] % 2 == 1)
	{
	b[m] = a[i];
	m++;
	}
	}
	for (j = 0;j < m - 1;j++)
	{
	for (i = 0;i < m - j - 1;i++)
	{
	if (b[i] > b[i + 1])
	{
	t = b[i];
	b[i] = b[i + 1];
	b[i + 1] = t;
	}
	}
	}
	for (i = 0;i < m;i++)
	{
	System.out.printf("%d",b[i]);
	if (i != m - 1)
	{
	System.out.print(",");
	}
	}
	return 0;
	}

}

