package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k = 0;
		int[][] a = new int[5][5];
		int[] max = new int[5];
		int[] min = new int[5];
		for (i = 0; i <= 4; i++)
		{
			for (j = 0; j <= 4; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < 5; i++)
		{
			max[i] = a[i][0];
			min[i] = a[0][i];
		}
		for (i = 0; i <= 4; i++)
		{
			for (j = 0; j <= 4; j++)
			{
				if (a[i][j] > max[i])
				{
					max[i] = a[i][j];
				}
				if (a[i][j] < min[j])
				{
					min[j] = a[i][j];
				}
			}
		}
		for (i = 0; i <= 4; i++)
		{
			for (j = 0; j <= 4; j++)
			{
				if (max[i] == min[j])
				{
					System.out.print(i + 1);
					System.out.print(" ");
					System.out.print(j + 1);
					System.out.print(" ");
					System.out.print(max[i]);
					k++;
				}
			}
		}
		if (k == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}

}

