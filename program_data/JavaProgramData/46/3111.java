package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int row;
		int col;
		 int t = 0;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] array = new int[row][col];
		for (i = 0; i <= row - 1;i++)
		{
		  for (j = 0; j <= col - 1; j++)
		  {
			   array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  }
		}
		 for (k = 0;;k++)
		 {
		   for (j = 0 + k; j <= col - 1 - k; j++)
		   {
			  System.out.print(array[k][j]);
			  System.out.print("\n");
			  t++;
			  if (t == row * col)
			  {
					break;
			  }
		   }
			  if (t == row * col)
			  {
				   break;
			  }
		   for (i = 1 + k; i <= row - 1 - k; i++)
		   {
			  System.out.print(array[i][col - 1 - k]);
			  System.out.print("\n");
			  t++;
			  if (t == row * col)
			  {
					break;
			  }
		   }
			  if (t == row * col)
			  {
					break;
			  }
		   for (j = col - 2 - k; j >= 0 + k; j--)
		   {
			  System.out.print(array[row - 1 - k][j]);
			  System.out.print("\n");
			  t++;
			   if (t == row * col)
			   {
					break;
			   }
		   }
					if (t == row * col)
					{
					break;
					}
		   for (i = row - 2 - k; i >= 1 + k; i--)
		   {
			   System.out.print(array[i][0 + k]);
			   System.out.print("\n");
			  t++;
					   if (t == row * col)
					   {
					break;
					   }
		   }
			if (t == row * col)
			{
					break;
			}
		 }
		   return 0;
	}
}

