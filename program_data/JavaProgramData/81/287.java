package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[5][5];
		int i = 0;
		int j = 0;
		int m;
		int n;
		int k;
		int p = 0;
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
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		if (f(m, n) == 0)
		{
			System.out.print("error");
		}
		if (f(m, n) == 1)
		{
			for (p = 0;p <= 4;p++)
			{
				k = a[m][p];
				a[m][p] = a[n][p];
				a[n][p] = k;
			}
			i = 0;
			j = 0;
			for (i = 0;i <= 4;i++)
			{
				for (j = 0;j <= 4;j++)
				{
					if (j != 4)
					{
						System.out.printf("%d ",a[i][j]);
					}
					else
					{
						System.out.printf("%d\n",a[i][j]);
					}
				}
			}
		}
	}
	public static int f(int a,int b)
	{
		int c;
		if (a <= 4 && b <= 4 && a != b)
		{
			c = 1;
		}
		else
		{
			c = 0;
		}
		return (c);
	}

}

