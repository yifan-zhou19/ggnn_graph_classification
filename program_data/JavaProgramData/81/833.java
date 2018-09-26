package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] sz = new int[5][5];
		int i;
		int p;
		for (i = 0;i < 5;i++)
		{
			for (p = 0;p < 5;p++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[i][p] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		if (m > 4 || n > 4)
		{
			System.out.print("error");
			return 0;
		}
		for (i = 0;i < 5;i++)
		{
			int tem;
			tem = sz[m][i];
			sz[m][i] = sz[n][i];
			sz[n][i] = tem;
		}
		for (i = 0;i < 5;i++)
		{
			System.out.printf("%d",sz[i][0]);
			for (p = 1;p < 5;p++)
			{
				System.out.printf(" %d",sz[i][p]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

