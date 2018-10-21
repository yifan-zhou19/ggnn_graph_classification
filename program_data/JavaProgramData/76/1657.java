package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int[][] a = new int[50000][2];
		 int[] sz = new int[10000];
		 int s;
		 int t;
		 int st = 0;
		 int i;
		 int j;
		 int k;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (i = 1;i <= n;i++)
		 {
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 a[i][0] = Integer.parseInt(tempVar2);
				 }
				 String tempVar3 = ConsoleInput.scanfRead();
				 if (tempVar3 != null)
				 {
					 a[i][1] = Integer.parseInt(tempVar3);
				 }
		 }
		 for (i = 1;i <= 10000;i++)
		 {
			 sz[i] = 0;
		 }
		for (j = 1;j <= n;j++)
		{
			for (k = a[j][0] + 1;k <= a[j][1];k++)
			{
						sz[k] = 1;
			}
		}
		t = 1,s = 10000;
		 for (i = 1;i <= 10000;i++)
		 {
			  if (sz[i] == 1)
			  {
			  if (i < s)
			  {
					  s = i;
			  }
			  if (i > t)
			  {
					  t = i;
			  }
			  }
		 }
		 for (j = s;j <= t;j++)
		 {
		 if (sz[j] == 0)
		 {
				  st++;
		 }
		 }
		 if (st == 0)
		 {
			 System.out.printf("%d %d",s - 1,t);
		 }
		 else
		 {
			 System.out.print("no");
		 }
				return 0;
	}

}

