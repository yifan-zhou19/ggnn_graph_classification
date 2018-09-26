package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1100];
	public static int[] b = new int[1100];
	public static int[][] f = new int[1100][1100];
	public static int i;
	public static int j;
	public static int k;
	public static int l;
	public static int m;
	public static int n;
	public static int xys;
	public static int ysc;

	public static int Main()
	{
		while (1 + 1 == 2)
		{
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  n = Integer.parseInt(tempVar);
			  }
			  if (n == 0)
			  {
				  break;
			  }
			  for (i = 1;i <= n;++i)
			  {
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  a[i] = Integer.parseInt(tempVar2);
				  }
			  }
			  for (i = 1;i <= n;++i)
			  {
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  b[i] = Integer.parseInt(tempVar3);
				  }
			  }
			  for (i = 0;i <= n;++i)
			  {
				  for (j = 0;j <= n;++j)
				  {
					  f[i][j] = -10000000;
				  }
			  }
			  sort(a + 1,a + n + 1);
			  sort(b + 1,b + n + 1);
			  f[0][0] = 0;
			  for (i = 1;i <= n;++i)
			  {
				  for (j = 0;j <= i;++j)
				  {
					  if (j == 0)
					  {
						  f[i][j] = f[i - 1][j] - 200;
					  }
					  else
					  {
						   int cmp = 0;
						   if (a[i] > b[j])
						   {
							   cmp = 200;
						   }
						   if (a[i] < b[j])
						   {
							   cmp = -200;
						   }
						   f[i][j] = Math.max(f[i - 1][j] - 200,f[i - 1][j - 1] + cmp);
					  }
				  }
			  }

			  int ans = -10000000;
			  for (i = 0;i <= n;++i)
			  {
				  if (f[n][i] > ans)
				  {
					  ans = f[n][i];
				  }
			  }
			  System.out.print(ans);
			  System.out.print("\n");
		}
		return 0;
	}

}

