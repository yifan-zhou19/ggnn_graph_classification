package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int row;
	   int col;
	   int i;
	   int j;
	   int k;
	   int t = 0;
	   int[][] a = new int[200][200];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   row = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   col = Integer.parseInt(tempVar2);
	   }
	   for (i = 0;i < row;i++)
	   {
		   for (j = 0;j < col;j++)
		   {
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   a[i][j] = Integer.parseInt(tempVar3);
			   }
		   }
	   }
	   for (i = 0;i < row;i++)
	   {
		   for (j = i;j < col - i;j++)
		   {
			  t++;
			  if (t == row * col)
			  {
				  System.out.printf("%d",a[i][j]);
		return 0;
			  }
			  else
			  {
				  System.out.printf("%d\n",a[i][j]);
			  }

		   }
		   j = col - i - 1;
		   for (k = i + 1;k < row - i;k++)
		   {
			 t++;
			  if (t == row * col)
			  {
				  System.out.printf("%d",a[k][j]);
		return 0;
			  }
			  else
			  {
				  System.out.printf("%d\n",a[k][j]);
			  }


		   }
		   k = row - i - 1;
		   for (j = col - i - 2;j >= i;j--)
		   {
			  t++;
			  if (t == row * col)
			  {
				  System.out.printf("%d",a[k][j]);
		return 0;
			  }
			  else
			  {
				  System.out.printf("%d\n",a[k][j]);
			  }

		   }
		   j = i;
		   for (k = row - i - 2;k > i;k--)
		   {
			   t++;
			  if (t == row * col)
			  {
				  System.out.printf("%d",a[k][j]);
		return 0;
			  }
			  else
			  {
				  System.out.printf("%d\n",a[k][j]);
			  }

		   }
	   }

		return 0;

	}
}

