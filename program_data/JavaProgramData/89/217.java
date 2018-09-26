package <missing>;

public class GlobalMembers
{
	public static int[][] map = new int[9000][9000];
	public static int Main()
	{
		int n;
		int i;
		int j;
		int found = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			i = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			j = Integer.parseInt(tempVar3);
		}
		while ((i != 0) || (j != 0))
		{
			map[i][j] = 1;
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				i = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				j = Integer.parseInt(tempVar5);
			}
		}
		for (i = 0; i < n; i++)
		{
			int mark = 0;
			for (j = 0; j < n; j++)
			{
				if ((map[i][j] == 1) && (i != j))
				{
					mark = 1;
					break;
				}
			}
			if (mark == 0)
			{
				int mark2 = 0;
				for (j = 0; j < n; j++)
				{
					if ((j != i) && (map[j][i] == 1))
					{
						mark2++;
					}
				}
				if (mark2 == n - 1)
				{
					found = 1;
					System.out.printf("%d\n", i);
					break;
				}
			}
		}
		if (found == 0)
		{
			System.out.print("NOT FOUND\n");
		}
		return 0;
	}



}

