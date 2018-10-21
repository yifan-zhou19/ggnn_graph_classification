package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int x1;
	int y1;
	int x2;
	int y2;
	int[][] num1 = new int[100][100];
	int[][] num2 = new int[100][100];
	int[][] num = new int[100][100];
	x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0;i <= x1 - 1;i++)
	{
		for (int j = 0;j <= y1 - 1;j++)
		{
			num1[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0;i <= x2 - 1;i++)
	{
		for (int j = 0;j <= y2 - 1;j++)
		{
			num2[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	for (int i = 0;i <= x1 - 1;i++)
	{
		int p = 0;
		for (int j = 0;j <= y2 - 1;j++)
		{
			num[i][j] = 0;
			for (int a = 0;a <= y1 - 1;a++)
			{
				num[i][j] += (num1[i][a] * num2[a][j]);
			}
			if (p >= 1)
			{
				System.out.print(" ");
			}
			System.out.print(num[i][j]);
			p++;

		}
		System.out.print("\n");
	}

	}

}

