package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int[] rmax = new int[5];
		int[] cmin = new int[5];
		int i;
		int j;
		int[] rmaxno = new int[5];
		int[] cminno = new int[5];
		int f = 0;

		for (i = 0; i <= 4; i++)
		{
			for (j = 0; j <= 4; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (i = 0; i <= 4; i++) //????????????
		{
			rmax[i] = a[i][0];
			rmaxno[i] = 0;
			for (j = 0; j <= 4; j++)
			{
				if (rmax[i] < a[i][j])
				{
					rmax[i] = a[i][j];
					rmaxno[i] = j;

				}
			}
		}

		for (j = 0; j <= 4; j++)
		{
			cmin[j] = a[0][j];
			cminno[j] = 0;
			for (i = 0; i <= 4; i++)
			{
				if (cmin[j] >= a[i][j])
				{
					cmin[j] = a[i][j];
					cminno[j] = i;
				}
			}
		}


		for (i = 0; i <= 4; i++)
		{
			if (cminno[rmaxno[i]] == i)
			{
				f = 1;
				System.out.print(i + 1);
				System.out.print(" ");
				System.out.print(rmaxno[i] + 1);
				System.out.print(" ");
				System.out.print(rmax[i]);
				System.out.print("\n");
			}
		}

		if (f == 0)
		{
		System.out.print("not found");
		}


		return 0;


	}
}

