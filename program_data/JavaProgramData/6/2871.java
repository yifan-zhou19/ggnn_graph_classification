package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k = 0;
		int[][] juzhen = new int[100][100];
		int m = 0;
		int n = 0;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k > 0)
		{
			m = 0;
			n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(juzhen, 0,(Integer.SIZE / Byte.SIZE));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int i = 0;
			int j = 0;
			int sum = 0;
			for (i = 0; i <= m - 1; i++)
			{
				for (j = 0; j <= n - 1; j++)
				{
					juzhen[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (i = 0; i <= n - 1; i++)
			{
				sum = sum + *((juzhen) + i);
			}
			for (i = 0; i <= n - 1; i++)
			{
				sum = sum + *(*(juzhen + m - 1) + i);
			}
			for (j = 1; j <= m - 2; j++)
			{
				sum = sum + *(*(juzhen + j));
			}
			for (j = 1; j <= m - 2; j++)
			{
				sum = sum + *(*(juzhen + j) + n - 1);
			}
			System.out.print(sum);
			System.out.print("\n");
			k--;
		}
		return 0;
	}
}

