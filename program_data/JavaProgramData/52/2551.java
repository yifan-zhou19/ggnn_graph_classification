package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	int[] sz = new int[10000];
	for (i = 0;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		sz[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = n;i < n + n - m;i++)
	{
	sz[i] = sz[i - n];
	}
	for (i = n - m;i < n + n - m - 1;i++)
	{
	System.out.printf("%d ",sz[i]);
	}
	System.out.printf("%d",sz[n + n - m - 1]);
	return 0;
	}


}

