package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] num = new int[22][22];
		int i;
		int j;
		int m;
		int n;
		while ((m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(num,0,(Integer.SIZE / Byte.SIZE));
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				num[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if ((num[i][j] >= num[i][j - 1]) && (num[i][j] >= num[i][j + 1]) && (num[i][j] >= num[i + 1][j]) && (num[i][j] >= num[i - 1][j]))
				{
					System.out.print(i - 1);
					System.out.print(" ");
					System.out.print(j - 1);
					System.out.print("\n");
				}
			}
		}
		}
		return 0;
	}

}

