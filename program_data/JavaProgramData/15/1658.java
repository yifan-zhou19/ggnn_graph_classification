package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] sz = new int[1000][1000];
		int i;
		for (i = 0;i < n;i++)
		{
						 int j;
						 for (j = 0;j < n;j++)
						 {
										  String tempVar2 = ConsoleInput.scanfRead();
										  if (tempVar2 != null)
										  {
											  sz[i][j] = Integer.parseInt(tempVar2);
										  }
						 }
						  System.out.print("\n");
		}
		int k;
		int sum = 0;
		for (k = 0;k < n && sum == 0;k++)
		{
						 int p;
						 for (p = 0;p < n;p++)
						 {
										  if (sz[k][p] == 0)
										  {
														  sum = sum + 1;
										  }
						 }
		}
		int sum1 = 0;
		int q;
		for (q = 0;q < n && sum1 == 0;q++)
		{
						 int m;
						 for (m = 0;m < n;m++)
						 {
										  if (sz[m][q] == 0)
										  {
														  sum1++;
										  }
						 }
		}

		int jieguo = (sum - 2) * (sum1 - 2);
		System.out.printf("%d",jieguo);
		return 0;
	}
}

