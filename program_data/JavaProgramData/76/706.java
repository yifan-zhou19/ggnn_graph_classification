package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   int u;
	   int[] a = new int[100000];
	   int[] b = new int[100000];
	   int[] c = new int[100000];
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
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b[i] = Integer.parseInt(tempVar3);
		}
	   }
	   int max = 0;
	   int min;
	   for (i = 0;i < n;i++)
	   {
	   if (max < b[i])
	   {
		   max = b[i];
	   }
	   }
	   min = max;
	   for (i = 0;i < n;i++)
	   {
		if (min > a[i])
		{
			min = a[i];
		}
	   }
	   for (i = min;i <= max;i++)
	   {
		   c[i] = 0;
	   }
	   for (i = 0;i < n;i++)
	   {
		 for (j = a[i];j <= b[i] - 1;j++)
		 {
			 c[j] = 1;
		 }
	   }
		c[max] = 1;
		for (i = min;i <= max;i++)
		{
		  if (c[i] == 0)
		  {
			  u = 1;
		  }
		}
		 if (u == 1)
		 {
			 System.out.print("no");
		 }
		 else
		 {
			 System.out.printf("%d %d",min,max);
		 }
		 return 0;
	}
}

