package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int[] column = new int[5];
		int max;
		int exist;
		int flag;
		exist = 0;
		flag = 0;
		for (i = 0; i <= 4; i++)
		{
			for (j = 0; j <= 4; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i <= 4; i++)
		{
			max = a[i][1];
			column[i] = 1;
			for (j = 0; j <= 4; j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					column[i] = j;
				}
			}
		}
		for (i = 0; i <= 4; i++)
		{
			for (j = 0; j <= 4; j++)
			{
				if (a[i][column[i]] > a[j][column[i]])
				{
					exist = 0;
					break;
				}
				else
				{
					exist = 1;
				}
			}
			if (exist == 1)
			{
				System.out.print(i + 1);
				System.out.print(" ");
				System.out.print(column[i] + 1);
				System.out.print(" ");
				System.out.print(a[i][column[i]]);
				System.out.print("\n");
				flag = 1;
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

