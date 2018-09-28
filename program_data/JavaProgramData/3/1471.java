package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int k;
	int n;
	int i;
	int m;
	int x;
	int y;
	int z;
	int c;
	c = 0;
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
	int[] a = new int[n];
	for (i = 0;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		(a[i]) = Integer.parseInt(tempVar3);
	}
	}
	for (i = 0;i < n;i++)
	{
	for (x = 0;x < n;x++)
	{
	if (x == i)
	{
	continue;
	}
	if (a[x] + a[i] == k)
	{
	c = 1;
	}
	}
	}
	if (c == 0)
	{
	System.out.print("no");
	}
	else
	{
	System.out.print("yes");
	}
	return 0;
	}


}

