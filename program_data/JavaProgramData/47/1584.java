package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int a;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] sz = new int[n];
	for (int i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		sz[i] = Integer.parseInt(tempVar2);
	}
	}
	for (int k = 0;k < (n / 2);k++)
	{
	a = sz[n - 1 - k];
	sz[n - 1 - k] = sz[k];
	sz[k] = a;
	}
	for (int k = 0;k < n - 1;k++)
	{
		System.out.printf("%d ",sz[k]);
	}
	System.out.printf("%d",sz[n - 1]);
	return 0;
	}
}

