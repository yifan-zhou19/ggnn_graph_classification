package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int p = 0;
		int[] x = new int[20000];
		int[] y = new int[20000];
		int i;
		int j;
		int[][] map = new int[100][100];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(map,0,(Integer.SIZE / Byte.SIZE));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				map[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if ((map[i][j] >= map[i - 1][j]) && (map[i][j] >= map[i + 1][j]) && (map[i][j] >= map[i][j - 1]) && (map[i][j] >= map[i][j + 1]))
				{
					p++;
					x[p] = i;
					y[p] = j;
				}
			}
		}
		for (i = 1;i <= p;i++)
		{
			System.out.print(x[i] - 1);
			System.out.print(" ");
			System.out.print(y[i] - 1);
			if (i != p)
			{
				System.out.print("\n");
			}
		}
		return 0;
	}

}

