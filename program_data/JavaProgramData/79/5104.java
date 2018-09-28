package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int m;
		int[] a = new int[400];
		int[] b = new int[400];
	   n = 1;
	   for (;n != 0;)
	   {
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   m = Integer.parseInt(tempVar2);
	   }
	   if (n != 0)
	   {
	   for (i = 1;i <= n;i++)
	   {
		   a[i] = i;
	   }
	   k = m;
	   if (k > n && k % n != 0)
	   {
		   k = k % n;
	   }
	   if (k > n && k % n == 0)
	   {
		   k = n;
	   }

	   for (;n != 1;)
	   {
			 for (i = k;i < n;i++)
			 {
			a[i] = a[i + 1];
			 }

		 n = n - 1;
	  //  for (i=1;i<=n;i++) printf("%d",a[i]);
	  //   printf("end\n");
		 k = k + m - 1;
		 if (k > n && k % n != 0)
		 {
			 k = k % n;
		 }
		 if (k > n && k % n == 0)
		 {
			 k = n;
		 }


	 //    printf("%d %d\n",n,k);
	   }

	   System.out.printf("%d\n",a[1]);

	   }
	   }

		return 0;
	}

}

