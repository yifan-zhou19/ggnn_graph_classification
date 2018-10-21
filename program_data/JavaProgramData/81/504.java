package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] c = new int[5][5];
		int i;
		int j;
		int m;
		int n;
		int p;
		int check = new int(int c[][5],int,int);
		for (i = 0;i <= 4;i++)
		{
			for (j = 0;j <= 4;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					c[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		p = check(c, m, n);
		if (p == 1)
		{
			for (i = 0;i <= 4;i++)
			{
				for (j = 0;j <= 3;j++)
				{
					System.out.printf("%d ",c[i][j]);
				}
				System.out.printf("%d\n",c[i][4]);
			}
		}
		else if (p == 0)
		{
			System.out.print("error\n");
		}
	}

	public static int check(int[][] c, int m, int n)
	{
		int j;
		int f;
		int[] a = new int[5];
		if (m <= 4 && n <= 4)
		{
			for (j = 0;j <= 4;j++)
			{
				a[j] = c[m][j];
			}
			for (j = 0;j <= 4;j++)
			{
				c[m][j] = c[n][j];
			}
			for (j = 0;j <= 4;j++)
			{
				c[n][j] = a[j];
			}
			f = 1;
		}
		else
		{
			f = 0;
		}
		return (f);
	}
}

