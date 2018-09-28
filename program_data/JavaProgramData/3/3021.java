package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int a;
	int b;
	int c;
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
	int[] sz = new int[n];
	for (int i = 0;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		(sz[i]) = Integer.parseInt(tempVar3);
	}
	}
	for (a = 0;a < n;a++)
	{
	for (b = a + 1;b < n;b++)
	{
	c = sz[a] + sz[b];
	if (c == k)
	{
	break;
	}
	}
	if (b != n)
	{
	System.out.print("yes");
	break;
	}
	}
	if (a == n)
	{
	System.out.print("no");
	}
	return 0;
	}

}

