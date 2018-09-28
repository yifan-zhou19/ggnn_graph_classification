package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[50000];
		int[] d = new int[5134];
		int i;
		int j;
		int x;
		int n;
		for (i = 2;i <= 49999;i++)
		{
		if (a[i] == 0)
		{
		  x = Math.sqrt(i);
		  for (j = 2;j <= x;j++)
		  {
		   if (i % j == 0)
		   {
			   break;
		   }
		  }
		  if (j > x)
		  {
			  n = 2;
			  while (n * j <= 50000)
			  {
				  a[n * j] = 1;
				  n = n + 1;
			  }
		  }
		}
		}
		x = 0;
		for (i = 2;i <= 49999;i++)
		{
		 if (a[i] == 0)
		 {
		 x = x + 1;
		 d[x] = i;
		 }
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;)
		{
		   for (j = 1;j <= x;j++)
		   {
		   if (a[i - d[j]] == 0)
		   {
		   System.out.printf("%ld=%ld+%ld\n",i,d[j],i - d[j]);
		   break;
		   }
		   }
		 i = i + 2;
		}
	}

}

