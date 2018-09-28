package <missing>;

public class GlobalMembers
{
	public static void paixu(int[] a, int n)
	{
		 int i;
		 int j;
		 int maxj;
		 int temp;
		 for (i = 0;i < n - 1;i++)
		 {
			 maxj = i;
		   for (j = i + 1;j < n;j++)
		   {
			  maxj = a[j] > a[maxj]?j:maxj;
		   }
		   temp = a[i];
		   a[i] = a[maxj];
		   a[maxj] = temp;
		 }
	}
	public static int max(int x,int y)
	{
		return x > y != 0?x:y;
	}
	public static int Main()
	{
		  int k;
		  int n;
		  int i;
		  int j;
		  int[] t = new int[1000];
		  int[] q = new int[1000];
		  int[][] f = new int[1005][1005];
		  for (;;)
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
				 for (i = 0;i < n;i++)
				 {
				   String tempVar2 = ConsoleInput.scanfRead();
				   if (tempVar2 != null)
				   {
					   t[i] = Integer.parseInt(tempVar2);
				   }
				 }
				 for (i = 0;i < n;i++)
				 {
				   String tempVar3 = ConsoleInput.scanfRead();
				   if (tempVar3 != null)
				   {
					   q[i] = Integer.parseInt(tempVar3);
				   }
				 }
				 paixu(t, n);
				 paixu(q, n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				 memset(f,-5,(Integer.SIZE / Byte.SIZE));
				 f[0][0] = 0;
				 for (i = 0;i < n;i++)
				 {
				   for (j = 0;j <= i;j++)
				   {
					if (t[j] > q[i])
					{
						f[i + 1][j + 1] = max(f[i + 1][j + 1], f[i][j] + 200);
					}
				 else if (t[j] == q[i])
				 {
					 f[i + 1][j + 1] = max(f[i + 1][j + 1], f[i][j]);
					 f[i + 1][j] = max(f[i + 1][j], f[i][j] - 200);
				 }
				 else
				 {
					 f[i + 1][j] = max(f[i + 1][j], f[i][j] - 200);
				 }
				   }
				 }
				 k = f[n][0];
				 for (j = 1;j <= n;j++)
				 {
				   k = f[n][j] > k != 0?f[n][j]:k;
				 }
				 System.out.printf("%d\n",k);
		  }

		  return 0;
	}

}

