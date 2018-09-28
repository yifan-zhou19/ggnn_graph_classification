package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[5][5];
	public static int i;
	public static int j;
	public static int n1;
	public static int m1;
	public static int t;
	public static int ch(int n,int m)
	{
		if (n > 4 || n < 0 || m>4 || m < 0)
		{
			return 0;
		}
		if ((n >= 0 && n <= 4) && (m >= 0 && m <= 4))
		{
			return 1;
		}
	}
	public static int Main()
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
			n1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m1 = Integer.parseInt(tempVar3);
		}
		if (ch(n1, m1) == 0)
		{
			System.out.print("error\n");
		}
		if (ch(n1, m1) == 1)
		{
			for (i = 0;i < 5;i++)
			{
				t = a[n1][i];
				a[n1][i] = a[m1][i];
				a[m1][i] = t;
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
				   System.out.printf("%d ",a[i][j]);
				}
				if (j == 4)
				{
					System.out.printf("%d\n",a[i][j]);
				}
			}
			System.out.print("\n");
		}
		return 0;
	}


}

