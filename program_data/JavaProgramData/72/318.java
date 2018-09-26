package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] height = new int[200][200];
		int[][] flag = new int[200][200];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(flag, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(height, 0, (Integer.SIZE / Byte.SIZE));
		for (int i = 1; i <= m; i++)
		{
			for (int j = 1; j <= n ;j++)
			{
				height[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 1; i <= m; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				if (height[i][j] >= height[i - 1][j] != 0 && height[i][j] >= height[i + 1][j] != 0 && height[i][j] >= height[i][j - 1] != 0 && height[i][j] >= height[i][j + 1])
				{
					flag[i][j] = 1;
				}
			}
		}
		for (int i = 1; i <= m; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				if (flag[i][j] != 0)
				{
					System.out.print(i - 1);
					System.out.print(" ");
					System.out.print(j - 1);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}



}

