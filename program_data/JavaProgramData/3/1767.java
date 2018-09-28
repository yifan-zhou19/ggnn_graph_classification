package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int[] sz = new int[1000];
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
		int i;
		i = 0;
		while (i < n)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sz[i] = Integer.parseInt(tempVar3);
		}
		i++;
		}
		int f = 0;
		int sum;
		for (i = 0;i < n;i++)
		{
			for (int t = 0;t < n;t++)
			{
				sum = sz[i] + sz[t];
				if (sum == k)
				{
					f = 1;
					break;
				}
			}
		}
		if (f == 1)
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

