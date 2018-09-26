package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int[][] sign = new int[5][5];
		int max;
		int flag = 0;
		for (int i = 0; i < 5; i++)
		{
			max = 0;
			for (int j = 0; j < 5; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i][j] > max)
				{
					max = a[i][j];
				}
			}
			for (int k = 0; k < 5; k++)
			{
				if (a[i][k] == max)
				{
					sign[i][k] = 1;
				}
			}
		}
		for (int m = 0; m < 5; m++)
		{
			for (int n = 0; n < 5; n++)
			{
				if (sign[m][n] == 1)
				{
					for (int p = 0; p < 5; p++)
					{
						if (a[p][n] < a[m][n])
						{
							break;
						}
						if (p == 4)
						{
							System.out.print(m + 1);
							System.out.print(' ');
							System.out.print(n + 1);
							System.out.print(' ');
							System.out.print(a[m][n]);
							flag = 1;
						}
					}
				}
			}
		}
		if (flag == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}

		return 0;
	}
}

