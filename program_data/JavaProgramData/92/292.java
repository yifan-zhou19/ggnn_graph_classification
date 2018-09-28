package <missing>;

public class GlobalMembers
{
	public static int n = 0;
	public static int cnt = 0;
	public static int[][] visit = new int[2000][2000];
	public static int[][] dp = new int[2000][2000];
	public static int[] a = new int[2000];
	public static int[] b = new int[2000];
	public static void qsort(int i, int j, int[] a)
	{
	  int l = i;
	  int r = j;
	  int mid = a[(i + j) / 2];
	  while (l <= r)
	  {
		while (a[l] > mid)
		{
			l++;
		}
		while (a[r] < mid)
		{
			r--;
		}
		if (l <= r)
		{
		  int temp = a[l];
		  a[l] = a[r];
		  a[r] = temp;
		  l++;
		  r--;
		}
	  }
	  if (l < j)
	  {
		  qsort(l, j, a);
	  }
	  if (i < r)
	  {
		  qsort(i, r, a);
	  }
	}
	public static int f(int i,int j)
	{
	  if (visit[i][j] != cnt)
	  {
		visit[i][j] = cnt;
		if (j > n)
		{
			dp[i][j] = 0;
		}
		else
		{
		  int a1 = 0;
		  if (a[i] > b[j])
		  {
			  a1 = 200;
		  }
		  else if (a[i] == b[j])
		  {
			  a1 = 0;
		  }
		  else
		  {
			  a1 = -200;
		  }
		  int k1 = f(i + 1, j + 1) + a1;
		  int a2 = 0;
		  if (a[n - (j - i)] > b[j])
		  {
			  a2 = 200;
		  }
		  else if (a[n - (j - i)] == b[j])
		  {
			  a2 = 0;
		  }
		  else
		  {
			  a2 = -200;
		  }
		  int k2 = f(i, j + 1) + a2;
		  dp[i][j] = k1;
		  if (k2 > k1)
		  {
			  dp[i][j] = k2;
		  }
		}
	  }
	  return dp[i][j];
	}
	public static int Main()
	{
		//freopen("zozo.in","r",stdin);
		//freopen("zozo.out","w",stdout);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 0)
		{
		  for (int i = 1; i <= n; i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a[i] = Integer.parseInt(tempVar2);
			  }
		  }
		  for (int i = 1; i <= n; i++)
		  {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  b[i] = Integer.parseInt(tempVar3);
			  }
		  }
		  qsort(1, n, a);
		  qsort(1, n, b);
		  cnt++;
		  int ans = f(1, 1);
		  System.out.printf("%d\n",ans);
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  n = Integer.parseInt(tempVar4);
		  }
		}
	}

}

