package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int flag = 0;
		int g;
		int k;
		int[][] a = new int[5][5];
		int i;
		int[] row = new int[5];
		int column;
		int temp;
		int j;
		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 5; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < 5; i++)
		{
			column = 0;
			temp = a[i][0];
			for (j = 1; j < 5; j++)
			{
				if (a[i][j] > temp)
				{
					temp = a[i][j];
					column = j;
				}
			}
			row[i] = column;
		}
		for (i = 0; i < 5; i++)
		{
			g = 0;
			k = row[i];
			for (j = 0; j < 5; j++)
			{
				if (a[j][k] < a[i][k])
				{
					g++;
				}
			}
			if (g == 0)
			{
				System.out.print(i + 1);
				System.out.print(" ");
				System.out.print(k + 1);
				System.out.print(" ");
				System.out.print(a[i][k]);
				System.out.print("\n");
				flag++;
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

