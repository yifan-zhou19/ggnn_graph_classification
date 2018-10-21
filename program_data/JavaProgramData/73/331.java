package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int[] max = new int[5];
		int[] y = new int[5];
		int e = 0;
		int is = 1;
		for (int i = 0;i < 5;i++)
		{
			max[i] = 0;
			for (int j = 0;j < 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (max[i] <= a[i][j])
				{
					max[i] = a[i][j];
					y[i] = j;
				}
			}
		}
		for (int i = 0;i < 5;i++)
		{
			for (int j = 0;j < 5;j++)
			{
				if (max[i] > a[j][y[i]])
				{
					is = 0;
				}
			}
			if (is != 0)
			{
				e = 1;
				System.out.print(i + 1);
				System.out.print(' ');
				System.out.print(y[i] + 1);
				System.out.print(' ');
				System.out.print(max[i]);
			}
			is = 1;
		}
		if (e == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}
}

