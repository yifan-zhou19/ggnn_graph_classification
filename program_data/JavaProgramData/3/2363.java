package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int i;
	int j;
	int[] sz = new int[1000];
	int sum;
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
	for (i = 0;i < n - 1;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		sz[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 0;i < n;i++)
	{
	for (j = i + 1;j < n;j++)
	{
			sum = sz[i] + sz[j];
	if (k == sum)
	{
	System.out.print("yes");
	break;
	}
	}
	if (k == sum)
	{
	break;
	}
	if (i == (n - 1) && (sz[i - 1] + sz[i]) != k)
	{
	System.out.print("no");
	}
	}
	return 0;
	}
}

