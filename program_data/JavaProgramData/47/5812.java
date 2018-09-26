package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] a = new int[1000];
	   int n;
	   int i;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < n;i = i + 1)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i] = Integer.parseInt(tempVar2);
		   }
	   }
	   for (i = 0;i < n;i = i + 1)
	   {
		   if (i == 0)
		   {
		   System.out.printf("%d",a[n - 1]);
		   }
		   else
		   {
			   System.out.printf(" %d",a[n - 1 - i]);
		   }
	   }
	return 0;
	}


}

