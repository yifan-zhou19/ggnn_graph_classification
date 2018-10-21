package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int i;
	int[] sz = new int[1000];
	int e;
	int l;
	int b = 0;
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
	for (i = 0;i <= (n - 1);i++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sz[i] = Integer.parseInt(tempVar3);
		}
	}
	for (e = 0;e <= (n - 2);e++)
	{
	for (l = (e+1);l <= (n - 1);l++)
	{
		if (k == sz[e] + sz[l])
		{
			b = 1;
			break;
		}
	}
	}
	if (b == 0)
	{
		System.out.print("no");
	}
	if (b == 1)
	{
		System.out.print("yes");
	}
	return 0;
	}

}

