package <missing>;

public class GlobalMembers
{
	//*******************
	// 7.1.cpp 
	// ??  1200018415
	// 2012  11  5
	//*******************


	public static int Main()
	{
		int i;
		int j;
		int[][] a = new int[5][5];
		int k;
		int c;
		int n = 0;
		int p = 0;
		int m = 0;
		int j1;
		int i1;
		for (i = 0; i <= 4; i++)
		{
			for (j = 0; j <= 4; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i <= 4; i++)
		{
			for (j = 0; j <= 4; j++)
			{
				if (m < a[i][j])
				{
					m = a[i][j];
					j1 = j;
				}
			}
			for (k = 0; k <= 4; k++)
			{
				if (a[k][j1] < m)
				{
					p = 1;
					break;
				}
			}
			if (p == 0)
			{
				System.out.print(i + 1);
				System.out.print(" ");
				System.out.print(j1 + 1);
				System.out.print(" ");
				System.out.print(m);
				System.out.print("\n");
				n = 1;
			}
			m = 0;
			p = 0;
		}
		if (n == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}

		return 0;
	}






}

