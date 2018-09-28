package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int judge = new int(int m,int n);
		int[][] a = new int[5][5];
		int m;
		int n;
		int i;
		int j;
		int k;
		int t;
		int leap;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
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
		leap = judge(m, n);
		if (leap == 0)
		{
			System.out.print("error");
		}
		if (leap == 1)
		{
			for (k = 0;k < 5;k++)
			{
				t = a[n][k];
				a[n][k] = a[m][k];
				a[m][k] = t;
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					if (j == 0)
					{
						System.out.printf("%d",a[i][j]);
					}
					if (j != 0)
					{
						System.out.printf(" %d",a[i][j]);
					}
					if (j % 4 == 0 && j != 0)
					{
						System.out.print("\n");
					}
				}
			}
		}
	}
		public static int judge(int m,int n)
		{
			int leap;
			if (m >= 0 && m < 5 && n >= 0 && n < 5)
			{
				leap = 1;
			}
			else
			{
				leap = 0;
			}
			return (leap);
		}
}

