package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int j;
	int i;
	int n;
	int k;
	int s = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	int[] sz = new int[n];
	for (i = 0;i <= n - 1;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		sz[i] = Integer.parseInt(tempVar3);
	}
	for (j = 0;j <= i;j++)
	{
	if (sz[i] + sz[j] == k)
	{
	s++;
	}
	}
	}
	if (s > 0)
	{
		System.out.print("yes");
	}
	else
	{
		System.out.print("no");
	}
	return 0;
	}
}

