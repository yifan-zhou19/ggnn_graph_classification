package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int k;
		int i;
		int j;
		int[] sz = new int[1000];
		int tag = 0;
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
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i;j < n;j++)
			{
				if (sz[i] + sz[j] == k)
				{
					tag = 1;
				}
			}
		}
		if (tag != 0)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
	}
}

