package <missing>;

public class GlobalMembers
{
	public static int x(int p1,int p2)
	{
		if (p1 >= 0 && p1 <= 4 && p2 >= 0 && p2 <= 4)
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
		int i;
		int j;
		int n;
		int m;
		int t;
		int y;
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
		y = x(n, m);
		if (y != 0)
		{
			for (i = 0;i < 5;i++)
			{
				t = a[n][i];
			 a[n][i] = a[m][i];
			 a[m][i] = t;
			}
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
		else
		{
			System.out.print("error\n");
		}
		return 0;
	}
}

