package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int m;
	  int n;
	  int i;
	  int j;
	  int x;
	  int t;
	  int num;
	  m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  num = m * n;
	  int[][] a = new int[m][n];
	  for (i = 0;i <= m - 1;i++)
	  {
		 for (j = 0;j <= n - 1;j++)
		 {
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i][j] = x;
		 }
	  }
	  t = 0;
	 while (num != 0)
	 {
	  if ((t % 4 == 0) && (num != 0))
	  {
		 for (j = 0;j <= n - 1;j++)
		 {
			num--;
			if (num != 0)
			{
			System.out.print(a[0][j]);
			System.out.print("\n");
			}
			else
			{
			System.out.print(a[0][j]);
			}
		 }
		for (i = 0;i <= m - 2;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
			a[i][j] = a[i + 1][j];
			}
		}
		 m--;
		 t++;
	  }
	   if ((t % 4 == 1) && (num != 0))
	   {
		for (i = 0;i <= m - 1;i++)
		{
		   num--;
		   if (num != 0)
		   {
		   System.out.print(a[i][n - 1]);
		   System.out.print("\n");
		   }
		   else
		   {
			System.out.print(a[i][n - 1]);
		   }
		}
		n--;
		t++;
	   }
		if ((t % 4 == 2) && (num != 0))
		{
		  for (j = n - 1;j >= 0;j--)
		  {
			 num--;
			 if (num != 0)
			 {
			 System.out.print(a[m - 1][j]);
			 System.out.print("\n");
			 }
			 else
			 {
			 System.out.print(a[m - 1][j]);
			 }
		  }
		  m--;
		  t++;
		}
		if ((t % 4 == 3) && (num != 0))
		{
		 for (i = m - 1;i >= 0;i--)
		 {
			num--;
			if (num != 0)
			{
			System.out.print(a[i][0]);
			System.out.print("\n");
			}
			else
			{
			System.out.print(a[i][0]);
			}
		 }
		for (j = 0;j <= n - 2;j++)
		{
		   for (i = 0;i <= m - 1;i++)
		   {
			a[i][j] = a[i][j + 1];
		   }
		}
		 n--;
		 t++;
		}
	 }
	return 0;
	}
}

