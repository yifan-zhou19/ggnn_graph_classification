package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] k = new int[25];
		int[] a = new int[25];
	 int i;
	 int j;
	 int n;
	 int max;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
		  a[i] = 1;
	  }
	  for (i = 0;i <= n - 1;i++)
	  {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  k[i] = Integer.parseInt(tempVar2);
	  }
	  }
	  for (i = n - 2;i >= 0;i--)
	  {
	   for (j = i + 1;j <= n - 1;j++)
	   {
		if ((k[j] <= k[i]) && (a[i] <= a[j]))
		{
		 a[i] = a[j] + 1;
		}
	   }
	  }
	  for (max = 0,i = 0;i < n;i++)
	  {
		  if (a[i] >= max)
		  {
			  max = a[i];
		  }
	  }
		System.out.printf("%d",max);
	}



}

