package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[][] real = new int[9][9];
		  int[][] virtl = new int[9][9];
		  int m;
		  int n;
		  int i;
		  int j;
		  int k;
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
		  for (i = 3;i < 6;i++)
		  {
			  for (j = 3;j < 6;j++)
			  {
				  real[i][j] = m;
			  }
		  }
		  real[4][4] = 2 * m;

		  for (k = 3;k > 4 - n;k--)
		  {

					 for (i = 0;i < 9;i++)
					 {
					  for (j = 0;j < 8;j++)
					  {
					  virtl[i][j] = real[i][j];
					  real[i][j] = 0;
					  }
					 }

			 for (i = k;i < 9 - k;i++)
			 {
				 for (j = k;j < 9 - k;j++)
				 {
					 real[i][j] = real[i][j] + 2 * virtl[i][j];
					 real[i - 1][j - 1] += virtl[i][j];
					 real[i - 1][j] += virtl[i][j];
					 real[i - 1][j + 1] += virtl[i][j];
					 real[i][j - 1] += virtl[i][j];
					 real[i][j + 1] += virtl[i][j];
					 real[i + 1][j - 1] += virtl[i][j];
					 real[i + 1][j] += virtl[i][j];
					 real[i + 1][j + 1] += virtl[i][j];
				 }
			 }
		  }








		  for (i = 0;i < 9;i++)
		  {
			  for (j = 0;j < 8;j++)
			  {
				  System.out.printf("%d ",real[i][j]);
			  }
			  System.out.printf("%d\n",real[i][8]);
		  }

	}

}

