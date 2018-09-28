package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int m;
		  int q;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  q = Integer.parseInt(tempVar2);
		  }
		  int[][] a = new int[m][q];
		  for (int i = 0;i < m;i++)
		  {
		  for (int t = 0;t < q;t++)
		  {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a[i][t] = Integer.parseInt(tempVar3);
		  }
		  }
		  }
		  int p;
		  int n;
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  p = Integer.parseInt(tempVar4);
		  }
		  String tempVar5 = ConsoleInput.scanfRead(" ");
		  if (tempVar5 != null)
		  {
			  n = Integer.parseInt(tempVar5);
		  }
		  int[][] b = new int[p][n];
		  for (int i = 0;i < p;i++)
		  {
		  for (int t = 0;t < n;t++)
		  {
		  String tempVar6 = ConsoleInput.scanfRead();
		  if (tempVar6 != null)
		  {
			  b[i][t] = Integer.parseInt(tempVar6);
		  }
		  }
		  }
		  int[][] c = new int[m][n];
		  for (int i = 0;i < m;i++)
		  {
		  for (int t = 0;t < n;t++)
		  {
		  c[i][t] = 0;
		  for (int s = 0;s < p;s++)
		  {
			c[i][t] += (a[i][s] * b[s][t]);
		  }
			if (t != (n - 1))
			{
			System.out.printf("%d ",c[i][t]);
			}
			else
			{
				System.out.printf("%d\n",c[i][t]);
			}

		  }
		  }

	}

}

