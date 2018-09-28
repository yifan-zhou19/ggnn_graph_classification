package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] num = new int[5][5];
		int i;
		int k;
		int j;
		int x;
		int y;
		int max = 0;
		int count = 0;
		int z = 0;

		for (i = 0;i < 5;i++)
		{
			for (k = 0;k < 5;k++)
			{
				num[i][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (i = 0;i < 5;i++)
		{
			max = 0;
			x = 0;
			y = 0;
			count = 0;
			for (k = 0;k < 5;k++)
			{
				if (num[i][k] > max)
				{
					max = num[i][k];
					x = i;
					y = k;
				}
			}

			for (j = 0;j < 5;j++)
			{
				if (max < num[j][y])
				{
					count++;
				}
			}

			if (count == 4)
			{
				System.out.print(x + 1);
				System.out.print(" ");
				System.out.print(y + 1);
				System.out.print(" ");
				System.out.print(num[x][y]);
				System.out.print("\n");
				z++;
			}
			if (z == 0 && i == 4)
			{
				System.out.print("not found");
				System.out.print("\n");
			}
		}
		return 0;
	}


}

