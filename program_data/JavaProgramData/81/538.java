package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int j;
	public static int w;
	public static int n;
	public static int m;
	public static int[][] a = new int[5][5]; //5!not 4
	public static void Main()
	{
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
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		f(n,m,a[5][5]);
		if (w == 0)
		{
			System.out.print("error\n");
		}
		if (w == 1)
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
				if (j == 0)
				{
					System.out.printf("%d",a[i][j]);
				}
				else
				{
					System.out.printf(" %d",a[i][j]);
				}
				}
				System.out.print("\n");
			}
		}
	}
	public static int f()
	{
		int x;
		int t;
		if (n > 4 || m > 4)
		{
			w = 0;
		}
		else
		{
			w = 1;
			for (x = 0;x < 5;x++)
			{

				t = a[n][x];
				a[n][x] = a[m][x];
				a[m][x] = t;
			}

		}
		return w;
	}

}

