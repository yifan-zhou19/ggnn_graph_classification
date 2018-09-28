package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int m = 0;
		int i = 0;
		int t = 0;
		int w = 0;
	   int[] a = new int[10000];
	   int[] b = new int[10000];
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
			  (a[i]) = Integer.parseInt(tempVar2);
		  }
	   }
	   for (i = 0;i < (n / 2);i++)
	   {
		   t = a[i];
		   a[i] = a[n - 1 - i];
		   a[n - 1 - i] = t;

	   }
		  for (i = 0;i < n - 1;i++)
		  {
		   System.out.printf("%d ",a[i]);
		  }
		   System.out.printf("%d",a[i]);

	return 0;

	}


}

