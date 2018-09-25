public class num
{
	public int row;
	public int col;
}

package <missing>;

public class GlobalMembers
{
	public static num[] b = tangible.Arrays.initializeWithDefaultnumInstances(10000);
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] a = new int[25][25];
		int c;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= m;i++)
		{
		for (j = 1;j <= n;j++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i][j] = Integer.parseInt(tempVar3);
		}
		}
		}
		for (i = 0;i <= n + 1;i++)
		{
			a[0][i] = 0;
			a[m + 1][i] = 0;
		}
		for (j = 0;j <= m + 1;j++)
		{
			a[j][0] = 0;
			a[j][n + 1] = 0;
		}
		c = 0;
		for (i = 1;i <= m;i++)
		{
		for (j = 1;j <= n;j++)
		{
			if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j + 1])
			{
				b[c].row = i;
				b[c].col = j;
				c++;
			}
		}
		}
		for (i = 1;i < c;i++)
		{
		for (j = 0;j < c - i;j++)
		{
			if (b[j].row > b[j + 1].row)
			{
				t = b[j].row;
				b[j].row = b[j + 1].row;
				b[j + 1].row = t;
				t = b[j].col;
				b[j].col = b[j + 1].col;
				b[j + 1].col = t;
			}
			if (b[j].row == b[j + 1].row)
			{
				if (b[j].col > b[j + 1].col)
				{
					t = b[j].col;
					b[j].col = b[j + 1].col;
					b[j + 1].col = t;
					t = b[j].row;
					b[j].row = b[j + 1].row;
					b[j + 1].row = t;
				}
			}
		}
		}
		for (i = 0;i < c;i++)
		{
		System.out.printf("%d %d\n",b[i].row - 1,b[i].col - 1);
		}
		return 0;
	}




}

