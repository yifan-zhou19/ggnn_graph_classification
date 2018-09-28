package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[100];
	int n;
	int m;
	int i;
	int j;
	int s;
	int t;
	int q;
	int b;
	int c;
	int d;
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
	for (i = 0;i <= n - 1;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i] = Integer.parseInt(tempVar3);
	}
	}
	for (j = 0;j <= (n - m - 1) / 2;j++)
	{
		b = a[j];
		a[j] = a[n - m - 1 - j];
		a[n - m - 1 - j] = b;
	}
	for (s = 0;s <= (m - 1) / 2;s++)
	{
		c = a[n - m + s];
		a[n - m + s] = a[n - 1 - s];
		a[n - 1 - s] = c;
	}
	for (t = 0;t <= (n - 1) / 2;t++)
	{
		d = a[t];
		a[t] = a[n - 1 - t];
		a[n - 1 - t] = d;
	}
	System.out.printf("%d",a[0]);
	for (q = 1;q <= n - 1;q++)
	{
	System.out.printf(" %d",a[q]);
	}
	return 0;
	}
}

