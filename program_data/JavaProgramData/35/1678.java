package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[8][8];
		int c;
		int r;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			r = Integer.parseInt(tempVar2);
		}
		for (int i = 0;i < c;i++)
		{
			for (int j = 0;j < r;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (int k = 0;k < c;k++)
		{
			int q = 0;
			for (l = 1;l < r;l++)
			{
				if (sz[k][q] < sz[k][l])
				{
					q = l;
				}
			}
			for (l = 0;l < c;l++)
			{
				if (sz[l][q] < sz[k][q])
				{
					break;
				}
			}
			if (l == c)
			{
				System.out.printf("%d+%d",k,q);
				return 0;
			}
		}
		System.out.print("No");
		return 0;
	}

}

