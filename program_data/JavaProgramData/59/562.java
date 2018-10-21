package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int a;
		int b;
		int[][] jm = new int[102][102];
		int[][] next = new int[102][102];
		int s = 0;
		char[][] mz = new char[102][102];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 mz[i] = tempVar2.charAt(0);
						 }
						 for (b = 0;b < n;b++)
						 {
										  if (mz[i][b] == '@')
										  {
															jm[i + 1][b + 1] = 2;
										  }
															else if (mz[i][b] == '.')
															{
																 jm[i + 1][b + 1] = 1;
															}
						 }
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		for (i = 1;i < m;i++)
		{
						 for (a = 1;a <= n;a++)
						 {
										   for (b = 1;b <= n;b++)
										   {
															 if (jm[a][b] == 1 && (jm[a][b - 1] == 2 || jm[a][b + 1] == 2 || jm[a - 1][b] == 2 || jm[a + 1][b] == 2))
															 {
																																		   next[a][b] = 2;
															 }
																																					 else
																																					 {
																																						  next[a][b] = jm[a][b];
																																					 }
										   }
						 }
						 for (a = 1;a <= n;a++)
						 {
										   for (b = 1;b <= n;b++)
										   {
															 jm[a][b] = next[a][b];
															 if ((i == m - 1) && jm[a][b] == 2)
															 {
																					 s++;

															 }
										   }
						 }
		}
		System.out.printf("%d",s);
		return 0;
	}

}

