package <missing>;

public class GlobalMembers
{
	//********************************************************
	//*  ???:1.cpp                                        *
	//*  ??????    1200012948                          *
	//*  ????: 2012 11 05                                *
	//*  ????:???????                             *
	//********************************************************
	//??
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n = 0;
		int[][] a =
		{
			{0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0}
		};
		//?????
		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 5; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 5; j++)
			{
				m = a[i][j];
				//????
				if (m >= a[i][0] != 0 && m >= a[i][1] != 0 && m >= a[i][2] != 0 && m >= a[i][3] != 0 && m >= a[i][4] != 0 && m <= a[0][j] != 0 && m <= a[1][j] != 0 && m <= a[2][j] != 0 && m <= a[3][j] != 0 && m <= a[4][j])
				{
					System.out.print(i + 1);
					System.out.print(" ");
					System.out.print(j + 1);
					System.out.print(" ");
					System.out.print(m);
					System.out.print("\n");
					n++;

				}
			}
		}
		if (n == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		//??
		return 0;
	}

}

