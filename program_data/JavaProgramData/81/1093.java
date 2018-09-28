package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[5][5];
	public static int m;
	public static int n;
	public static int pan(int m,int n)
	{
		int[] c = new int[5];
		int q;
		if (m <= 4 && m >= 0 && n <= 4 && n >= 0)
		{
			int[] c = new int[5];
			int q;
			for (q = 0;q <= 4;q++)
			{
				c[q] = a[m][q];
				a[m][q] = a[n][q];
				a[n][q] = c[q];
			}
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int k;
		int pan = new int(int m,int n);
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
		k = pan(m, n);
		if (k == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i <= 4;i++)
			{
			for (j = 0;j <= 4;j++)
			{
				System.out.printf("%d",a[i][j]);
				if (j != 4)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("\n");
				}
			}
			}
		}
		return 0;
	}
}

