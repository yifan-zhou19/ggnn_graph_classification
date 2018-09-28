package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int row = 0;
	   int col = 0;
	   int k = 0;
	   row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   int i = 0;
	   int j = 0;
	   int[][] s = new int[row][col];
	   for (i = 0;i <= row - 1;i++) //??
	   {
		  for (j = 0;j <= col - 1;j++)
		  {
			 s[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  }
	   }
	   for (i = 0;i <= col - 1;i++) //?????????????
	   {
				 j = 0;
				 k = i;
				 do
				 {
				  System.out.print(s[j][k]);
				  System.out.print("\n");
				  j++;
				  k--;
				 }while ((j <= row - 1) && (k >= 0));
	   }
	   for (i = 1;i <= row - 1;i++) //?????????????
	   {
					  j = col - 1;
					  k = i;
					  do
					  {
						  System.out.print(s[k][j]);
						  System.out.print("\n");
						  k++;
						  j--;
					  }while ((k <= row - 1) && (j >= 0));
	   }
	return 0;
	}

}

