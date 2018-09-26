package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int[][] sz1 = new int[number][number];
		int j;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = Integer.parseInt(tempVar2);
		}
		for (j = 0;j < y;j++)
		{
			for (l = 0;l < x;l++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(sz1[j][l]) = Integer.parseInt(tempVar3);
				}
			}
		}
		for (j = 0;j < y;j++)
		{
			for (l = 0;l < x;l++)
			{
				if (j != 0 && l != 0 && j != y - 1 && l != x - 1)
				{
					if (sz1[j][l] >= sz1[j + 1][l] != 0 && sz1[j][l] >= sz1[j - 1][l] != 0 && sz1[j][l] >= sz1[j][l - 1] != 0 && sz1[j][l] >= sz1[j][l + 1])
					{
						System.out.printf("%d %d\n", j, l);
					}
				}
				else if (j == 0 && l != 0 && l != x - 1)
				{
					if (sz1[j][l] >= sz1[j + 1][l] != 0 && sz1[j][l] >= sz1[j][l - 1] != 0 && sz1[j][l] >= sz1[j][l + 1])
					{
						System.out.printf("%d %d\n", j, l);
					}
				}
				else if (j == 0 && l == 0)
				{
					if (sz1[j][l] >= sz1[j + 1][l] != 0 && sz1[j][l] >= sz1[j][l + 1])
					{
						System.out.printf("%d %d\n", j, l);
					}
				}
				else if (j == 0 && l == x - 1)
				{
					if (sz1[j][l] >= sz1[j + 1][l] != 0 && sz1[j][l] >= sz1[j][l - 1])
					{
						System.out.printf("%d %d\n", j, l);
					}
				}
				else if (l == 0 && j != y - 1)
				{
					if (sz1[j][l] >= sz1[j + 1][l] != 0 && sz1[j][l] >= sz1[j - 1][l] != 0 && sz1[j][l] >= sz1[j][l + 1])
					{
						System.out.printf("%d %d\n", j, l);
					}
				}
				else if (l == 0 && j == y - 1)
				{
					if (sz1[j][l] >= sz1[j - 1][l] != 0 && sz1[j][l] >= sz1[j][l + 1])
					{
						System.out.printf("%d %d\n", j, l);
					}
				}
				else if (j == y - 1 && l != y - 1)
				{
					if (sz1[j][l] >= sz1[j][l + 1] != 0 && sz1[j][l] >= sz1[j - 1][l] != 0 && sz1[j][l] >= sz1[j][l - 1])
					{
						System.out.printf("%d %d\n", j, l);
					}
				}
				else if (j == y - 1 && l == y - 1)
				{
					if (sz1[j][l] >= sz1[j - 1][l] != 0 && sz1[j][l] >= sz1[j][l - 1])
					{
						System.out.printf("%d %d\n", j, l);
					}
				}
				else
				{
					if (sz1[j][l] >= sz1[j + 1][l] != 0 && sz1[j][l] >= sz1[j - 1][l] != 0 && sz1[j][l] >= sz1[j][l - 1])
					{
						System.out.printf("%d %d\n", j, l);
					}
				}
			}
		}
		return 0;
	}

}

