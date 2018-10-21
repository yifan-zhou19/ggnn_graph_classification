package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int n;
	   int i;
	   int j;
	   int[] a = new int[300];
	   float sum = 0F;
	   float ave;
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
			  sum += a[i];
	   }
	   ave = sum / n;
	   for (i = n - 1;i > 0;i--)
	   {
			   for (j = 0;j < i;j++)
			   {
				   if (a[j] > a[j + 1])
				   {
					   int tem;
					   tem = a[j];
					   a[j] = a[j + 1];
					   a[j + 1] = tem;
				   }
			   }
	   }
	   if ((2 * ave - a[0] - a[n - 1]) > 0)
	   {
			  for (i = 0;i < n;i++)
			  {
				  if (a[i] == a[0])
				  {
					 if (a[i + 1] != a[0])
					 {
						 System.out.printf("%d",a[i]);
					 }
					 else
					 {
						 System.out.printf("%d,",a[i]);
					 }
				  }
			  }
	   }
	   if ((2 * ave - a[0] - a[n - 1]) <= 0)
	   {
			 for (i = 0;i < n;i++)
			 {
				  if ((a[i] == a[n - 1]) || (a[i] + a[n - 1]) == 2 * ave)
				  {
					 if (i == n - 1)
					 {
						 System.out.printf("%d",a[i]);
					 }
					 else
					 {
						 System.out.printf("%d,",a[i]);
					 }
				  }
			 }
	   }
	}
}

