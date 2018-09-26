package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int m;
	   int n;
	   int p;
	   int a;
	   int b;
	   int j;
	   j = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   m = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   n = Integer.parseInt(tempVar2);
	   }
	   int i;
	   int t;
	   int t0;
	   double k;
	   for (t = m;t <= n;t++)
	   {
		  k = Math.sqrt(t);
		  for (i = 2;i <= k;i++)
		  {
		   if (t % i == 0)
		   {
			break;
		   }
		  }
		   if (i > k)
		   {
			   t0 = t;
			  for (p = 0;t > 0;)
			  {
				 a = t / 10;
				  b = t - 10 * a;
				  t = a;
				  p = 10 * p + b;
			  }
			  if (p == t0)
			  {
			  j = j + 1;
				  if (j == 1)
				  {
				  System.out.printf("%d",t0);
				  }
				  else if (j >= 2)
				  {
			  System.out.printf(",%d",t0);
				  }
			  }
			  t = t0;
		   }

	   }

	 if (j == 0)
	 {
		 System.out.print("no");
	 }
	}

}

