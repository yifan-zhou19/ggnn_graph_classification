package <missing>;

public class GlobalMembers
{
	public static int mn(int n,int m)
	{
		if (n >= 0 && n <= 4 && m >= 0 && m <= 4)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int a;
		int n;
		int m;
		int i;
		int j;
		(int)(*p)[5];
		int[][] b = new int[5][5];
		for (i = 0;i < 5;i++)
		{
		   for (j = 0;j < 5;j++)
		   {
			   String tempVar = ConsoleInput.scanfRead();
			   if (tempVar != null)
			   {
				   b[i][j] = Integer.parseInt(tempVar);
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
		a = mn(n, m);
		p = b;
		if (a == 0)
		{
			System.out.print("error\n");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				if (i != m && i != n)
				{
					for (j = 0;j < 4;j++)
					{
					System.out.printf("%d ",b[i][j]);
					}
					System.out.printf("%d",b[i][4]);
					System.out.print("\n");
				}
				else if (i == m)
				{
					for (j = 0;j < 4;j++)
					{
					System.out.printf("%d ",*(*(p + n) + j));
					}
					System.out.printf("%d",*(*(p + n) + 4));
					System.out.print("\n");
				}
				else
				{
					for (j = 0;j < 4;j++)
					{
					System.out.printf("%d ",*(*(p + m) + j));
					}
					System.out.printf("%d",*(*(p + m) + 4));
					System.out.print("\n");
				}
			}
		}
	}

}

