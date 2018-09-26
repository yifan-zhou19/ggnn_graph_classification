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
		// a?b???????c????????
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int x1;
		int x2;
		int y1;
		int y2;

		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int ia = 0; ia < x1; ia++) // ???????????
		{
			for (int ka = 0; ka < y1; ka++)
			{
				a[ia][ka] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int ib = 0; ib < x2; ib++) // ???????????
		{
			for (int kb = 0; kb < y2; kb++)
			{
				b[ib][kb] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (int i = 0; i < x1; i++) // i???a???
		{
			for (int k = 0; k < y2; k++) // k???b???
			{
				for (int l = 0; l < x2; l++) // a???b???????
				{
					c[i][k] = c[i][k] + a[i][l] * b[l][k]; // ????c?????
				}
			}
		}

		for (int ic = 0; ic < x1; ic++) // ????????c
		{
			for (int kc = 0; kc < y2; kc++)
			{
				if (kc == 0)
				{
					System.out.print(c[ic][kc]);
				}
				else
				{
					System.out.print(" ");
					System.out.print(c[ic][kc]);
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

