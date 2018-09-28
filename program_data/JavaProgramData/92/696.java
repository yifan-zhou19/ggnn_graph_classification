package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] n = new int[100];
		  int[][] t = new int[100][1005];
		  int[][] q = new int[100][1005];
		  int i;
		  int j;
		  int k;
		  int z = 0;
		  for (i = 0;;i++)
		  {
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  n[i] = Integer.parseInt(tempVar);
			  }
			  if (n[i] == 0)
			  {
				  z = i;
				  break;
			  }
			  for (j = 0;j <= n[i] - 1;j++)
			  {
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  t[i][j] = Integer.parseInt(tempVar2);
				  }
			  }
			  for (j = 0;j <= n[i] - 1;j++)
			  {
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  q[i][j] = Integer.parseInt(tempVar3);
				  }
			  }
		  }
		  for (i = 0;i <= z - 1;i++)
		  {
			  int change = 0;
			  for (j = 0;j <= n[i] - 1;j++)
			  {
				  for (k = j + 1;k <= n[i];k++)
				  {
					  if (t[i][j] < t[i][k])
					  {
					   change = t[i][k];
					   t[i][k] = t[i][j];
					   t[i][j] = change;
					  }
					 if (q[i][j] < q[i][k])
					 {
					   change = q[i][k];
					   q[i][k] = q[i][j];
					   q[i][j] = change;
					 }
				  }
			  }
			  int ft = 0;
			  int fq = 0;
			  int st = n[i] - 1;
			  int sq = n[i] - 1;
			  int money = 0;
			  for (j = ft;j <= st;j++)
			  {
				  for (k = fq;k <= sq;k++)
				  {
					 if (t[i][j] > q[i][k])
					 {
						 money = money + 200;
						 fq = fq + 1;
						 break;
					 }
					 else if (t[i][st] > q[i][sq])
					 {
						 money = money + 200;
						 st = st - 1;
						 sq = sq - 1;
						 j = j - 1;
						 break;
					 }
					 else if (t[i][st] == q[i][fq])
					 {
						 break;
					 }
					 else
					 {
						 money = money - 200;
						 fq = fq + 1;
						 st = st - 1;
						 j = j - 1;
						 break;
					 }
				  }
			  }
			  System.out.printf("%d\n",money);
		  }
	}
}

