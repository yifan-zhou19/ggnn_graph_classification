package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int m;
	   int i;
	   int j;
	   int p = 0;
	   int[] a = new int[100];
	   int[] b = new int[100];
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
	   for (i = 0;i < n;i++)
	   {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   a[i] = Integer.parseInt(tempVar3);
		   }
	   }
	   for (i = 0;i < n;i++)
	   {
		   if (i + m < n)
		   {
			   b[i + m] = a[i];
		   }
		   if ((i + m) >= n)
		   {
			   b[p] = a[i];
			   p++;
		   }
	   }
	   for (j = 0;j < n - 1;j++)
	   {
		   System.out.printf("%d ",b[j]);
	   }
		   System.out.printf("%d",b[n - 1]);
		   return 0;
	}

}

