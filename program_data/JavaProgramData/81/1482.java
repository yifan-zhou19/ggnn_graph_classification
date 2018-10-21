package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int change = new int(int b[5][5],int x,int y);
		int[][] a = new int[5][5];
		int[] c = new int[5];
		int i;
		int j;
		int k;
		int n;
		int m;
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
		if (change(a[5][5], n, m) == 0)
		{
			System.out.print("error");
		}
		if (change(a[5][5], n, m) == 1)
		{
			for (k = 0;k < 5;k++)
			{
				c[k] = a[n][k];
				a[n][k] = a[m][k];
				a[m][k] = c[k];
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",a[i][j]);
				}
				System.out.printf("%d\n",a[i][4]);
			}
		}
	}
	public static int change(int[][] b, int x, int y)
	{
		int z;
		if (x > 4 || x < 0 || y>4 || y < 0)
		{
			z = 0;
		}
		else
		{
			z = 1;
		}
		return (z);
	}
}

