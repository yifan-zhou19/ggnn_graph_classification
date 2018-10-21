package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int i;
	int j;
	int z;
	int sum = 0;
	int x = 0;
	int[] sz = new int[1000];
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
	for (i = 0; i < n; i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		sz[i] = Integer.parseInt(tempVar3);
	}
	}
	for (j = 0;j < n - 1; j++)
	{
	for (z = j + 1;z < n; z++)
	{
	sum = sz[j] + sz[z];
	if (sum == k)
	{
		x++;
	}
	}
	}
	if (x == 0)
	{
		System.out.print("no");
	}
	else if (x != 0)
	{
		System.out.print("yes");
	}
	return 0;
	}



}

