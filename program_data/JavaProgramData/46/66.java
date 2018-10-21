package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int row;
	  int col;
	  int i;
	  int j;
	  int[][] u = new int[100][100];
	  int a;
	  int sum = 0;
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
				 u[i][j] = Integer.parseInt(tempVar3);
			 }
		  }
	  }
	  for (a = 0;a < row / 2 + 1;a++)
	  {
		  for (i = a,j = a;j < col - a;j++)
		  {
			System.out.printf("%d\n",u[i][j]);
			sum++;
			if (sum == row * col)
			{
				 break;
			}
		  }
		  if (sum == row * col)
		  {
				 break;
		  }
		  for (j = col - a - 1,i = a + 1;i < row - a;i++)
		  {
			System.out.printf("%d\n",u[i][j]);
			sum++;
			if (sum == row * col)
			{
				 break;
			}
		  }
		   if (sum == row * col)
		   {
				 break;
		   }

		  for (i = row - a - 1,j = col - a - 2;j >= a;j--)
		  {
			System.out.printf("%d\n",u[i][j]);
			sum++;
		   if (sum == row * col)
		   {
				 break;
		   }
		  }
		   if (sum == row * col)
		   {
				 break;
		   }
		  for (j = a,i = row - a - 2;i > a;i--)
		  {
			System.out.printf("%d\n",u[i][j]);
			sum++;
		   if (sum == row * col)
		   {
				 break;
		   }
		  }
		   if (sum == row * col)
		   {
				 break;
		   }
	  }

	  return 0;
	}

}

