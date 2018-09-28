package <missing>;

public class GlobalMembers
{
	//******************
	// 7.3.cpp
	// ??   1200018415
	// 2012 11 6
	//*****************


	public static int Main()
	{
		int x;
		int i;
		int j;
		int k;
		int s = 0;
		int m;
		int n;
		int[][] a = new int[100][100];
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= x; i++) // ??????x?
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0; j <= m - 1; j++) // ???
			{
				for (k = 0; k <= n - 1; k++) // ???
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					if (j == 0 || j == m - 1 || (k == 0 && j != 0 && j != m - 1) || (k == n - 1 && j != 0 && j != m - 1)) // ?????
					{
						s = s + a[j][k]; // ?????
					}
				}
			}
			System.out.print(s);
			System.out.print("\n");
			s = 0; // s??0
		}

		return 0;
	}


}

