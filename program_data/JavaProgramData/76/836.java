package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] a = new int[50000];
	int[] b = new int[50000];
	int i;
	int x;
	int y;
	int j;
	int m;
	int p;
	double e;
	double f;
	m = 100;
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
	x = a[0],y = b[0];
	for (i = 0;i < n;i++)
	{
	if (a[i] > x)
	{
	x = a[i];
	}
	if (b[i] > x)
	{
	x = b[i];
	}
	if (a[i] < y)
	{
	y = a[i];
	}
	if (b[i] < y)
	{
	y = b[i];
	}
	}

	for (i = y;i <= x;i++)
	{
	e = i + 0.1;
	f = i - 0.1;
	for (j = 0;j < n;j++)
	{
	p = 1;
	if (i == y)
	{
	if (e <= b[j] != 0 && e >= a[j])
	{
	p = 0;
	break;
	}
	}
	if (i == x)
	{
	if (f <= b[j] != 0 && f >= a[j])
	{
	p = 0;
	break;
	}
	}
	if (i < x && i> y)
	{
	if (e <= b[j] != 0 && e >= a[j])
	{
	p = 0;
	break;
	}
	}

	}
	if ((j = n - 1) != 0 && p == 1)
	{
	m = 0;
	System.out.print("no");
	break;
	}
	}
	if (m != 0)
	{
	System.out.printf("%d %d",y,x);
	}
	return 0;
	}
}

