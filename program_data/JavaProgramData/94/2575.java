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
	   int[] sz = new int[n];
	   for (int i = 0;i < n;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   (sz[i]) = Integer.parseInt(tempVar2);
		   }
	   }
	   int[] js = new int[n];
	   int i;
	   int m;
	   for (m = 0,i = 0;i < n;i++)
	   {
		   if (sz[i] % 2 != 0)
		   {
			   js[m] = sz[i];
			   m++;
		   }
	   }
	   int e;
	   for (int k = 1;k <= m;k++)
	   {
		   for (i = 0;i < m - k;i++)
		   {
			   if (js[i] > js[i + 1])
			   {
				   e = js[i];
				   js[i] = js[i + 1];
				   js[i + 1] = e;
			   }
		   }
	   }
	   System.out.printf("%d",js[0]);
	   for (i = 1;i < m;i++)
	   {
		   System.out.printf(",%d",js[i]);
	   }
	   return 0;
	}

}

