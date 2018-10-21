package <missing>;

public class GlobalMembers
{
	public static int[][] num = new int[9][9];
	public static int[][] t = new int[9][9];
	public static int Main()
	{
		int n;
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num[4][4] += m;
		t[4][4] += m;
		do
		{
			for (int i = 1;i < 8;i++)
			{
				for (int j = 1;j < 8;j++)
				{
					int temp = t[i][j];
					for (int k = i - 1;k < i + 2;k++)
					{
						for (int p = j - 1;p < j + 2;p++)
						{
							num[k][p] += temp;
						}
					}
				}
			}
					for (int i = 1;i < 8;i++)
					{
						for (int j = 1;j < 8;j++)
						{
							t[i][j] = num[i][j];
						}
					}
					n--;
		}while (n > 0);




				for (int i = 0;i < 9;i++)
				{
					for (int j = 0;j < 9;j++)
					{
						System.out.print(num[i][j]);
						if (j < 8)
						{
							System.out.print(" ");
						}
						else
						{
							System.out.print("\n");
						}
					}
				}
				return 0;
	}










}

