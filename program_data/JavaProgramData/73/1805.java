package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[][] a = new int[5][5];
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int max;
		int count = 0;
		int maxj;
		for (i = 0;i < 5;i++)
		{
			int flag = 1;
			max = a[i][0];
			maxj = 0; //?????????
			for (j = 1;j < 5;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					maxj = j;
				}
			}
				for (j = 0;j < 5;j++)
				{
					if (a[j][maxj] < max)
					{
						flag = 0;
						break;
					}
				}
					if (flag == 1)
					{
						count++;
						System.out.print(i + 1);
						System.out.print(' ');
						System.out.print(maxj + 1);
						System.out.print(' ');
						System.out.print(a[i][maxj]);
						System.out.print("\n");
						break;
					}
		}
		if (count == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}

}

