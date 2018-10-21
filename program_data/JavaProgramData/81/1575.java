package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int change = new int(int x,int y);
		int m;
		int n;
		int i;
		int j;
		int c;
		int[] b = new int[5];
		int[][] a = new int[5][5];
		int k;
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
		c = change(m, n);
		if (c == 0)
		{
			System.out.print("error\n");
		}
		if (c == 1)
		{
			for (k = 0;k < 5;k++)
			{
				b[k] = a[m][k];
				a[m][k] = a[n][k];
				a[n][k] = b[k];
			}
			for (i = 0;i < 5;i++)
			{
				System.out.printf("%d %d %d %d %d\n",a[i][0],a[i][1],a[i][2],a[i][3],a[i][4]);
			}
		}
	}
	public static int change(int x,int y)
	{
		int z;
		if (x > 4 || y > 4)
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

