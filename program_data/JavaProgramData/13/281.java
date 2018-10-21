package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] j = new int[101];
	   int[] a = new int[20000];
	   int[] b = new int[20000];
	   int i;
	   int n;
	   int x = 0;
	   int m = 0;
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
			   a[i] = Integer.parseInt(tempVar2);
		   }
	   }
	   for (i = 0;i < n;i++)
	   {
		   if (j[a[i]] == 0)
		   {
			 j[a[i]] = 1;
		  b[x] = a[i];
		  x++;
		   }
	   }
	   for (i = 0;i < x - 1;i++)
	   {
	   System.out.printf("%d ",b[i]);
	   }
	   System.out.printf("%d",b[i]);
	}
}

