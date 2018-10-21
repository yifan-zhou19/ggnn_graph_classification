package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[101][101]; //???????
		int i;
		int j;
		int k = 0;
		int l = 1;
		int m;
		int n;
		int c;
		int d;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = m,d = n; //?m,n????c,d
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		j = 0; //?j=0
		while (j < c * d) //?j<c*d?
		{
			for (i = l;i <= n;i++)
			{
				if (j >= c * d)
				{
					break; //??j>=c*d,????
				}
				System.out.print(a[k + 1][i]);
				System.out.print("\n");
				j = j + 1; //j=j+1

			}
			for (k = i - 1,i = l + 1;i <= m;i++)
			{
				if (j >= c * d)
				{
					break; //??j>=c*d,????
				}
				System.out.print(a[i][k]);
				System.out.print("\n");
				j = j + 1; //j=j+1

			}
			for (k = i - 1,i = n - 1;i >= l;i--)
			{
				if (j >= c * d)
				{
					break; //??j>=c*d,????
				}
				System.out.print(a[k][i]);
				System.out.print("\n");
				j = j + 1; //j=j+1

			}
			for (k = i + 1,i = m - 1;i >= l + 1;i--)
			{
				if (j >= c * d)
				{
					break; //??j>=c*d,????
				}
				System.out.print(a[i][k]);
				System.out.print("\n");
				j = j + 1; //j=j+1

			}
			n = n - 1;
			m = m - 1;
			l = l + 1;
		}
		return 0;
	}
}

