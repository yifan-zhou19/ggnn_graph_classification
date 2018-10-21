package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int k;
		int found = 0;
		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 5; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < 5; i++)
		{
			int max = 0;
			int min = 1e6;
			int mi;
			int mj;
			for (j = 0; j < 5; j++)
			{
				if (max < a[i][j])
				{
					max = a[i][j];
					mj = j;
				}
			}
			for (k = 0; k < 5; k++)
			{
				if (min > a[k][mj])
				{
					min = a[k][mj];
					mi = k;
				}
			}
			if (mi == i)
			{
				found = 1;
				System.out.print(mi + 1);
				System.out.print(" ");
				System.out.print(mj + 1);
				System.out.print(" ");
				System.out.print(a[mi][mj]);
			}
		}
		if (found == 0)
		{
			System.out.print("not found");
		}
		System.out.print("\n");
		return 0;

	}
}

