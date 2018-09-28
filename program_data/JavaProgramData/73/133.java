package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int temp;
		int[] hang_max = new int[5];
		int[] lie_min = new int[5];
		int flag = 1;
		for (int i = 0;i < 5;i++)
		{
			for (int j = 0;j < 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 0;i < 5;i++)
		{
			hang_max[i] = a[i][0];
			for (int j = 0;j < 5;j++)
			{
				if (a[i][j] > hang_max[i])
				{
					hang_max[i] = a[i][j];
				}
			}
		}
		for (int j = 0;j < 5;j++)
		{
			lie_min[j] = a[0][j];
			for (int i = 0;i < 5;i++)
			{
				if (a[i][j] < lie_min[j])
				{
					lie_min[j] = a[i][j];
				}
			}
		}
		for (int i = 0;i < 5;i++)
		{
			for (int j = 0;j < 5;j++)
			{
				if ((a[i][j] == hang_max[i]) && (a[i][j] == lie_min[j]))
				{
					System.out.print(i + 1);
					System.out.print(' ');
					System.out.print(j + 1);
					System.out.print(' ');
					System.out.print(a[i][j]);
					System.out.print("\n");

					return 0;
				}
			}
		}
			System.out.print("not found");
			System.out.print("\n");


		return 0;
	}

}

