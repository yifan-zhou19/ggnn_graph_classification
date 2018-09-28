package <missing>;

public class GlobalMembers
{
	//****************************************************************
	// ????1000012789_3.cpp                                      *
	// ???wusy                                                    *
	// ???11,3                                                    *
	// ???????                                                *
	//****************************************************************
	public static int Main()
	{
		int[][] a = new int[5][5]; //??????????
		int[] maxr = new int[5];
		int[] e = new int[5];
		int[] f = new int[5];
		int max;
		int g;
		int count = 0;
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (int k = 0; k < 5; k++)
		{
			max = a[k][0]; //?????
			f[k] = 0;
			for (int t = 0; t < 5; t++)
			{
				if (a[k][t] > max)
				{
					max = a[k][t]; //    ???????????????
					f[k] = t;
				}
			}
			maxr[k] = max; //    ??????????????
			e[k] = k; //    ?????
		}

		for (int p = 0; p < 5; p++)
		{
			g = 0; //    ???????g
			for (int q = 0; q < 5; q++)
			{
				if (maxr[p] > a[q][f[p]])
				{
					g = 1;
					break; //    ????????????????????????g?1
				}
			}
			if (g == 0) //    ?g????????????
			{
				System.out.print(e[p] + 1);
				System.out.print(" ");
				System.out.print(f[p] + 1);
				System.out.print(" ");
				System.out.print(maxr[p]);
				System.out.print("\n");
				count++;
			}
		}

		if (count == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}


}

