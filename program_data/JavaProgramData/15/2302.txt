package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[][] a = new int[n][n];
		  int b;
		  int c;
		  int d;
		  int e;
		  int f;
		  int i;
		  int j;
		  int zhi = 0;
		  for (i = 0;i <= n - 1;i++)
		  {
			for (j = 0;j <= n - 1;j++)
			{
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a[i][j] = Integer.parseInt(tempVar2);
			  }
			}
		  }
		  for (i = 0;i <= n - 1;i++)
		  {
			for (j = 0;j <= n - 1;j++)
			{
			   if (a[i][j] == 0 && zhi == 0)
			   {
				   b = i;
				   c = j;
				   zhi++;
			   }
			   if (a[i][j] == 0)
			   {
				   d = i;
				   e = j;
			   }
			}
		  }
		  f = (d - b - 1) * (e - c - 1);
		  System.out.printf("%d",f);
	}
}

