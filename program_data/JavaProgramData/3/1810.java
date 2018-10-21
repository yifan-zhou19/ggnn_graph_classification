package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int n;
	int k;
	int a = 0;
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
	int[] sz = new int[n];
	for (i = 0;i < n;i++)
	{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}

	}
	for (i = 0;i < n;i++)
	{

		for (j = 0;j < n;j++)
		{
				if (j == i)
				{
				continue;
				}

			if ((sz[i] + sz[j]) == k)
			{
				a++;
			}
		}
	}
	if (a > 0)
	{
		System.out.print("yes");
	}
	if (a == 0)
	{
		System.out.print("no");
	}
		return 0;
	}
}

