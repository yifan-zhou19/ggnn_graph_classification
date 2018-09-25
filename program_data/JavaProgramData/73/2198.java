package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] map = new int[5][5];
		int[] max = new int[5];
		int t;
		int i;
		int j;
		int t_max;
		char b = 1;
		for (i = 0;i < 5;i++)
		{
			t_max = 0;
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					t = Integer.parseInt(tempVar);
				}
				map[i][j] = t;
				if (t_max < t)
				{
					max[i] = j;
					t_max = t;
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (map[j][max[i]] < map[i][max[i]])
				{
					break;
				}
			}
			if (j == 5)
			{
				System.out.printf("%d %d %d\n",i + 1,max[i] + 1,map[i][max[i]]);
				b = 0;
			}
		}
		if (b != null)
		{
			System.out.print("not found\n");
		}
		return 0;
	}
}

