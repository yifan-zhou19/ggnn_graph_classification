package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int max;
	   int next;
	   int temp;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   int[] a = new int[100];
	   for (i = 0;i < n;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i] = Integer.parseInt(tempVar2);
		   }
	   }
	   if (a[0] > a[1])
	   {
			max = a[0];
		 next = a[1];
	   }
	   else if (a[1] > a[0])
	   {
		   max = a[1];
		next = a[0];
	   }
	   for (i = 2;i < n;i++)
	   {
		   if (a[i] > max)
		   {
			  temp = max;
		  next = temp;
		  max = a[i];
		   }
		 else if (a[i] < max && a[i]> next)
		 {
		  next = a[i];
		 }
	   }
		System.out.printf("%d\n%d",max,next);
		return 0;
	}
}

