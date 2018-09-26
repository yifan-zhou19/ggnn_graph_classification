package <missing>;

public class GlobalMembers
{
	public static int change(int[][] a, int n, int m)
	{
		int c;
		int j;
		int t;
		if (n >= 0 && n < 5 && m >= 0 && m < 5)
		{
			c = 1;
			for (j = 0;j < 5;j++)
			{
				t = a[n][j];
				a[n][j] = a[m][j];
				a[m][j] = t;
			}
		}
		else
		{
		c = 0;
		}
		return (c);
	}
	public static void Main()
	{
		int[][] s = new int[5][5];
		int i;
		int j;
		int x;
		int y;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 4;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					s[i][j] = Integer.parseInt(tempVar);
				}
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i][4] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			x = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			y = Integer.parseInt(tempVar4);
		}
		if (change(s, x, y) == 1)
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",s[i][j]);
				}
				System.out.printf("%d",s[i][4]);
				System.out.print("\n");
			}
		}
		else
		{
		System.out.print("error");
		}
	}

}

