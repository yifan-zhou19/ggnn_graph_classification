package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int j = 0;
	   int t = 0;
	   int n;
	   int k;
	   int e;
	   int[] ss = new int[101];
	   int[] sz = new int[101];
	   int[] sz2 = new int[101];
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
			   ss[i] = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   sz[i] = Integer.parseInt(tempVar3);
		   }
	   }
	   for (i = 0;i < n - 1;i++)
	   {
		   if ((ss[i] >= 90) && (ss[i] <= 140) && (sz[i] >= 60) && (sz[i] <= 90))
		   {
			 j++;
		   }
		   else
		   {
			 sz2[t] = j;
			 t++;
			 j = 0;
		   }
	   }
	   if ((ss[n - 1] >= 90) && (ss[n - 1] <= 140) && (sz[n - 1] >= 60) && (sz[n - 1] <= 90))
	   {
		   j++;
		   sz2[t] = j;
	   }
	   else
	   {
		  sz2[t] = j;
	   }
	   for (k = 1;k < t + 1;k++)
	   {
		   for (i = 0;i < t + 1 - k;i++)
		   {
			   if (sz2[i] < sz2[i + 1])
			   {
				  e = sz2[i + 1];
				  sz2[i + 1] = sz2[i];
				  sz2[i] = e;


			   }
		   }
	   }
	  System.out.printf("%d",sz2[0]);

	return 0;
	}

}

