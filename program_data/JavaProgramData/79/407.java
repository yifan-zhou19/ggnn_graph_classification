package <missing>;

public class GlobalMembers
{
	public static int yos(int n,int m)
	{
		int[] a = new int[1000];
		int i;
		int j;
		int x = 0;
		int y;
	for (i = 1;i <= n;i++)
	{
		a[i] = 1;
	}
	for (i = 1;i < n;i++)
	{
	for (j = 1;j <= m;j++)
	{
		do
		{
		x++;
		if (x > n)
		{
			x = 1;
		}
		} while (a[x] == 0);
	}
	a[x] = 0;
	}
	for (i = 1;i <= n;i++)
	{
	if (a[i] != 0)
	{
		return (i);
	}
	}
	}
	public static int Main()
	{
	int m;
	int n;
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
	while (m != 0)
	{
	System.out.printf("%d\n",yos(n, m));
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		n = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		m = Integer.parseInt(tempVar4);
	}
	}
	}
}

