package <missing>;

public class GlobalMembers
{
	//********************************
	//*???4.cpp   **
	//*?????? 1200012768 **
	//*???2013.1.4  **
	//*???????  **
	//********************************
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] h = new int[22][22];
		int[][] flag = new int[20][20];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= m; i++)
		{
			for (j = 1; j <= n; j++)
			{
				h[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1; i <= m; i++)
		{
			for (j = 1; j <= n; j++)
			{
				if (h[i][j] >= h[i - 1][j])
				{
					flag[i][j]++;
				}
				if (h[i][j] >= h[i + 1][j])
				{
					flag[i][j]++;
				}
				if (h[i][j] >= h[i][j - 1])
				{
					flag[i][j]++;
				}
				if (h[i][j] >= h[i][j + 1])
				{
					flag[i][j]++;
				}
				if (flag[i][j] == 4)
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

