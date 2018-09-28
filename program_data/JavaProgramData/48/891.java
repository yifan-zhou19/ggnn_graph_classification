package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] container = new int[10][10];
		int[][] temp = new int[10][10];
		int m;
		int day;
		int i;
		int j;
		int k;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		container[5][5] = m;
		for (i = 1;i <= day;i++) //?i?
		{
			for (j = 1;j <= 9;j++)
			{
				for (k = 1;k <= 9;k++) //???????????0??
				{
					if (container[j][k] != 0)
					{
						temp[j][k] += container[j][k] * 2; //???2
						temp[j - 1][k] += container[j][k];
						temp[j + 1][k] += container[j][k];
						temp[j][k - 1] += container[j][k];
						temp[j][k + 1] += container[j][k];
						temp[j - 1][k + 1] += container[j][k];
						temp[j - 1][k - 1] += container[j][k];
						temp[j + 1][k - 1] += container[j][k];
						temp[j + 1][k + 1] += container[j][k]; //????????1
					}

				}
			}

			for (j = 1;j <= 9;j++)
			{
				for (k = 1;k <= 9;k++)
				{
					container[j][k] = temp[j][k]; //?????????????container
				}
			}
			for (j = 1;j <= 9;j++)
			{
				for (k = 1;k <= 9;k++)
				{
					temp[j][k] = 0;
				}
			}
		}
		//?????????
		for (i = 1;i <= 9;i++)
		{
			for (j = 1;j <= 8;j++)
			{
				System.out.print(container[i][j]);
				System.out.print(" ");
			}
			System.out.print(container[i][9]);
			System.out.print("\n");
		}
		return 0;
	}
}

