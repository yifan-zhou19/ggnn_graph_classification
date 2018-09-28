package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int m;
		int n;
		int[][] c = new int[13][13];
		for (a = 1;a <= 11;a++)
		{
			for (b = 1;b <= 11;b++)
			{
				c[a][b] = 0;
			}
		}
		int[][] e = new int[13][13];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		c[6][6] = m;
		for (i = 1;i <= n;i++)
		{
			 for (a = 2;a <= 10;a++)
			 {
				  for (b = 2;b <= 10;b++)
				  {
					   e[a][b] = 2 * c[a][b] + c[a - 1][b - 1] + c[a - 1][b] + c[a - 1][b + 1] + c[a][b - 1] + c[a][b + 1] + c[a + 1][b - 1] + c[a + 1][b] + c[a + 1][b + 1];
				  }
			 }
			 for (a = 2;a <= 10;a++)
			 {
				  for (b = 2;b <= 10;b++)
				  {
					   c[a][b] = e[a][b];
				  }
			 }
		}
		for (a = 2;a <= 10;a++)
		{
			 for (b = 2;b <= 10;b++)
			 {
				  if (b == 10)
				  {
					  System.out.printf("%d\n",c[a][b]);
				  }
				  else
				  {
					  System.out.printf("%d ",c[a][b]);
				  }
			 }
		}
	return 0;
	}

}

