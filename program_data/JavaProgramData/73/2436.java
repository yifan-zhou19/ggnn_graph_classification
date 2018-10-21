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
		int[] max1 = new int[5];
		int[] least1 = new int[5];
		int t = 0;

		int max_value = new int(int x, int max);
		int least_value = new int(int x, int least);

		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 5; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (i = 0; i < 5; i++)
		{

			for (j = 0, max1[i] = a[i][0], least1[i] = a[0][i]; j < 5; j++)
			{
				max1[i] = max_value(a[i][j], max1[i]);
				least1[i] = least_value(a[j][i], least1[i]);
			}
		}
		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 5; j++)
			{
				if (max1[i] == a[i][j] && least1[j] == a[i][j])
				{
					System.out.print(i + 1);
					System.out.print(" ");
					System.out.print(j + 1);
					System.out.print(" ");
					System.out.print(a[i][j]);
					System.out.print("\n");
					t = t + 1;
				}
			}
		}

		if (t == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}

		return 0;
	}

	public static int max_value(int x, int max)
	{
		if (x > max)
		{
			return x;
		}
		else
		{
			return max;
		}
	}
	public static int least_value(int x, int least)
	{
		if (x > least)
		{
			return least;
		}
		else
		{
			return x;
		}
	}

}

