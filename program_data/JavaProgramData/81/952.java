package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int hanshu = new int(int juzhen[5][5],int x,int y);
		int[][] a = new int[5][5];
		int i;
		int x;
		int y;
		int k;
		int e;
		for (i = 0;i < 5;i++)
		{
			for (k = 0;k < 5;k++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][k] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			y = Integer.parseInt(tempVar3);
		}
		e = hanshu(a, x, y);
		if (e == 1)
		{
			for (i = 0;i < 5;i++)
			{
				for (k = 0;k < 5;k++)
				{
					if (k == 0)
					{
					System.out.printf("%d",a[i][k]);
					}
					else
					{
					System.out.printf(" %d",a[i][k]);
					}
					if (k == 4)
					{
					System.out.print("\n");
					}
				}
			}
		}
		if (e == 0)
		{
			System.out.print("error");
		}
	}
	public static int hanshu(int[][] juzhen, int m, int n)
	{
		int c;
		int[] d = new int[5];
		int p;
		if (m >= 0 && m < 5 && n >= 0 && n < 5)
		{
			c = 1;
			for (p = 0;p < 5;p++)
			{
				d[p] = juzhen[m][p];
				juzhen[m][p] = juzhen[n][p];
				juzhen[n][p] = d[p];
			}
			return (c);
		}
		else
		{
			c = 0;
			return (c);
		}
	}
}

