package <missing>;

public class GlobalMembers
{
	   public static void Main()
	   {
		   int a;
		   int s;
		   int k;
		   int i;
		   int j;
		   int[][] x = new int[100][100];
		   int row;
		   int col;
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
		a = 0;
		for (i = 1;i <= row;i++)
		{
			for (j = 1;j <= col;j++)
			{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			x[i][j] = Integer.parseInt(tempVar3);
		}
			}
		}
		 for (k = 1;k <= (row + 1) / 2 && k <= (col + 1) / 2;k++)
		 {
			 if (k <= row / 2 && k <= col / 2)
			 {
				 s = 0;
			 }
		  else
		  {
			  s = 1;
		  }
		  for (i = k;i <= col - k + 1;i++,a++)
		  {
			  System.out.printf("%d\n", x[k][i]);
		  }
		  if (a >= col * row)
		  {
			  break;
		  }
		  for (j = k + 1;j <= row - k;j++,a++)
		  {
			  System.out.printf("%d\n", x[j][col - k + 1]);
		  }
		  if (a >= col * row)
		  {
			  break;
		  }
		  for (i = col - k + 1;i >= k;i--,a++)
		  {
			  System.out.printf("%d\n", x[row - k + 1][i]);
		  }
		  if (a >= col * row)
		  {
			  break;
		  }
		  for (j = row - k;j > k;j--,a++)
		  {
			  System.out.printf("%d\n", x[j][k]);

		  }
		 if (a >= col * row)
		 {
			 break;
		 }
		 }


	   }
}

