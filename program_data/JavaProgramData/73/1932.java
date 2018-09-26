package <missing>;

public class GlobalMembers
{
	public static int Main() //?????
	{
		int[][] a = new int[6][6];
		int line;
		int row;
		int flag = 0;
		for (int i = 1;i <= 5;i++)
		{
			for (int t = 1;t <= 5;t++)
			{
				a[i][t] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int k = 1;k <= 5;k++)
		{
			int count = 0;
			int max = 0;
			for (int p = 1;p <= 5;p++)
			{
				row = k;
				if (a[k][p] > max)
				{
					max = a[k][p];
					line = p;

				}

			}

			for (int q = 1;q <= 5;q++)
			{

				if (a[q][line] >= max)
				{
					count++;
				}
			}
				if (count == 5)
				{
					flag++;
					System.out.print(row);
					System.out.print(" ");
					System.out.print(line);
					System.out.print(" ");
					System.out.print(a[row][line]);
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

