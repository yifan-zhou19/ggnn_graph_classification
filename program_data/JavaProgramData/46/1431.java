package <missing>;

public class GlobalMembers
{
	public static void f(int x, int y, int[][] a)
	{
	   int i;
	   int j;
	   if (x * y == 0 || x < 0 || y < 0) //???????
	   {
		 return;
	   }
	   if (x == 1 || y == 1)
	   {
		 for (i = 0;i < x;i++)
		 {
		   for (j = 0;j < y;j++)
		   {
			 System.out.print(a[i][j]);
			 System.out.print("\n");
		   }
		 }
	   return;
	   }
	   int[][] b = new int[100][100];
	   for (j = 0;j < y;j++) //????
	   {
		 System.out.print(a[0][j]);
		 System.out.print("\n");
	   }
	   for (i = 1;i < x;i++)
	   {
		 System.out.print(a[i][y - 1]);
		 System.out.print("\n");
	   }
	   for (j = y - 2;j >= 0;j--)
	   {
		 System.out.print(a[x - 1][j]);
		 System.out.print("\n");
	   }
	   for (i = x - 2;i > 0;i--)
	   {
		 System.out.print(a[i][0]);
		 System.out.print("\n");
	   }
	   for (i = 1;i < x - 1;i++)
	   {
		 for (j = 1;j < y - 1;j++)
		 {
			 b[i - 1][j - 1] = a[i][j];
		 }
	   }

	   f(x - 2, y - 2, b); //????????
	   return;
	}

	public static int Main()
	{
	int x;
	int y;
	int[][] a = new int[100][100];
	int i;
	int j;
	x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < x;i++)
	{
	  for (j = 0;j < y;j++)
	  {
		a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  }
	}
	if (x == 1 || y == 1)
	{
	  for (i = 0;i < x;i++)
	  {
		for (j = 0;j < y;j++)
		{
		  System.out.print(a[i][j]);
		  System.out.print("\n");
		}
	  }
	}
	else
	{
	   f(x, y, a);
	}
	return 0;
	}

}

