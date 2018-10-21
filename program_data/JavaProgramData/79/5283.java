package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
	   int[] a = new int[1000];


	 for (;;)
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
	   if (n == 0 && m == 0)
	   {
		   break;
	   }
	   else
	   {
		for (i = 1;i <= n;i++)
		{
			 a[i] = i;
		}
	   for (k = 1,i = 1;i <= n - 1;i++)
	   {
		   k = (k + m - 2) % (n + 1 - i) + 1;
		  for (j = k;j <= n - i;j++)
		  {
		  a[j] = a[j + 1];
		  }
	   }
	 System.out.printf("%d\n",a[1]);
	   }
	 }

	}

}

