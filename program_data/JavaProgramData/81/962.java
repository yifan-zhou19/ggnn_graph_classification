package <missing>;

public class GlobalMembers
{
	public static int define(int m,int n)
	{
		if (m <= 4 && n <= 4)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] a = new int[5][5];
		int[] b = new int[5];
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
		if (define(m, n) == 1)
		{
			for (i = 0;i <= 4;i++)
			{
				b[i] = a[m][i];
				a[m][i] = a[n][i];
				a[n][i] = b[i];
			}
			for (i = 0;i <= 3;i++)
			{
				System.out.printf("%d %d %d %d %d\n",a[i][0],a[i][1],a[i][2],a[i][3],a[i][4]);
			}
			System.out.printf("%d %d %d %d %d",a[4][0],a[4][1],a[4][2],a[4][3],a[4][4]);
		}
		else
		{
			System.out.print("error");
		}
	}
}

