package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10003];
	int n;
	int i;
	int x;
	int y;
	int j;
	int q;
	int m;
	int t;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	t = 1;
	for (j = 0;j < 1;j++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		x = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		y = Integer.parseInt(tempVar3);
	}
	m = y;
	q = x;
	for (i = x;i <= y;i++)
	{
	a[i] = 1;
	}
	}
	for (j = 1;j < n;j++)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		x = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ");
	if (tempVar5 != null)
	{
		y = Integer.parseInt(tempVar5);
	}
	if (y >= m)
	{
		m = y;
	}
	if (x <= q)
	{
		q = x;
	}
	if (x != y)
	{
	for (i = x;i < y;i++)
	{
	a[i] = 1;
	}
	}
	else
	{
		for (i = x;i < x + 1;i++)
		{
	a[i] = 1;
		}
	}
	}
	for (i = q;i < m;i++)
	{
		if (a[i] == 0)
		{
		System.out.print("no");
		t = 0;
		break;
		}
	}
	if (t == 1)
	{
		System.out.printf("%d %d",q,m);
	}
	return 0;
	}
}

