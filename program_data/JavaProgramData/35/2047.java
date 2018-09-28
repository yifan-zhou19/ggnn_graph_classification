package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int a;
		int b;
		int[][] p = new int[8][8];
		int k;
		int x;
		int l = 0;
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
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < b;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < b;j++)
			{
				x = 0;
				for (k = 0;k < b;k++)
				{
					if (p[i][j] >= p[i][k])
					{
						x++;
					}
				}
				if (x == b)
				{
					x = 0;
					for (k = 0;k < a;k++)
					{
						if (p[i][j] <= p[k][j])
						{
							x++;
						}
					}
					if (x == a)
					{
						System.out.printf("%d+%d",i,j);
						l++;
					}
				}
			}
		}
		if (l == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

