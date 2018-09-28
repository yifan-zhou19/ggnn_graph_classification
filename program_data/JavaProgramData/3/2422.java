package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int a;
	int i;
	int j;
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
	int[] sz = new int[1000];
	int[] zs = new int[1000];
	for (i = 0;i < n;i++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sz[i] = Integer.parseInt(tempVar3);
		}
		zs[i] = sz[i];
	}
	a = 0;
	for (i = 0;i < n;i++)
	{
		for (j = 0;j < n;j++)
		{
			if ((zs[j] + sz[i]) == k)
			{
				a = 1;
				break;
			}
		}
	}

	if (a == 1)
	{
		System.out.print("yes\n");
	}
	else
	{
		System.out.print("no\n");
	}
	return 0;
	}
}

