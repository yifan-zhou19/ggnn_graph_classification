package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int j;
	  int n;
	  int k;
	  int row;
	  int col;
	  int[][] a = new int[101][101];
	  row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (i = 1 ;i <= row ; i++)
	  {
		  for (j = 1 ;j <= col ; j++)
		  {
			 a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  }
	  }
	  for (j = 1 ;j <= col ; j++)
	  {
		 System.out.print(a[1][j]);
		 System.out.print("\n");
		 int k = 1;
		 while (((1 + k) <= row) && ((j - k) >= 1))
		 {
		   System.out.print(a[1 + k][j - k]);
		   System.out.print("\n");
		   k++;
		 }
	  }
		  for (i = 2 ; i <= row ;i++)
		  {
			System.out.print(a[i][col]);
			System.out.print("\n");
			int k = 1;
			while (((i + k) <= row) && ((col - k) >= 1))
			{
		   System.out.print(a[i + k][col - k]);
		   System.out.print("\n");
		   k++;
			}
		  }
		  return 0;
	}

}

