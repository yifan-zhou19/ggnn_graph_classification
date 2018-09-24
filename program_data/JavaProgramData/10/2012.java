package <missing>;

public class GlobalMembers
{
	public static int max(int[] t1, int[] t2, int m, int n, int d)
	{
		int i;
		int y = 0;
		for (i = m + 1;i < n;i++)
		{
		   if (t1[i] <= d != 0 && t2[i]> y)
		   {
		   y = t2[i];
		   }
		}
		return y;
	}
	public static int Main()
	{
		  int[] a = new int[10000];
		  int[] b = new int[10000];
		  int i;
		  int j;
		  int n;
		  int t;
		  int x = 0;
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
				  a[i] = Integer.parseInt(tempVar2);
			  }
		  }
		  b[n - 1] = 1;
		  for (i = n - 2;i >= 0;i--)
		  {
			  b[i] = max(a, b, i, n, a[i]) + 1;
		  }
		  for (i = 0;i < n - 1;i++)
		  {
			 if (b[i] > x)
			 {
			 x = b[i];
			 }
		  }
		System.out.printf("%d",x);

	}

}

