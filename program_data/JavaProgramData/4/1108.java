package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int row;
	   int col;
	   row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   int[][] a = new int[1000][1000];
	   int i;
	   int j;
	   int m;
	   int n;
	   for (i = 1;i <= row;i++)
	   {
		   for (j = 1;j <= col;j++)
		   {
			   a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   }
	   }
	   int time = 0;
	   for (j = 1;j <= col;j++)
	   {
		   m = 1;
		   n = j;
		   while (true)
		   {
			   System.out.print(a[m][n]);
			   time = time+1;
			   if (time < row * col)
			   {
			   System.out.print("\n");
			   }
			   n = n - 1;
			   m = m + 1;
			   if (n < 1)
			   {
				break;
			   }
				if (m > row)
				{
				break;
				}
		   }
	   }
	   for (i = 2;i <= row;i++)
	   {
			 m = i;
			 n = col;
		   while (true)
		   {
			   System.out.print(a[m][n]);
			   time = time+1;
			   if (time < row * col)
			   {
			   System.out.print("\n");
			   }
			   n = n - 1;
			   m = m + 1;

				if (n < 1)
				{
				break;
				}
				if (m > row)
				{
				break;
				}
		   }
	   }







		return 0;
	}
}

