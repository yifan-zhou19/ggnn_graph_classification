package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int n;
	   int[][] m = new int[100][100];
	   int i;
	   int j;
	   int a = 0;
	   int b = 0;
	   int c = 0;
	   int d = 0;
	   int x;
	   int y;
	   int s;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < n;i++)
	   {
		 for (j = 0;j < n;j++)
		 {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   m[i][j] = Integer.parseInt(tempVar2);
		   }
		 }
	   }
	   for (i = 0;i < n;i++)
	   {
		 for (j = 0;j < n;j++)
		 {
				   if (m[i][j] == 0 && m[i][j - 1] == 255 && m[i][j + 1] == 0)
				   {
				a = j;
				   }
			  if (j == n - 1 && m[i][j] == 0)
			  {
				b = j;
			  }
			  else if (j != n - 1 && m[i][j] == 0 && m[i][j + 1] == 255 && m[i][j - 1] == 0)
			  {
				b = j;
			  }
			  if (i == 0 && m[i][j] == 0)
			  {
				c = i;
			  }
			  else if (i != 0 && m[i][j] == 0 && m[i - 1][j] == 255 && m[i + 1][j] == 0)
			  {
				c = i;
			  }
			  if (i == n - 1 && m[i][j] == 0)
			  {
				d = i;
			  }
			  else if (i != n - 1 && m[i][j] == 0 && m[i + 1][j] == 255 && m[i - 1][j] == 0)
			  {
				d = i;
			  }
		 }
	   }

	  x = b - a - 1;
	  y = d - c - 1;
	  s = x * y;
	  System.out.printf("%d",s);
	}




}

