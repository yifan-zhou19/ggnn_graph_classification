package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int m = 0;
		int n;
		int w;
		char[][] a = new char[10][15];
		char[][] b = new char[10][15];
		char[][] d = new char[10][15];
		for (i = 0;i < 10;i++)
		{
			for (j = 0;j < 15;j++)
			{
				a[i][j] = '\0';
				b[i][j] = '\0';
				d[i][j] = '\0';
			}
		}
		for (i = 0;scanf("%s %s",a[i],b[i]) != EOF;i++)
		{
			n = String.valueOf(a[i]).length();
		for (k = 0,m = 0;k < n - 1;k++)
		{
			if (a[i][m] < a[i][k + 1])
			{
		m = k + 1;
			}
		}
		for (k = n - 1;k > m;k--)
		{
			a[i][k + 3] = a[i][k];
		}
		for (k = m + 1,w = 0;k != m + 4;k++,w++)
		{
			 a[i][k] = b[i][w];
		}
		System.out.println(a[i]);
		System.out.print("\n");
		}
	}


}
