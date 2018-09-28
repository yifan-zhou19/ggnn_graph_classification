package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int a;
		  int b;
		  int t;
		  int i;
		  int j;
		  int j1;
		  int j2;
		  int k = 0;
		  int m1;
		  int m2;
		  int q1;
		  int q2;
		  int q;
		  int[] n = new int[100];
		  int[][] tj = new int[100][1000];
		  int[][] qw = new int[100][1000];
		  for (i = 0;;i++)
		  {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n[i] = Integer.parseInt(tempVar);
		  }
		  if (n[i] == 0)
		  {
			  break;
		  }
		  else
		  {
		  for (j = 0;j < n[i];j++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  tj[i][j] = Integer.parseInt(tempVar2);
			  }
		  }
		  for (j = 0;j < n[i];j++)
		  {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  qw[i][j] = Integer.parseInt(tempVar3);
			  }
		  }
		  }
		  k++;
		  }
		  for (i = 0;i < k;i++)
		  {
		  for (a = 0;a < (n[i] - 1);a++)
		  {
		  for (b = 0;b < (n[i] - a - 1);b++)
		  {
		  if (tj[i][b] < tj[i][b + 1])
		  {
		  t = tj[i][b];
		  tj[i][b] = tj[i][b + 1];
		  tj[i][b + 1] = t;
		  }
		  if (qw[i][b] < qw[i][b + 1])
		  {
		  t = qw[i][b];
		  qw[i][b] = qw[i][b + 1];
		  qw[i][b + 1] = t;
		  }
		  }
		  }
		  q1 = 0;
		  q2 = 0;
		  q = 0;
		  j1 = 0;
		  j2 = 0;
		  m1 = 0;
		  m2 = 0;
		  for (;;)
		  {
		  if ((j1 + j2) == (n[i] - 1))
		  {
		  if (tj[i][j1] > qw[i][m1])
		  {
			  q1++;
		  }
		  if (tj[i][j1] == qw[i][m1])
		  {
			  q2++;
		  }
		  break;
		  }
		  if (tj[i][n[i] - j2 - 1] > qw[i][n[i] - m2 - 1])
		  {
			  q1++;
			  j2++;
			  m2++;
		  }
		  else
		  {
		  if (tj[i][n[i] - j2 - 1] < qw[i][n[i] - m2 - 1])
		  {
			  m1++;
			  j2++;
		  }
		  else
		  {
		  if ((tj[i][n[i] - j2 - 1] == qw[i][n[i] - m2 - 1]) && (tj[i][j1] > qw[i][m1]))
		  {
			  q1++;
			  m1++;
			  j1++;
		  }
		  else
		  {
		  if ((tj[i][n[i] - j2 - 1] == qw[i][n[i] - m2 - 1]) && (tj[i][j1] < qw[i][m1]))
		  {
			  m1++;
			  j2++;
		  }
		  else
		  {
		  if ((tj[i][n[i] - j2 - 1] == qw[i][n[i] - m2 - 1]) && (tj[i][j1] == qw[i][m1]))
		  {
		  if (qw[i][m1] > tj[i][n[i] - j2 - 1])
		  {
			  m1++;
			  j2++;
		  }
		  else
		  {
			  m1++;
			  j2++;
			  q2++;
		  }
		  }
		  }
		  }
		  }
		  }
		  }
		  q = q1 * 200 - (n[i] - q1 - q2) * 200;
		  System.out.printf("%d\n",q);
		  }
	}
}

