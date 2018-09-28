package <missing>;

public class GlobalMembers
{
	//******************************
	//*??????????????*
	//*??????                *
	//*???1000012808            *
	//******************************
	public static void clear(int[][] z, int x, int y)
	{
		int i;
		int j;
		for (i = 0; i < x; i++)
		{
			for (j = 0; j < y; j++)
			{
				z[i][j] = 0;
			}
		}
	}
	public static int Main()
	{
		int k; //k??????m?n??????
		int i;
		int s;
		int j;
		int m;
		int n;
		int[][] a = new int[100][100];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < k; i++)
		{
			int sum = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			clear(a, m, n); //????
			for (j = 0; j < m; j++)
			{
				for (s = 0; s < n; s++)
				{
					a[j][s] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (j = 0; j < n; j++)
			{
				sum = sum + *(*(a + 0) + j);
			}
			for (j = 0; j < n; j++)
			{
				sum = sum + *(*(a + m - 1) + j);
			}
			for (j = 1; j < m - 1; j++)
			{
				sum = sum + *(*(a + j));
			}
			for (j = 1; j < m - 1; j++)
			{
				sum = sum + *(*(a + j) + n - 1);
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}



}

