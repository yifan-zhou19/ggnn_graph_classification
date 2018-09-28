package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int[][] num = new int[5][5];
		int[][] max = new int[2][5];
		int[][] min = new int[2][5];
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					num[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				max[0][i] = num[i][0];
				max[1][i] = 0;
				min[0][j] = num[0][j];
				min[1][i] = 0;
			}
		}

		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				if (num[i][j] > max[0][i])
				{
					max[0][i] = num[i][j];
					max[1][i] = j;
				}
				if (num[i][j] < min[0][j])
				{
					min[0][j] = num[i][j];
					min[1][j] = i;
				}
			}
		}

		int count = 0;
		for (int i = 0; i < 5; i++)
		{
			if (min[1][max[1][i]] == i)
			{
				if (count != 0)
				{
					System.out.print("\n");
				}
				System.out.printf("%d %d %d", i + 1, max[1][i] + 1, max[0][i]);
				count++;
			}
		}

		if (count == 0)
		{
			System.out.print("not found");
		}
			return 0;

	}

}

