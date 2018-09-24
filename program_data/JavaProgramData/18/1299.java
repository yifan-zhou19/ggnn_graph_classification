package <missing>;

public class GlobalMembers
{
	//*******************************************
	//*         ??????????????    *
	//*         ??????                    *
	//*         ???1200012764                *
	//*         ???2012/11/25                *
	//*******************************************

	public static void matrix_down(int[][] a, int large) //??????
	{
		int v;
		int r;
		for (v = 0; v <= large - 1; v++) //???????????large??
		{
			int minl;
			minl = a[v][0];
			for (r = 1; r <= large - 1; r++) //????????
			{
				 if (a[v][r] <= minl)
				 {
					minl = a[v][r];
				 }
				if (a[v][r] == 0)
				{
					minl = 0;
					break;
				}
			}
			for (r = 0; r <= large - 1; r++) //??????????????minl
			{
				a[v][r] = a[v][r] - minl;
			}
		}
			for (v = 0; v <= large - 1; v++) //????
			{
				 int minr;
				minr = a[0][v];
				for (r = 1; r <= large - 1; r++) //????????minr
				{
					if (a[r][v] <= minr)
					{
						minr = a[r][v];
					}
					if (a[r][v] == 0)
					{
						minr = 0;
						break;
					}
				}
				for (r = 0; r <= large - 1; r++) //??????????????minr
				{
					a[r][v] = a[r][v] - minr;
				}
			}
	}

	public static void matrix_short(int[][] a, int large) //???????????large??
	{
		int i;
		int r;
		for (i = 1;i <= large - 2; i++) //??????2???
		{
			for (r = 1; r <= large - 2; r++)
			{
				a[i][r] = a[i + 1][r + 1];
			}
			a[0][i] = a[0][i + 1];
			a[i][0] = a[i + 1][0];
		}
	}

	public static int Main()
	{
		int n;
		int i;
		int u;
		int v;
		int r;
		int s;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++) //??n????????
		{
			int[][] a = new int[150][150];
			int sum = 0;
			for (u = 0; u <= n - 1; u++) //?????
			{
				for (v = 0; v <= n - 1; v++)
				{
					a[u][v] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (u = n; u >= 2; u--) //??????????????????????1
			{
				matrix_down(a, u);
				sum = a[1][1] + sum;
				matrix_short(a, u);
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

