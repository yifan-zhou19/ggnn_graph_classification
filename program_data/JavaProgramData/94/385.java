package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	int i;
	int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] x = new int[n];
	int[] y = new int[n];
	m = 0;
	for (i = 1;i <= n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		x[i] = Integer.parseInt(tempVar2);
	}
	if (x[i] % 2 == 1)
	{
	m = m + 1;
	y[m] = x[i];
	}
	}
	for (i = 1;i <= m;i++)
	{
	for (j = i;j <= m;j++)
	{
	if (y[i] > y[j])
	{
	n = y[i];
	y[i] = y[j];
	y[j] = n;
	}
	}
	if (i > 1)
	{
		System.out.print(",");
	}
	System.out.printf("%d", y[i]);
	}
	return 0;
	}
}

