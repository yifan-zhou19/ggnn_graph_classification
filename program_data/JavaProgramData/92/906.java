package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 1;
		int i;
		int j;
		int t;
		int u;
		int h = 0;
		int[] tj = new int[2000];
		int[] qw = new int[2000];
		int[] r = new int[2000];
		int[] s = new int[2000];
		while (n != 0)
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
		 h = h + 1;
		 for (i = 1;i < n;i++)
		 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 tj[i] = Integer.parseInt(tempVar2);
		 }
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 tj[n] = Integer.parseInt(tempVar3);
		 }
		 for (i = 1;i <= n;i++)
		 {
			 for (j = n;j > i;j--)
			 {
				if (tj[j - 1] <= tj[j])
				{
					t = tj[j - 1];
					tj[j - 1] = tj[j];
					tj[j] = t;
				}
			 }
		 }
		 for (i = 1;i < n;i++)
		 {
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 qw[i] = Integer.parseInt(tempVar4);
		 }
		 }
		 String tempVar5 = ConsoleInput.scanfRead();
		 if (tempVar5 != null)
		 {
			 qw[n] = Integer.parseInt(tempVar5);
		 }
		 for (i = 1;i <= n;i++)
		 {
			 for (j = n;j > i;j--)
			 {
				if (qw[j - 1] <= qw[j])
				{
					t = qw[j - 1];
					qw[j - 1] = qw[j];
					qw[j] = t;
				}
			 }
		 }
			  for (j = 0;j < n;j++)
			  {
			  u = j;
			  for (i = 1;i <= n;i++)
			  {
				 if ((u + i) > n)
				 {
				 u = u - n;
				 }
				 if ((tj[i]) > (qw[i + u]))
				 {
				 s[j] = s[j] + 1;
				 }
				 if ((tj[i]) < (qw[i + u]))
				 {
				 s[j] = s[j] - 1;
				 }
			  }
			  }
				 for (j = n - 1;j > 0;j--)
				 {
					 if (s[j - 1] <= s[j])
					 {
					  s[j - 1] = s[j];
					 }
				 }
					  r[h] = 200 * s[0];
					  for (i = 0;i <= n;i++)
					  {
					  s[i] = 0;
					  }
		}
					  for (i = 1;i <= h;i++)
					  {
					  System.out.printf("%d\n",r[i]);
					  }
						return 0;
	}








}

