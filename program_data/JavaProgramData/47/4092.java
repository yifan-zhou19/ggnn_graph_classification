package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int[] a = new int[100];
	   int n;
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

	   for (i = n - 1;i >= 1;i--)
	   {
	   System.out.printf("%d ",a[i]);
	   }
	   for (i = 0;i >= 0;i--)
	   {
	   System.out.printf("%d",a[i]);
	   }

	   return 0;
	}


}

