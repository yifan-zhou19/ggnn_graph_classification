package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int k;
		int l;
		char[][] c = new char[200][100];
		char[][] s = new char[200][200];
		int[][] a = new int[200][100];
		int[][] b = new int[200][200];
		int[][] d = new int[200][200];
		int[] x = new int[200];
		int[] y = new int[200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i] = tempVar3.charAt(0);
			}
			x[i] = String.valueOf(c[i]).length();
			y[i] = String.valueOf(s[i]).length();
		}
		for (i = 0;i < n;i++)
		{
		for (j = 0;j < x[i];j++)
		{
			a[i][j] = c[i][j] - 48;
			d[i][j] = a[i][j];
		}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < y[i];j++)
			{
			b[i][j] = s[i][j] - 48;
			}
		}
		for (i = 0;i < n;i++)
		{
			k = x[i] - 1;
			l = y[i] - 1;
			for (j = k;j >= k - l;j--)
			{
				d[i][j] = a[i][j] - b[i][l - k + j];
			}
		}
		for (i = 0;i < n;i++)
		{
		for (j = x[i] - 1;j >= 0;j--)
		{
			if (d[i][j] < 0)
			{
				d[i][j] = d[i][j] + 10;
				d[i][j - 1] = d[i][j - 1] - 1;
			}
			else
			{
				continue;
			}
		}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < x[i];j++)
			{
			System.out.printf("%d",d[i][j]);
			}
			System.out.print("\n");
		}
	}
}

