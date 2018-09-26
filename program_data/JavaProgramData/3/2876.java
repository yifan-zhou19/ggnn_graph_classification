package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int i;
	int m;
	int[] sz1 = new int[1000];
	int[] sz2 = new int[1000];
	int t = 0;
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
	for (i = 0;i < n;i++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			(sz1[i]) = Integer.parseInt(tempVar3);
		}
		sz2[i] = sz1[i];
	}
	for (m = 0;m < n;m++)
	{
		for (i = 0;i < n;i++)
		{
			if (k == sz1[m] + sz2[i])
			{
				t++;
			}
		}
	}
	if (t > 0)
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

