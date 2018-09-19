package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[100][16];
		int i;
		int j;
		int x;
		int y;
		int m;
		int n;
		int o;
		int p;
		int q;
		int b;
		int[] c = new int[100];
		for (j = 1;j <= 100;j++)
		{
			for (i = 1;i <= 16;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[j][i] = Integer.parseInt(tempVar);
				}
				if (a[j][i] == 0 || a[j][i] == -1)
				{
					c[j] = i - 1;
					break;
				}
			}
			if (a[j][i] == -1)
			{
				break;
			}
		}
		for (m = 1;m < j;m++)
		{
			b = 0;
			for (p = 1;p <= c[m];p++)
			{
				for (q = p + 1;q <= c[m];q++)
				{
					if (a[m][q] == 2 * a[m][p] || 2 * a[m][q] == a[m][p])
					{
						b = b + 1;
					}
				}
			}
			System.out.printf("%d\n",b);
		}
	}



}

