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
	   int[] a = new int[20];
	   int i;
	   int m;
	   for (i = 0;i < n;i++)
	   {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a[i] = Integer.parseInt(tempVar2);
			 }
	   }
	   int[] sz = new int[20];
	   for (i = 0;i < 20;i++)
	   {
			 if (i == 0)
			 {
				 sz[i] = 1;
			 }
			 else if (i == 1)
			 {
				 sz[i] = 1;
			 }
			 else
			 {
				 sz[i] = sz[i - 1] + sz[i - 2];
			 }
	   }
	   for (i = 0;i < n;i++)
	   {
			 if (i == n - 1)
			 {
				 m = a[i];
				 System.out.printf("%d",sz[m - 1]);
				 m = 0;
			 }
			 else
			 {
				 m = a[i];
				 System.out.printf("%d\n",sz[m - 1]);
				 m = 0;
			 }
	   }
		return 0;
	}

}

