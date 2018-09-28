package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] O = new int[5][5];
		int[][] I = new int[5][5];
		int[][] J = new int[5][5];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(I,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(J,0,(Integer.SIZE / Byte.SIZE));
		for (int i = 0;i < 5;i++)
		{
			for (int j = 0;j < 5;j++)
			{
				O[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int maxX;
		int minY;
		int x;
		int y;
		for (int i = 0;i < 5;i++)
		{
			maxX = 0;
			minY = 100000;
			x = y = 0;
			for (int j = 0;j < 5;j++)
			{
				if (O[i][j] > maxX)
				{
					maxX = O[i][j];
					x = j;
				}
				if (O[j][i] < minY)
				{
					minY = O[j][i];
					y = j;
				}
			}
			I[i][x] = 1;
			J[y][i] = 1;
		}
		int OK = 0;
		int OKX = 0;
		int OKY = 0;

		for (int i = 0;i < 5;i++)
		{
			for (int j = 0;j < 5;j++)
			{
				if (I[i][j] != 0 && J[i][j] != 0)
				{
					OK = 1;
					OKX = i + 1;
					OKY = j + 1;
					break;
				}
			}
		}
		if (OK != 0)
		{
			System.out.print(OKX);
			System.out.print(' ');
			System.out.print(OKY);
			System.out.print(' ');
			System.out.print(O[OKX - 1][OKY - 1]);
		}
		else
		{
			System.out.print("not found");
		}
		return 0;
	}
}

