package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] num = new int[5][5];
		int i;
		int j;
		int[] max = new int[5];
		int[] min = new int[5];
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				num[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < 5;i++)
		{
			max[i] = 0;
			min[i] = 0;
		}
		for (i = 0;i < 5;i++)
		{
			max[i] = num[i][0];
			for (j = 0;j < 5;j++)
			{
				if (num[i][j] > max[i])
				{
					max[i] = num[i][j];
				}
			}
		}
		for (j = 0;j < 5;j++)
		{
			min[j] = num[0][j];
			for (i = 0;i < 5;i++)
			{
				if (num[i][j] < min[j])
				{
					min[j] = num[i][j];
				}
			}
		}
		int test = 0;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (max[i] == min[j] && max[i] == num[i][j])
				{
						System.out.print(i + 1);
						System.out.print(" ");
						System.out.print(j + 1);
						System.out.print(" ");
						System.out.print(num[i][j]);
						System.out.print("\n");
						test = 1;
				}
			}
		}
		if (test == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}
}

