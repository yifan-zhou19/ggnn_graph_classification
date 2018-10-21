package <missing>;

public class GlobalMembers
{
	public static int change(int[][] a, int m, int n)
	{
		int c;
		int i;
		int k;
		if (m > 4 || n > 4)
		{
			System.out.print("error\n");
			return (0);
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				if (i == m)
				{
					for (k = 0;k < 5;k++)
					{
					c = a[i][k];
					a[i][k] = a[n][k];
					a[n][k] = c;
					}
				}
			}
		}
			for (i = 0;i < 5;i++)
			{
				System.out.printf("%d",a[i][0]);
				for (k = 1;k < 5;k++)
				{
					System.out.printf(" %d",a[i][k]);
				}
				System.out.print("\n");
			}
			return (1);
	}
	public static void Main()
	{
		int[][] b = new int[5][5];
		int i;
		int k;
		int x;
		int y;
		for (i = 0;i < 5;i++)
		{
			for (k = 0;k < 5;k++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					b[i][k] = Integer.parseInt(tempVar);
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
		change(b, x, y);
	}
}

