package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int max;
		int min;
		int a = 0;
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
	for (i = 0;i < n;i++)
	{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar3);
			}
	}
	for (j = 0;j < n - 1;j++)
	{
		min = sz[j];
		for (i = j + 1;i < n;i++)
		{
				max = sz[i];
		if (k == max + min)
		{
			a = a + 1;
		}
		}
	}
	if (a > 0)
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

