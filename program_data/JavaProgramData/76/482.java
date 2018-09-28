package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   int[] a = new int[50000];
	   int[] b = new int[50000];
	   int i;
	   for (i = 0;i < n;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i] = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   b[i] = Integer.parseInt(tempVar3);
		   }
	   }
	   int k;
	   int e;
	   for (k = 1;k <= n;k++)
	   {
		   for (i = 0;i < n - k;i++)
		   {
			   if (a[i] > a[i + 1])
			   {
				   e = a[i + 1];
				   a[i + 1] = a[i];
				   a[i] = e;
				   e = b[i + 1];
				   b[i + 1] = b[i];
				   b[i] = e;
			   }
		   }
	   }
	   int left;
	   int right;
	   left = a[0];
	   int m;
	   m = 0;
	   for (i = 0;i < n - 1;i++)
	   {
		 if (a[i + 1] <= b[i])
		 {
			 m++;
			 if (b[i] > b[i + 1])
			 {
				 b[i + 1] = b[i];
			 }
		 }
	   }
	   right = b[n - 1];
	   if (m == n - 1)
	   {
		   System.out.printf("%d %d", left,right);
	   }
	   else
	   {
		   System.out.print("no");

	   }
	   return 0;
	}
}

