package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int max;
		int row;
		int line;
		int flag = 0;
		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 5; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < 5; i++)
		{
			max = a[i][0];
			row = i;
			line = 0;
			for (j = 0; j < 5; j++)
			{


				if (a[i][j] > max)
				{
					max = a[i][j];
					row = i;
					line = j;
				}
			}
			int k;
			for (k = 0; k < 5; k++)
			{
				if (a[k][line] >= max)
				{
					continue;
				}
				else
				{
					break;
				}
			}
			if (k == 5)
			{
				flag = 1;
				System.out.print(row + 1);
				System.out.print(" ");
				System.out.print(line + 1);
				System.out.print(" ");
				System.out.print(max);
				System.out.print("\n");
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

