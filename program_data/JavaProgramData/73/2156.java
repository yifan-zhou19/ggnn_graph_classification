package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] num = new int[5][5];
		int counter = 0;
		for (int i = 0;i < 5;i++)
		{
			for (int j = 0;j < 5;j++)
			{
				num[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			System.out.print("\n");
		}
		for (int i = 0;i < 5;i++)
		{
			for (int j = 0;j < 5;j++)
			{
				int mid = 0;
				int second = 0;
				for (int k = 0;k < 5;k++)
				{
				   mid += (num[i][j] > num[i][k]);
				}
				if (mid == 4)
				{
				   for (int l = 0;l < 5;l++)
				   {
						second += (num[i][j] < num[l][j]);
				   }
				if (second == 4)
				{
					System.out.print(i + 1);
					System.out.print(" ");
					System.out.print(j + 1);
					System.out.print(" ");
					System.out.print(num[i][j]);
					System.out.print("\n");
				counter++;
				}
				}
			}
		}
		if (counter == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}
}

