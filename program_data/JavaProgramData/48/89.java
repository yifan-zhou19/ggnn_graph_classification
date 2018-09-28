package <missing>;

public class GlobalMembers
{
	public static int[][] num = new int[11][11];
	public static int[][] num1 = new int[11][11];
	public static int increase(int a,int time)
	{
		if (a == time)
		{
			return 1;
		}
		else
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(num1,0,(Integer.SIZE / Byte.SIZE));
			for (int i = 0;i < 11;i++)
			{
					num[i][0] = num[i][10] = num[0][i] = num[i][10] = 0;
			}
			for (int i = 1;i < 10;i++)
			{
					for (int j = 1;j < 10;j++)
					{
							if (num[i][j] != 0)
							{
											num1[i][j] = num1[i][j] + 2 * num[i][j];
											num1[i][j - 1] = num1[i][j - 1] + num[i][j];
											num1[i - 1][j] = num1[i - 1][j] + num[i][j];
											num1[i + 1][j] = num1[i + 1][j] + num[i][j];
											num1[i][j + 1] = num1[i][j + 1] + num[i][j];
											num1[i - 1][j - 1] = num1[i - 1][j - 1] + num[i][j];
											num1[i + 1][j - 1] = num1[i + 1][j - 1] + num[i][j];
											num1[i - 1][j + 1] = num1[i - 1][j + 1] + num[i][j];
											num1[i + 1][j + 1] = num1[i + 1][j + 1] + num[i][j];
							}
					}
			}
			for (int i = 0;i < 11;i++)
			{
					for (int j = 0;j < 11;j++)
					{
							num[i][j] = num1[i][j];
					}
			}
			return increase(a + 1, time);
		}
	}
	public static int Main()
	{
		int n;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num1,0,(Integer.SIZE / Byte.SIZE));
		num[5][5] = n;
		num[5][5] = n;
		increase(0, t);
		for (int i = 1;i < 10;i++)
		{
				for (int j = 1;j < 9;j++)
				{
						System.out.print(num1[i][j]);
						System.out.print(' ');
				}
				System.out.print(num1[i][9]);
				System.out.print("\n");
		}
		return 0;
	}

}

