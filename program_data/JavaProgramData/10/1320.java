package <missing>;

public class GlobalMembers
{
	public static int max(int x,int y)
	{
		if (x >= y)
		{
		return x;
		}
		else
		{
		return y;
		}
	}
	public static int Main()
	{
		  int i;
		  int j;
		  int k;
		  int m;
		  int n;
		  int res = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] a = new int[n];
		  for (i = 0;i < n;i++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i] = Integer.parseInt(tempVar2);
		  }
		  }
		  int[] b = new int[n];
		  int tem = 0;
		  for (i = 0;i < n;i++)
		  {
			  b[i] = 0;
		  }
		  b[n - 1] = 1;
		  for (i = n - 2;i >= 0;i--)
		  {
							 tem = 0;
							 for (j = n - 1;j > i;j--)
							 {
											   if (a[i] >= a[j])
											   {
											   tem = max(tem, b[j]);
											   }
											   else
											   {
											   continue;
											   }
							 }
							 b[i] = tem + 1;
		  }
		  for (i = 0;i < n;i++)
		  {
			  res = max(res, b[i]);
		  }
		  System.out.printf("%d",res);

	}

}

