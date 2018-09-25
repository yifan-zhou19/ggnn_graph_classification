package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] height = new int[21][21];
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int k;
		int sum = 0;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				height[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				sum += height[i][j];
			}
		}

		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (i == 0 && j != 0 && j != n - 1)
				{
					if (height[i][j] >= height[i + 1][j] != 0 && height[i][j] >= height[i][j + 1] != 0 && height[i][j] >= height[i][j - 1])
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j);
						System.out.print("\n");
					}
				}
				else if (i == m - 1 && j != 0 && j != n - 1)
				{
					 if (height[i][j] >= height[i - 1][j] != 0 && height[i][j] >= height[i][j + 1] != 0 && height[i][j] >= height[i][j - 1])
					 {
						 System.out.print(i);
						 System.out.print(" ");
						 System.out.print(j);
						 System.out.print("\n");
					 }
				}
				else if (j == 0 && i != 0 && i != m - 1)
				{
					 if (height[i][j] >= height[i - 1][j] != 0 && height[i][j] >= height[i][j + 1] != 0 && height[i][j] >= height[i + 1][j])
					 {
						 System.out.print(i);
						 System.out.print(" ");
						 System.out.print(j);
						 System.out.print("\n");
					 }
				}
				else if (j == n - 1 && i != 0 && i != m - 1)
				{
					 if (height[i][j] >= height[i - 1][j] != 0 && height[i][j] >= height[i + 1][j] != 0 && height[i][j] >= height[i][j - 1])
					 {
						 System.out.print(i);
						 System.out.print(" ");
						 System.out.print(j);
						 System.out.print("\n");
					 }
				}
				else if (j == n - 1 && i == 0)
				{

					 if (height[i][j] >= height[i + 1][j] != 0 && height[i][j] >= height[i][j - 1])
					 {
						 System.out.print(i);
						 System.out.print(" ");
						 System.out.print(j);
						 System.out.print("\n");
					 }
				}
				else if (j == n - 1 && i == m - 1)
				{

					 if (height[i][j] >= height[i - 1][j] != 0 && height[i][j] >= height[i][j - 1])
					 {
						 System.out.print(i);
						 System.out.print(" ");
						 System.out.print(j);
						 System.out.print("\n");
					 }
				}
				else if (j == 0 && i == 0)
				{

					 if (height[i][j] >= height[i + 1][j] != 0 && height[i][j] >= height[i][j + 1])
					 {
						 System.out.print(i);
						 System.out.print(" ");
						 System.out.print(j);
						 System.out.print("\n");
					 }
				}
				else if (j == 0 && i == m - 1)
				{

					 if (height[i][j] >= height[i - 1][j] != 0 && height[i][j] >= height[i][j + 1])
					 {
						 System.out.print(i);
						 System.out.print(" ");
						 System.out.print(j);
						 System.out.print("\n");
					 }
				}
				else
				{
					 if (height[i][j] >= height[i - 1][j] != 0 && height[i][j] >= height[i + 1][j] != 0 && height[i][j] >= height[i][j + 1] != 0 && height[i][j] >= height[i][j - 1])
					 {
						 System.out.print(i);
						 System.out.print(" ");
						 System.out.print(j);
						 System.out.print("\n");
					 }
				}
			}
		}

		return 0;
	}
}

