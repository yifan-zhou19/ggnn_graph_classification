package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[][] num = new int[9][9];
	   int[][] next = new int[9][9];
	   int m;
	   int n;
	   int i;
	   int j;
	   int t;
	   int k;
	   int h;
	   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	   for (i = 0;i < 9;i++)
	   {
		  for (j = 0;j < 9;j++)
		  {
				 num[i][j] = 0;
			  next[i][j] = 0;
		  }
	   }
	   num[4][4] = m;

	   for (t = n;t >= 1;t--)
	   {
			 for (i = 0;i < 9;i++)
			 {
			for (j = 0;j < 9;j++)
			{
			   if (num[i][j] != 0)
			   {
					 next[i][j] += 2 * num[i][j];
				  next[i - 1][j] += num[i][j];
				  next[i + 1][j] += num[i][j];
				  next[i][j - 1] += num[i][j];
				  next[i][j + 1] += num[i][j];
				  next[i - 1][j - 1] += num[i][j];
				  next[i - 1][j + 1] += num[i][j];
				  next[i + 1][j - 1] += num[i][j];
				  next[i + 1][j + 1] += num[i][j];
			   }
			}
			 }
		  for (i = 0;i < 9;i++)
		  {
			 for (j = 0;j < 9;j++)
			 {
					  num[i][j] = next[i][j];
				   next[i][j] = 0;
			 }
		  }
	   }
	   for (i = 0;i < 9;i++)
	   {
			   for (j = 0;j < 8;j++)
			   {
			   System.out.print(num[i][j]);
			   System.out.print(" ");
			   }
			System.out.print(num[i][j]);
			System.out.print("\n");
	   }

	   return 0;
	}
}

