package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int x;
	int y;
	int n;
	int k;
	int i = 0;
	int m = 0;
	int[] sz = new int[100000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	for (i = 0;i <= n - 1;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		sz[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 0;i <= n - 2;i++)
	{
	for (x = i;x <= n - 2;x++)
	{
	y = sz[i] + sz[x + 1];
	if (y == k)
	{
	m++;
	}
	}
	}
	if (m != 0)
	{
	System.out.print("yes");
	}
	else if (m == 0)
	{
		System.out.print("no");
	}
	return 0;
	}
}

