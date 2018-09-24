package <missing>;

public class GlobalMembers
{
	public static int he(int x)
	{
	if (x == 1)
	{
		return 1;
	}
	if (x == 2)
	{
		return 1;
	}
	int[] sz = new int[20];
	int e;
	sz[0] = 1;
	sz[1] = 1;
	for (e = 3;e <= x;e++)
	{
		sz[e-1] = sz[e-2] + sz[e-3];
	}
	return sz[x - 1];
	}
	public static int Main()
	{
	int n;
	int a;
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
		a = Integer.parseInt(tempVar2);
	}

	System.out.printf("%d\n",he(a));
	}
	return 0;
	}
}

