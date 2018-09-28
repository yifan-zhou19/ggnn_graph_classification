package <missing>;

public class GlobalMembers
{
	// * * * * * * * * * * * * * * *
	// *???????             *
	// *??????  1300013011   *
	// *???2013.11.4            *
	// * * * * * * * * * * * * * * *
	public static int Main()
	{
		// a????h0?l0?????????j??????????
		int[][] a = new int[5][5];
		int max = 0;
		int l0 = 0;
		int h0;
		int j = 0;

		for (int i = 0; i <= 4; i++) // ????????
		{
			for (int k = 0; k <= 4; k++)
			{
				a[i][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (int h = 0; h <= 4; h++) // ??????????
		{
			max = a[h][0]; // ?????????????????
			h0 = h;
			l0 = 0;
			for (int l = 1; l <= 4; l++)
			{
				if (a[h][l] < max)
				{
					continue;
				}
				max = a[h][l];
				l0 = l; // h0?l0?????????
			}

			// ?????????????????????j?1
			if ((a[0][l0] >= max) + (a[1][l0] >= max) + (a[2][l0] >= max) + (a[3][l0] >= max) + (a[4][l0] >= max) == 5)
			{
				System.out.print(h0 + 1);
				System.out.print(" ");
				System.out.print(l0 + 1);
				System.out.print(" ");
				System.out.print(max);
				System.out.print("\n");
				j++;
			}
		}

		if (j == 0) // ????????????not found
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}
}

