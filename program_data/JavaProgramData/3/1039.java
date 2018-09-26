package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int i;
	int j;
	int[] sz = new int[N];
	int[] a = new int[N];
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
	for (i = 1;i <= n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		sz[i] = Integer.parseInt(tempVar3);
	}
	a[i] = k - sz[i];
	}
	int found = 0;
	for (i = 1;i <= n;i++)
	{
		for (j = 1;j <= n;j++)
		{
			if (a[i] == sz[j])
			{
				found = 1;
				break;
			}
		}
		if (found == 1)
		{
			break;
		}
	}
	if (found == 1)
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

