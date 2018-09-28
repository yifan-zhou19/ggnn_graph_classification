package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[][] p = new int[9][9];
		  int[][] q = new int[9][9];
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
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  n = Integer.parseInt(tempVar2);
		  }
		  for (i = 0;i < 9;i++)
		  {
			 for (j = 0;j < 9;j++)
			 {
				p[i][j] = 0;
				q[i][j] = 0;
			 }
		  }
		  p[4][4] = m;
		  for (k = 0;k < n;k++)
		  {
		  for (i = 0;i < 9;i++)
		  {
			 for (j = 0;j < 9;j++)
			 {
				if (p[i][j] != 0)
				{
				   q[i][j] += 2 * p[i][j];
				   q[i - 1][j - 1] += p[i][j];
				   q[i - 1][j] += p[i][j];
				   q[i - 1][j + 1] += p[i][j];
				   q[i][j - 1] += p[i][j];
				   q[i][j + 1] += p[i][j];
				   q[i + 1][j - 1] += p[i][j];
				   q[i + 1][j] += p[i][j];
				   q[i + 1][j + 1] += p[i][j];
				}
			 }
		  }
		  for (i = 0;i < 9;i++)
		  {
			 for (j = 0;j < 9;j++)
			 {
				p[i][j] = q[i][j];
				q[i][j] = 0;
			 }
		  }
		  }
		  for (i = 0;i < 9;i++)
		  {
			 for (j = 0;j < 9;j++)
			 {
				if ((j + 1) % 9 != 0)
				{
					System.out.printf("%d ",p[i][j]);
				}
				else
				{
					System.out.printf("%d\n",p[i][j]);
				}
			 }
		  }

	}
}

