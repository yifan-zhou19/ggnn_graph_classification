package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int k;
	  int m;
	  int n;
	  int i;
	  int j1;
	  int j2;
	  int e1;
	  int e2;
	  int sum;
	  int[][] juzhen = new int[100][100];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  k = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < k;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		for (j1 = 0;j1 < m;j1++)
		{
		  for (e1 = 0;e1 < n;e1++)
		  {
			 String tempVar4 = ConsoleInput.scanfRead();
			 if (tempVar4 != null)
			 {
				 juzhen[j1][e1] = Integer.parseInt(tempVar4);
			 }
		  }
		}
		sum = 0;
		for (j2 = 0;j2 < n;j2++)
		{
		  sum = sum + juzhen[0][j2] + juzhen[m - 1][j2];
		}
		for (e2 = 1;e2 < m - 1;e2++)
		{
		  sum = sum + juzhen[e2][0] + juzhen[e2][n - 1];
		}
		System.out.printf("%d\n",sum);
	  }
	  return 0;
	}

}

