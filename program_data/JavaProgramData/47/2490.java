package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int t;
	int[] sz = new int[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n - 1;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		sz[i] = Integer.parseInt(tempVar2);
	}
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		sz[n - 1] = Integer.parseInt(tempVar3);
	}
	for (i = 0,j = n - 1;i < j;i++,j--)
	{
	t = sz[j];
	sz[j] = sz[i];
	sz[i] = t;
	}
	for (i = 0;i < n - 1;i++)
	{
	System.out.printf("%d ",sz[i]);
	}
	System.out.printf("%d",sz[n - 1]);
	return 0;
	}
}

