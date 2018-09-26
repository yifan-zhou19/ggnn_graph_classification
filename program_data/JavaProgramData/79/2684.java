package <missing>;

public class GlobalMembers
{
	   public static int Main()
	   {
	   int k;
	   int n;
	   int x;
	   int i;
	   int s;
	   for (i = 1;1;i++)
	   {
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   k = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   n = Integer.parseInt(tempVar2);
	   }
	   if (k == 0 && n == 0)
	   {
		   break;
	   }
	   int[] a = new int[k];
	   for (i = 1;i <= k;i++)
	   {
		   a[i] = i;
	   }
	   s = k;
	   x = 0;
	   for (i = 0;s > 1;i++)
	   {
		   if (a[i % k + 1] != -1)
		   {
			   x++;
		   }
		   if (x == n && a[i % k + 1] != -1)
		   {
			   a[i % k + 1] = -1;
		   s--;
		   x = 0;
		   }
	   }
	   for (i = 1;i <= k;i++)
	   {
		   if (a[i] != -1)
		   {
			   System.out.printf("%d\n",i);
		   }
	   }
	   }
	   return 0;
	   }


}

