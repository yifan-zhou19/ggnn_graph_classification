package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int sum = 0;
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
		int[] sz = new int[1000];
		for (int i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		for (int j = 0;j < n;j++)
		{
			for (int h = 0;h < n;h++)
			{
				if (sz[j] + sz[h] == k)
				{
					sum++;
				}
			}
		}
		if (sum == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.print("yes");
		}
		return 0;
	}

}

