package <missing>;

public class GlobalMembers
{
	public static int change(int x, int y, int[][] b)
	{
		int z;
		int t;
		int k;
		if (x <= 4 && x >= 0 && y <= 4 && y >= 0)
		{
		   z = 1;
		  for (k = 0;k <= 4;k++)
		  {
			  t = b[x][k];
			  b[x][k] = b[y][k];
			  b[y][k] = t;
		  }
		  return (z);
		}
		else
		{
			z = 0;
			return (z);
		}
	}
	public static void Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int m;
		int n;
		int d;
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		d = change(m, n, a);
		if (d == 1)
		{
			for (i = 0;i <= 4;i++)
			{
				for (j = 0;j <= 3;j++)
				{
					System.out.printf("%d ",a[i][j]);
				}
				System.out.printf("%d\n",a[i][4]);
			}
		}
		else
		{
			System.out.print("error\n");
		}
	}


}

