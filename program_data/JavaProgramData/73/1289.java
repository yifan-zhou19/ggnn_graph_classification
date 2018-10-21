package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
	int max;
	int i;
	int j;
	int bo = 1;
	int get = 0;
	int k;
	int r;
	for (i = 0;i < 5;i++)
	{
		for (j = 0;j < 5;j++)
		{
			a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	for (i = 0;i < 5;i++)
	{
		max = a[i][0];
		r = 0;
		bo = 1,get = 0;
		for (j = 1;j < 5;j++)
		{
			if (a[i][j] > max)
			{
					max = a[i][j];
				r = j;
			}
		}

		for (k = 0;k < 5;k++)
		{
			if (a[k][r] < max)
			{
				bo = 0;
			}
		}
		if (bo != 0)
		{
			System.out.print(i + 1);
			System.out.print(" ");
			System.out.print(r + 1);
			System.out.print(" ");
			System.out.print(max);
			System.out.print("\n");
			get = 1;
			break;
		}
	}
		if (get == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
	return 0;
	}
}

