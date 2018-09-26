package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int s = new int(int m,int n);
		int m;
		int n;
		int c;
		int[][] a = new int[5][5];
		int i;
		int j;
		int t;
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
		c = s(m, n);
		if (c == 0)
		{
			System.out.print("error");
		}
		if (c == 1)
		{
			for (j = 0;j < 5;j++)
			{
				t = a[n][j];
			a[n][j] = a[m][j];
			a[m][j] = t;
			}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 4;j++)
			{
			System.out.printf("%d ",a[i][j]);
			}
			System.out.printf("%d",a[i][4]);
			System.out.print("\n");
		}
		}
	}
	public static int s(int m,int n)
	{
		int c;
		if ((0 <= m != 0 && m < 5) && (0 <= n != 0 && n < 5))
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

