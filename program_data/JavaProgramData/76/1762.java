package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] a = new int[50000];
	int[] b = new int[50000];
	int p = 10000;
	int q = 0;
	int m;
	double k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b[i] = Integer.parseInt(tempVar3);
	}
	if (a[i] < p)
	{
	p = a[i];
	}
	if (b[i] > q)
	{
	q = b[i];
	}
	}
	for (k = p + 0.5;k < q;k++)
	{
	for (m = 0;m < n;m++)
	{
	if (k > a[m] && k < b[m])
	{
	break;
	}
	}
	if (m == n)
	{
	System.out.print("no");
	break;
	}
	else
	{
	continue;
	}
	}
	if (k == q + 0.5)
	{
	System.out.printf("%d %d",p,q);
	}
	return 0;
	}
}

