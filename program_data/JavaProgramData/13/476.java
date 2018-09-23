package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int n;
	   int m;
	   int i;
	   int j;
	   int k;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   int[] a = new int[n];
	   int[] b = new int[n];
	   k = 0;
	   for (i = 0;i < n;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i] = Integer.parseInt(tempVar2);
		   }
	   }
	   for (i = n - 1;i > 0;i--)
	   {
		   m = 0;
		   for (j = i - 1;j >= 0;j--)
		   {
			   if (a[i] != a[j])
			   {
				   m = m + 1;
			   }
		   }
		   if (m == i)
		   {
			   b[k] = a[i];
			   k = k + 1;
		   }

	   }
	   b[k] = a[0];
	   for (i = k;i > 0;i--)
	   {
		   System.out.printf("%d ",b[i]);
	   }
	   System.out.printf("%d",b[0]);
	}


}

