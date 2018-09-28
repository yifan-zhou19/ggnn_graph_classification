package <missing>;

public class GlobalMembers
{
	public static int[][] map = new int[10][10];
	public static int[][] add = new int[10][10];
	public static int m;
	public static int n;
	//???? 
	public static void Generate(int x,int y)
	{
		int v = map[x][y];
		for (int i = -1;i <= 1;i++)
		{
			for (int j = -1;j <= 1;j++)
			{
				if (i == 0 && j == 0)
				{
					add[x + i][y + j] += v * 2;
				}
				else
				{
					add[x + i][y + j] += v;
				}
			}
		}
		return;
	}
	public static int Main()
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(map,0,(Integer.SIZE / Byte.SIZE));
		map[5][5] = m;
		for (int k = 0;k < n;k++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(add,0,(Integer.SIZE / Byte.SIZE));
			for (int i = 1;i < 10;i++)
			{
				for (int j = 1;j < 10;j++)
				{
					if (map[i][j] != 0)
					{
						Generate(i, j);
					}
				}
			}
			for (int i = 1;i < 10;i++)
			{
				for (int j = 1;j < 10;j++)
				{
					map[i][j] = add[i][j];
				}
			}
		}
		for (int i = 1;i < 10;i++)
		{
			for (int j = 1;j < 10;j++)
			{
				if (j != 1)
				{
					System.out.print(" ");
					System.out.print(map[i][j]);
				}
				else
				{
					System.out.print(map[i][j]);
				}
			}
			System.out.print("\n");
		}
		return 0;
	}

}

