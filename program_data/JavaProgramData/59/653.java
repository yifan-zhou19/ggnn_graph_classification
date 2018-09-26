package <missing>;

public class GlobalMembers
{
	public static int[][] DORM = new int[MAXN][MAXN];
	public static int N;
	public static int[][] SIGN = new int[MAXN][MAXN];
	public static void aff(int x, int y)
	{
		if (x >= 0 && x < N && y >= 0 && y < N)
		{
			if (DORM[x][y] == -1 && SIGN[x][y] == 0)
			{
				DORM[x][y] = 1;
				SIGN[x][y] = 1;
			}
		}
	}

	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(DORM,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(SIGN,0,(Integer.SIZE / Byte.SIZE));
		int M;
		int sum = 0;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < N;i++)
		{
			System.in.read();
			for (int j = 0;j < N;j++)
			{
				char m;
				cin.get(m);
				switch (m)
				{
					case '.':
						DORM[i][j] = -1;
						break;
					case '#':
						DORM[i][j] = 0;
						break;
					case '@':
						DORM[i][j] = 1;
						break;
				}
			}
		}
		M = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int m = 1;m < M;m++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(SIGN,0,(Integer.SIZE / Byte.SIZE));
			for (int i = 0;i < N;i++)
			{
				for (int j = 0;j < N;j++)
				{
					if (DORM[i][j] == 1 && SIGN[i][j] == 0)
					{
						aff(i, j + 1);
						aff(i, j - 1);
						aff(i + 1, j);
						aff(i - 1, j);
					}
				}
			}
		}
		for (int i = 0;i < N;i++)
		{
			for (int j = 0;j < N;j++)
			{
				if (DORM[i][j] == 1)
				{
					sum++;
				}
			}
		}
		System.out.print(sum);
		return 0;
	}



}

