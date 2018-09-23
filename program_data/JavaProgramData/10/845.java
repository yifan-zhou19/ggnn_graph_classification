package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int k;
		  int i;
		  int t;
		  int m;
		  int[] a = new int[25];
		  int[] b = new int[25];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  k = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < k;i = i + 1)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i] = Integer.parseInt(tempVar2);
		  }
		  }
		  b[k - 1] = 1;
		  for (i = k - 2;i >= 0;i = i - 1)
		  {
		  for (t = 0,m = i + 1;m < k;m = m + 1)
		  {
		  if (a[i] >= a[m] != 0 && b[m] > t)
		  {
		  t = b[m];
		  }
		  }
		  b[i] = t + 1;
		  }
		  for (i = 0,t = 0;i < k;i = i + 1)
		  {
		  if (b[i] > t)
		  {
		  t = b[i];
		  }
		  }
		  System.out.printf("%d",t);

	}
}

