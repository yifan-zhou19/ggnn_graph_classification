package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i; //?????????
		int j;
		int u;
		int k;
		int[] m = new int[100];
		int[] n = new int[100];
		int[][][] g = new int[100][100][100];
		int num = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p,(*q)[100];
		int p; //???????????
		(int)(*q)[100];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= k;i++)
		{
			m[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < m[i];j++)
			{
				for (u = 0;u < n[i];u++)
				{
					g[i][j][u] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
		}
		for (i = 1;i <= k;i++)
		{
			num = 0;
			for (p = g[i][0][0];p <= g[i][0][n[i] - 1];p++) //??????
			{
				num = num + p;
			}
			for (p = g[i][m[i] - 1][0];p <= g[i][m[i] - 1][n[i] - 1];p++) //???????
			{
				num = num + p;
			}
			for (q = g[i][1];q <= g[i][m[i] - 2];q++) //???????
			{
				num = num + (*(*q));
			}
			for (q = g[i][1];q <= g[i][m[i] - 2];q++) //????????
			{
				num = num + (*(*q + n[i] - 1));
			}
			System.out.print(num);
			System.out.print("\n");
		}
		return 0;
	}




}

