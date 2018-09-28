package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int min;
	 int max;
	 int p = 0;
	 int s = 0;
	 double x;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 int[] a = new int[50000];
	 int[] b = new int[50000];
	 for (i = 0;i < n;i++)
	 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 (a[i]) = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 (b[i]) = Integer.parseInt(tempVar3);
		 }
	 }
	 min = a[0];
	 max = b[0];
	 for (i = 0;i < n - 1;i++)
	 {
		 if (min > a[i + 1])
		 {
			 min = a[i + 1];
		 }
		 if (max < b[i + 1])
		 {
			 max = b[i + 1];
		 }
	 }
	   for (x = 1.0 * min + 0.5;x < max;x++)
	   {
		   for (i = 0;i < n;i++)
		   {
			   if (x > a[i] && x < b[i])
			   {
				   p++;
			   }
		   }
		   if (p > 0)
		   {
			   s++;
		   }
		   p = 0;
	   }
	   if (s == max - min)
	   {
		   System.out.printf("%d %d",min,max);
	   }
	   else
	   {
		   System.out.print("no");
	   }
	return 0;
	}
}

