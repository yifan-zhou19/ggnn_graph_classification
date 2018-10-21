package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int g = 0;
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int m = 0; m < 5; m++)
		{
			int max = a[m][0];
			int p = 0;
			for (int j = 0; j < 5; j++)
			{
				if (max < a[m][j])
				{
					max = a[m][j];
					p = j;
				}
			}
			int min = a[0][p];
			for (int k = 0; k < 5; k++)
			{
				if (min > a[k][p])
				{
					min = a[k][p];
				}
			}
			if (max == min)
			{
				System.out.print(m + 1);
				System.out.print(" ");
				System.out.print(p + 1);
				System.out.print(" ");
				System.out.print(max);
				System.out.print("\n");
				g++;
			}
		}
		if (g == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}






}

