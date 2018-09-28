package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int[] sl = new int[1000];
		int[][] sz = new int[1000][1000];
		int i;
		int p;
		int s;
		s = 0;
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
				sl[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (p = 0;p < n;p++)
			{
				sz[i][p] = sl[i] + sl[p];
			}
		}
		for (i = 0;i < n;i++)
		{
			for (p = 0;p < n;p++)
			{
				if (sz[i][p] == k)
				{
					sz[i][p] = 1;
				}
				else
				{
					sz[i][p] = 0;
				}
				s = s + sz[i][p];
			}
		}
		if (s == 0)
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

