package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int i;
		int j;
		int t;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int[][] a = new int[100][100];
		int[] b = new int[k - 1];
		for (t = 0;t < k;t++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
			 for (i = 0;i < m;i++)
			 {
						 for (j = 0;j < n;j++)
						 {
										  String tempVar4 = ConsoleInput.scanfRead();
										  if (tempVar4 != null)
										  {
											  a[i][j] = Integer.parseInt(tempVar4);
										  }
						 }
			 }
			 for (i = 0;i < m;i++)
			 {
						 for (j = 0;j < n;j++)
						 {
									   if (i == 0 || i == m - 1)
									   {
														  s = s + a[i][j];
									   }
									   else if (j == 0 || j == n - 1)
									   {
															  s = s + a[i][j];
									   }
						 }
			 }
			b[t] = s;
			s = 0;
		}
		for (t = 0;t < k;t++)
		{
						 System.out.printf("%d\n",b[t]);
		}
						 return 0;
	}
}

