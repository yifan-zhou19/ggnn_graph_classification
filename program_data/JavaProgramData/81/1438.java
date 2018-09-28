package <missing>;

public class GlobalMembers
{
	public static int f(int[][] c, int n, int m)
	{
		if (m >= 5 || n >= 5)
		{
			return 0;
		}
		else
		{
		int i;
		int e;
		for (i = 0;i < 5;i++)
		{
						 e = c[n][i];
						 c[n][i] = c[m][i];
						 c[m][i] = e;
		}
		return c[5][5];

		}
	}
	public static int Main()
	{
		int[][] c = new int[5][5];
		int i;
		int j;
		int a;
		int m;
		int n;
		for (i = 0;i < 5;i++)
		{
						 for (j = 0;j < 5;j++)
						 {
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c[i][j] = Integer.parseInt(tempVar);
		}
						 }
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		a = f(c, n, m);
		if (a == 0)
		{
			System.out.print("error");
		}
		else
		{
		 for (i = 0;i < 5;i++)
		 {
		 System.out.printf("%d",c[i][0]);
						 for (j = 1;j < 5;j++)
						 {
		System.out.printf(" %d",c[i][j]);
						 }
	System.out.print("\n");
		 }
		}
		return 0;
	}


}

