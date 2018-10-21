package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int n;
		int sum = 0;
		int max;
		int min;
	   int[] num = new int[300];
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
				  num[i] = Integer.parseInt(tempVar2);
			  }
			 sum += num[i];
	   }
	   max = num[0];
	   min = num[0];
	   for (i = 0;i < n;i++)
	   {
		   if (num[i] > max)
		   {
			   max = num[i];
		   }
		  if (num[i] < min)
		  {
			  min = num[i];
		  }
	   }
	   m = 2 * sum - n * (max + min);
	   if (n == 1)
	   {
		   System.out.printf("%d",num[0]);
	   }
	   if (m > 0)
	   {
		   System.out.printf("%d",min);
	   }
	   if (m == 0 && n != 1)
	   {
		   System.out.printf("%d,%d",min,max);
	   }
	   if (m < 0)
	   {
		   System.out.printf("%d",max);
	   }
	   return 0;
	}
}

