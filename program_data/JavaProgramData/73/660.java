package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[][] a = new int[6][6];
		int[] max = new int[6];
		int[] min = {0, 100000, 100000, 100000, 100000, 100000};
		int sum = 0;
		for (i = 1;i <= 5;i++)
		{
			for (j = 1;j <= 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i][j] < min[j])
				{
					min[j] = a[i][j];
				}
				if (a[i][j] > max[i])
				{
					max[i] = a[i][j];
				}
			}
		}
		for (i = 1;i <= 5;i++)
		{
			for (j = 1;j <= 5;j++)
			{
				if (a[i][j] == max[i] && a[i][j] == min[j])
				{
					sum++;
					System.out.print("\n");
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print(" ");
					System.out.print(a[i][j]);
				}
			}
		}
		if (sum == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}
}

