package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] height = new int[22][22];
		int[][] top = new int[21][21];
		int m = 0;
		int n = 0;
		int i = 0;
		int j = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= m + 1;i++)
		{
		   for (j = 0;j <= n + 1;j++)
		   {
			   if (i == 0 || j == 0 || i == m + 1 || j == n + 1)
			   {
				   height[i][j] = 0;
			   }
			   else
			   {
				   height[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			   }
			   top[i][j] = 0;
		   }
		}
		for (i = 1;i <= m;i++)
		{
		   for (j = 1;j <= n;j++)
		   {
			   if (height[i][j] >= height[i - 1][j] != 0 && height[i][j] >= height[i + 1][j] != 0 && height[i][j] >= height[i][j - 1] != 0 && height[i][j] >= height[i][j + 1])
			   {
			   top[i][j] = 1;
			   }
		   }
		}
		for (i = 0;i <= m;i++)
		{
		   for (j = 0;j <= n;j++)
		   {
		   if (top[i][j] == 1)
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

