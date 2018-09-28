package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] desk = new int[5][5];
		int n;
		int m;
		int temp;
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				desk[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n >= 0 && n < 5 && m > 0 && m < 5)
		{
			for (int i = 0; i < 5; i++)
			{
				temp = desk[n][i];
				desk[n][i] = desk[m][i];
				desk[m][i] = temp;
			}
			for (int i = 0; i < 5; i++)
			{
				for (int j = 0; j < 5; j++)
				{
					if (j != 0)
					{
						System.out.print(' ');
					}
					System.out.print(desk[i][j]);
				}
				System.out.print("\n");
			}
		}
		else
		{
			System.out.print("error");
			System.out.print("\n");
		}
		return 0;
	}

}

