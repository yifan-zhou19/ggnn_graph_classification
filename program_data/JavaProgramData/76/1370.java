package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sz = new int[50000];
		int[] d = new int[50000];
		int[] a = new int[50000];
		int[] b = new int[50000];
		int t = 0;
		int s = 0;
		int max;
		int min;
		double k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int e;
		int i;
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(d[i]) = Integer.parseInt(tempVar3);
			}
			a[i] = sz[i];
			b[i] = d[i];
		}
		for (i = 0;i < n - 1;i++)
		{
			if (a[i] < a[i + 1])
			{
				e = a[i + 1];
				a[i + 1] = a[i];
				a[i] = e;
			};
		}
		min = a[n - 1];
		 for (i = 0;i < n - 1;i++)
		 {
			if (b[i] > b[i + 1])
			{
				e = b[i + 1];
				b[i + 1] = b[i];
				b[i] = e;
			};
		 }
		max = b[n - 1];
		 for (k = min + 0.5;k <= max;k = k + 1)
		 {
			 t = 0;
			 for (i = 0;i < n;i++)
			 {
				 if (k > sz[i] && k < d[i])
				 {
					 t++;
				 }
			 }
			 if (t > 0)
			 {
				 s++;
			 }
		 }
	   if (s == max - min)
	   {
		   System.out.printf("%d %d",min,max);
	   }
		  else
		  {
			  System.out.print("no");
		  }
	   return 0;
	}





}

