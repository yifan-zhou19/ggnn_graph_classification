package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int n;
	   int[] a = new int[100];
	   int max1;
	   int max2;
	   int temp;
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
	   max1 = 0;
	   for (i = 1;i < n;i++)
	   {
		  if (a[max1] < a[i])
		  {
			 max1 = i;
		  }
	   }
	   temp = a[0];
	   a[0] = a[max1];
	   a[max1] = temp;
	   max2 = 1;
	   for (i = 2;i < n;i++)
	   {
		  if (a[max2] < a[i])
		  {
			 max2 = i;
		  }
	   }
	   temp = a[1];
	   a[1] = a[max2];
	   a[max2] = temp;
	   System.out.printf("\n%d",a[0]);
	   System.out.printf("\n%d",a[1]);
	}
}

