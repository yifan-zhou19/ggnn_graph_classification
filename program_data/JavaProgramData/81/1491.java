package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[5][5];
		int b;
		int c;
		int i;
		int t;
		int j;
		int n;
		int m;
		int[][] e = new int[5][5];
		for (i = 0;i <= 4;i++)
		{
			for (j = 0;j <= 4;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		b = pan(n, m);
		if (b == 0)
		{
			System.out.print("error");
		}
		if (b == 1)
		{
			for (j = 0;j <= 4;j++)
			{
				e[n][j] = a[n][j];
				e[m][j] = a[m][j];
				a[n][j] = e[m][j];
				a[m][j] = e[n][j];
			}

		for (i = 0;i <= 4;i++)
		{
			for (j = 0;j <= 3;j++)
			{
				System.out.printf("%d ",a[i][j]);
			}
			System.out.printf("%d\n",a[i][4]);
		}
		}
	}


	public static int pan(int n,int m)
	{
			int c;
			int t;
			if (n != m && n >= 0 && n <= 4 && m >= 0 && m <= 4)
			{
				c = 1;
				t = m;
				m = n;
				n = t;
			}
			else
			{
				c = 0;
			}
			return (c);
	}



}

