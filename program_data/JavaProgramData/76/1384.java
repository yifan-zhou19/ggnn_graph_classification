package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] x = new int[100];
	int[] y = new int[100];
	int n;
	int i;
	int j;
	int a;
	int b;
	int c;
	int d;
	int p;
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
		x[i] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		y[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = n - 1;i >= 0;i--)
	{
	for (j = 0;j < i;j++)
	{
	if (x[j] > x[j + 1])
	{
	a = x[j + 1];
	x[j + 1] = x[j];
	x[j] = a;
	}
	if (y[j] > y[j + 1])
	{
	b = y[j + 1];
	y[j + 1] = y[j];
	y[j] = b;
	}
	}
	}
	c = x[0];
	d = y[n - 1];
	for (double k = c;k <= d;k += 0.1)
	{
	p = 0;
	for (i = 0;i < n;i++)
	{
	if (k >= x[i] != 0 && k <= y[i])
	{
	p++;
	}
	}
	if (p == 0)
	{
	System.out.print("no");
	return 0;
	}
	}
	System.out.printf("%d %d",c,d);
	return 0;
	}

}

