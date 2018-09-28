package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int s;
	int m;
	int t;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] a = new int[50000];
	int[] b = new int[50000];
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
	if (i == 0)
	{
	s = a[i];
	m = b[i];
	}
	}
	for (i = 0;i < n;i++)
	{
	if (s > a[i])
	{
	s = a[i];
	}
	}
	for (i = 0;i < n;i++)
	{
	if (m < b[i])
	{
	m = b[i];
	}
	}
	int p = 0;
	double e;
	for (e = s + 0.5;e < m;e++)
	{
	t = 0;
	for (i = 0;i < n;i++)
	{
	if ((e > a[i] && e < b[i]))
	{
	t = 1;
	break;
	}
	}
	if (t == 0)
	{
	p = 1;
	}

	}
	if (p == 0)
	{
	System.out.printf("%d %d",s,m);
	}
	else
	{
	System.out.print("no");
	}
	return 0;
	}

}

