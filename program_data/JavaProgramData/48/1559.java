package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   int m;
		   int n;
	  int[][] a = new int[10][10];
	  int[][] b = new int[10][10];
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
	  a[4][4] = m;
	  int i = 0;
	  int j = 0;
	  int k;
	  int x;
	  int y;
	  for (k = 0;k < n;k++)
	  {
		for (i = 0;i < 9;i++)
		{
			 for (j = 0;j < 9;j++)
			 {
				b[i][j] = a[i][j] + a[i - 1][j - 1] + a[i - 1][j] + a[i - 1][j + 1] + a[i][j - 1] + a[i][j + 1] + a[i + 1][j - 1] + a[i + 1][j] + a[i + 1][j + 1];
			 }

		}
		for (i = 0;i < 9;i++)
		{
			  for (j = 0;j < 9;j++)
			  {
							   a[i][j] = a[i][j] + b[i][j];
			  }
		}


	  }

		for (x = 0;x < 9;x++)
		{
			for (y = 0;y < 9;y++)
			{
				if (a[x][y] > 0)
				{
					if (y < 8)
					{
					System.out.printf("%d ",a[x][y]);
					}
				   else
				   {
				   System.out.printf("%d",a[x][y]);
				   }
				}
				else
				{
				if (y < 8)
				{
					System.out.printf("0 ",a[x][y]);
				}
				   else
				   {
				   System.out.printf("0",a[x][y]);
				   }
				}

			}
			 System.out.print("\n");
		}


	System.in.read();
	System.in.read();


	}

}

