package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int[][] num = new int[1000][300];
		 int[] n = new int[1000];
		 int[] m = new int[1000];
		 int[] f = new int[1000];
		 int i;
		 int j;
		 int k;
		 int l;
		 int M;
		 int N;
		 int T;
		 int t;
		 int x;
		 i = 0;
		 while (i >= 0)
		 {
			   String tempVar = ConsoleInput.scanfRead();
			   if (tempVar != null)
			   {
				   n[i] = Integer.parseInt(tempVar);
			   }
			   String tempVar2 = ConsoleInput.scanfRead(" ");
			   if (tempVar2 != null)
			   {
				   m[i] = Integer.parseInt(tempVar2);
			   }
			if (n[i] == 0 && m[i] == 0)
			{
				 i = i + 1;
			  break;
			}
			else
			{
			  i = i + 1;
			}
		 }
		 T = i;
		 for (i = 1;i <= T;i++)
		 {
		   for (j = 1;j <= n[i - 1];j++)
		   {
			num[i - 1][j] = 1;
		   }
		 }
		 for (i = 1;i <= T;i++)
		 {
			  N = n[i - 1];
		   M = m[i - 1];
		   t = N;
		   k = 1;
		   x = 0;
		   while (t > 1)
		   {
				do
				{
				   if (num[i - 1][k] == 1)
				   {
					   x = x + 1;
					k = k + 1;
				   }
				   else
				   {
					k = k + 1;
				   }
				   if (k == (N + 2))
				   {
					k = 1;
				   }
				} while (x < M);
			  num[i - 1][k - 1] = 0;
			  t = t - 1;
			  x = 0;
		   }
		 }
		   for (i = 1;i <= T;i++)
		   {
			   for (j = 1;j <= n[i - 1];j++)
			   {
				 if (num[i - 1][j] == 1)
				 {
				   f[i] = j;
				 }
			   }
		   }
		   for (i = 1;i <= T;i++)
		   {
			for (j = 1;j <= n[i - 1];j++)
			{
			 if (num[i - 1][j] == 1)
			 {
			   System.out.printf("%d\n",f[i]);
			 }
			}
		   }
	}
}

