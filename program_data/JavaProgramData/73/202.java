package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a =
		{
			{0, 0, 0, 0, 0}
		};
		int i;
		int j;
		for (i = 0; i <= 4; i++)
		{
			for (j = 0; j <= 4; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int[] max = new int[5];
		int[] min = new int[5];
		for (i = 0; i <= 4; i++)
		{
			for (j = 1; j <= 4; j++)
			{
				if (a[i][j] > a[i][max[i]])
				{
					max[i] = j;
				}
			}
		}
		for (j = 0; j <= 4; j++)
		{
			for (i = 1; i <= 4; i++)
			{
				if (a[i][j] < a[min[j]][j])
				{
					min[j] = i;
				}
			}
		}
		int flag = 0;
		for (i = 0; i <= 4; i++)
		{
			if (min[max[i]] == i)
			{
				System.out.print(i + 1);
				System.out.print(" ");
				System.out.print(max[i] + 1);
				System.out.print(" ");
				System.out.print(a[i][max[i]]);
				System.out.print("\n");
				flag = 1;
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

