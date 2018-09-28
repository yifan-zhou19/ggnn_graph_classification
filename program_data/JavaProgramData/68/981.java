package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] a = new int[50000];
	   int i;
	   int j;
	   int n;
	   int k;
	   int t = 2;
	   int m;
	   int[] c = new int[50000];
	   int p;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   a[0] = 2;
	   a[1] = 3;
	   c[2] = 1;
	   c[3] = 1;
	   for (i = 5;i < n;i = i + 2)
	   {
		  for (j = 0;a[j] <= Math.sqrt(i);j++)
		  {
			 if (i % a[j] == 0)
			 {
			   break;
			 }
		  }
		  if (a[j] > Math.sqrt(i))
		  {
			  a[t] = i;
			  c[a[t]] = 1;
			  t++;
		  }
	   }
	   for (i = 6;i <= n;i = i + 2)
	   {
		  for (j = 0;a[j] <= i / 2;j++)
		  {
				p = i - a[j];
				if (c[p] == 1)
				{
					System.out.printf("%d=%d+%d\n",i,a[j],i - a[j]);
					break;
				}
		  }
	   }
	   return 0;
	}
}

