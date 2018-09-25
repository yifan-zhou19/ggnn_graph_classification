package <missing>;

public class GlobalMembers
{
	public static int judge(int[][] s, int i, int j, int m, int n)
	{
			int ji = 0;
			if (((i - 1 >= 0) && (s[i][j] >= s[i - 1][j])) || (i == 0))
			{
			ji++;
			}
			if (((i + 1 <= m - 1) && (s[i][j] >= s[i + 1][j])) || (i == m - 1))
			{
			ji++;
			}
			if (((j - 1 >= 0) && (s[i][j] >= s[i][j - 1])) || (j == 0))
			{
			ji++;
			}
			if (((j + 1 <= n - 1) && (s[i][j] >= s[i][j + 1])) || (j == n - 1))
			{
			ji++;
			}
			if (ji == 4)
			{
			return 1;
			}
			else
			{
			return 0;
			}
	}
	public static int Main()
	{
		int m = 0;
		int n = 0;
		int i = 0;
		int j = 0;
		int[][] s = new int[22][22];
		  m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  for (i = 0;i <= m - 1;i++) //????
		  {
			 for (j = 0;j <= n - 1;j++)
			 {
				s[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 }
		  }
		  for (i = 0;i <= m - 1;i++)
		  {
			for (j = 0;j <= n - 1;j++)
			{
				   if (judge(s, i, j, m, n) != 0)
				   {
				   System.out.print(i);
				   System.out.print(" ");
				   System.out.print(j);
				   System.out.print("\n");
				   }
			}
		  }
	return 0;
	}

}

