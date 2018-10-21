package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[8][8];
		int i;
		int j;
		int a;
		int b;
		int p;
		int max;
		int[] row = new int[8];
		int[] col = new int[8];
		int l = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= a;i++)
		{
			for (j = 1;j <= b;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 1;i <= a;i++)
		{
			for (j = 1,max = 1;j <= b - 1;j++)
			{
				if (sz[i][j] < sz[i][j + 1])
				{
					max = j + 1;
				}
			}
				p = 0;
				for (int k = 1;k <= a;k++)
				{
					if (sz[i][max] > sz[k][max])
					{
						p = 1;
						break;
					}
				}
					if (p == 0)
					{
						row[l] = i - 1;
						col[l] = max - 1;
						l++;
					}
		}
		if (l == 1)
		{
			System.out.print("No");
		}
		else
		{
		for (int o = 1;o <= l - 1;o++)
		{
			System.out.printf("%d+%d\n",row[o],col[o]);
		}
		}
		 return 0;
	}

}

