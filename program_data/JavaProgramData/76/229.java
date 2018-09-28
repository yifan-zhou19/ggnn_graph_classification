package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int n;
	int q;
	int t;
	int t1;
	int t2;
	int[] a = new int[10001];
	int[] b = new int[10001];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	q = 0;
	for (i = 1;i <= n;i++)
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
	}
	for (i = 1;i <= n;i++)
	{
	for (j = 1;j <= n - 1;j++)
	{
	if (a[j] > a[j + 1])
	{
	t = a[j];
	a[j] = a[j + 1];
	a[j + 1] = t;
	t = b[j];
	b[j] = b[j + 1];
	b[j + 1] = t;
	}
	}
	}
	t1 = a[1];
	t2 = b[1];
	for (i = 2;i <= n;i++)
	{
	if ((b[i] < t1) || (t2 < a[i]))
	{
	q = q + 1;
	}
	if (a[i] < t1)
	{
	t1 = a[i];
	}
	if (b[i] > t2)
	{
	t2 = b[i];
	}
	}
	if (q == 0)
	{
	 System.out.printf("%d %d",t1,t2);
	}
	else
	{
		System.out.print("no");
	}
	return 0;
	}
}

