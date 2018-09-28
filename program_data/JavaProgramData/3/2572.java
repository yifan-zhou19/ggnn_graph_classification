package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int i;
	int[] sz = new int[1000];
	int a;
	int[] sa = new int[1000];
	int ye = 0;
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
	for (i = 0;i < n;i++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			(sz[i]) = Integer.parseInt(tempVar3);
		}
		sa[i] = sz[i];
	}
	for (i = 0;i < n - 1;i++)
	{
		for (a = i + 1;a < n;a++)
		{
			if (sz[i] + sa[a] == k)
			{
			ye = 1;
			break;
			}
		}
		if (ye == 1)
		{
			break;
		}
	}
	if (ye == 1)
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

