package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int i;
	int s;
	int j;
	int[] sz = new int[1000];
	int h;
	int f = 0;
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
	s = 0;
	for (h = 0;h < n;h++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			(sz[h]) = Integer.parseInt(tempVar3);
		}
	}
	for (i = 0;i < n;i++)
	{
		for (j = i + 1;j < n;j++)
		{
			if (((sz[i] + sz[j]) == k) && (f == 0))
			{
				System.out.print("yes");
				f = 1;
				break;
			}
		}
		if (f == 1)
		{
			break;
		}
	}
	if (f == 0)
	{
	   System.out.print("no");
	}
	return 0;
	}
}

