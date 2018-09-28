package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] num = new int[22][22];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num,0,(Integer.SIZE / Byte.SIZE));
		int n = 0;
		int m = 0;
		int i = 0;
		int j = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				num[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (j = 1;j <= m;j++)
		{
			for (i = 1;i <= n;i++)
			{
				if (num[j][i] >= num[j - 1][i] != 0 && num[j][i] >= num[j + 1][i] != 0 && num[j][i] >= num[j][i + 1] != 0 && num[j][i] >= num[j][i - 1])
				{
					System.out.print(j - 1);
					System.out.print(" ");
					System.out.print(i - 1);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

