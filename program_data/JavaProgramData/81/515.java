package <missing>;

public class GlobalMembers
{
	public static int jiaohuan(int n, int m, int[][] a)
	{
		int i;
		int c;
		int t;
		if (((m < 0) || (m>4)) || ((n < 0) || (n>4)))
		{
			c = 0;
		}
		else
		{
			c = 1;
			for (i = 0;i < 5;i++)
			{
				t = a[m][i];
				a[m][i] = a[n][i];
				a[n][i] = t;
			}
		}
		return (c);


	}
	public static void Main()
	{
		int n;
		int m;
		int c;
		int i;
		int j;
		int[][] a = new int[5][5];
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
		c = jiaohuan(n, m, a);
		if (c == 0)
		{
			System.out.print("error");
		}
		if (c == 1)
		{
				for (i = 0;i < 5;i++)
				{
				System.out.printf("%d",a[i][0]);
				for (j = 1;j < 5;j++)
				{
					System.out.printf(" %d",a[i][j]);
				}
				System.out.print("\n");
				}
		}
	}

}

