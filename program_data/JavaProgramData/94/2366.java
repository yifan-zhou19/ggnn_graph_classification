package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int c;
		int k;
		int i = 0;
		int d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 (a[i]) = Integer.parseInt(tempVar2);
	 }
		}

	 for (k = 1;k <= n;k++)
	 {
	   for (i = 0;i < n - k;i++)
	   {
		   if (a[i] > a[i + 1])
		   {
			 c = a[i + 1];
			 a[i + 1] = a[i];
			 a[i] = c;
		   }
	   }
	 }
	 for (i = 0;i < n;i++)
	 {
	 if (a[i] % 2 == 1)
	 {
	 d = i;
	 }
	 }

	 for (i = 0;i < d;i++)
	 {
	 if (a[i] % 2 == 1)
	 {
	   System.out.printf("%d,",a[i]);
	 }
	 }
	   System.out.printf("%d",a[d]);
	  return 0;
	}

}

