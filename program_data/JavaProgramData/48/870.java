package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[11][11];
	public static int[][] temp = new int[11][11];
	public static void f(int x,int y)
	{
		int v = a[x][y];
		for (int i = -1;i <= 1;i++)
		{
			for (int j = -1;j <= 1;j++)
			{
				if (i == 0 && j == 0)
				{
					temp[x + i][y + j] += v * 2;
				}
				else
				{
					temp[x + i][y + j] += v;
				}
			}
		}
		return;
	}
	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		a[5][5] = m;
		for (int k = 0;k < n;k++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(temp,0,(Integer.SIZE / Byte.SIZE));
			for (int i = 1;i <= 9;i++)
			{
				for (int j = 1;j <= 9;j++)
				{
					if (a[i][j] > 0)
					{
						f(i, j);
					}
				}
			}
			for (int i = 1;i <= 9;i++)
			{
				for (int j = 1;j <= 9;j++)
				{
					a[i][j] = temp[i][j];
				}
			}
		}
			for (int i = 1;i <= 9;i++)
			{
				for (int j = 1;j <= 8;j++)
				{
					System.out.print(a[i][j]);
					System.out.print(" ");
				}
				System.out.print(a[i][9]);
				System.out.print("\n");
			}
			return 0;
	}

}

