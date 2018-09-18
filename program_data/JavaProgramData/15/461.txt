package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][] p = new int[1000][1000];
		int i;
		int j;
		int a;
		int b;
		int a1;
		int b1;
		int n;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
						 for (j = 0;j < n;j++)
						 {
										  String tempVar2 = ConsoleInput.scanfRead();
										  if (tempVar2 != null)
										  {
											  p[i][j] = Integer.parseInt(tempVar2);
										  }
						 }
		}
		for (i = 0;i < n;i++)
		{
						 for (j = 0;j < n;j++)
						 {
										  if (p[i][j] == 0)
										  {
														 a = i;
														 b = j;
														 break;
										  }
						 }
										  if (p[a][b] == 0)
										  {
														 break;
										  }
		}
		for (i = n - 1;i >= 0;i--)
		{
							for (j = n - 1;j >= 0;j--)
							{
												if (p[i][j] == 0)
												{
															   a1 = i;
															   b1 = j;
															   break;
												}
							}
												if (p[a1][b1] == 0)
												{
																 break;
												}
		}
		s = (a1 - a - 1) * (b1 - b - 1);
		System.out.printf("%d",s);
	}
}

