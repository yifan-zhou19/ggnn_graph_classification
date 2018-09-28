package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] h = new int[m + 2][n + 2];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(h,0,(Integer.SIZE / Byte.SIZE));
		for (i = 1;i < m + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
				h[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1;i < m + 1;i++)
		{
			for (j = 1;j < 1 + n;j++)
			{
				if ((h[i][j] >= h[i][j + 1]) && (h[i][j] >= h[i][j - 1]) && (h[i][j] >= h[i + 1][j]) && (h[i][j] >= h[i - 1][j]))
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

