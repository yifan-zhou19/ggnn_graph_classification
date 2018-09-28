package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[][] a = new int[102][102];
	   int[][] b = new int[102][102];
	   int m;
	   int n;
	   int x;
	   int y;
	   int i;
	   int j;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   m = Integer.parseInt(tempVar2);
	   }
	   for (i = 0;i < n;i++)
	   {
		  for (j = 0;j < m;j++)
		  {
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 a[i][j] = Integer.parseInt(tempVar3);
			 }
		  }
	   }

	   int k = 1;
	   x = 0;
	   y = 0;
	   System.out.printf("%d\n",a[0][0]);
	   b[0][0] = 1;
	   while (k < m * n)
	   {
			while ((y + 1 < m) && (b[x][y + 1] == 0))
			{
				y++;
				k++;
				b[x][y] = 1;
				System.out.printf("%d\n",a[x][y]);
			}
			while ((x + 1 < n) && (b[x + 1][y] == 0))
			{
				x++;
				k++;
				b[x][y] = 1;
				System.out.printf("%d\n",a[x][y]);
			}
			while ((y - 1 >= 0) && (b[x][y - 1] == 0))
			{
				y--;
				k++;
				b[x][y] = 1;
				System.out.printf("%d\n",a[x][y]);
			}
			while ((x - 1 >= 0) && (b[x - 1][y] == 0))
			{
				x--;
				k++;
				b[x][y] = 1;
				System.out.printf("%d\n",a[x][y]);
			}
	   }
		return 1;
	}

}

