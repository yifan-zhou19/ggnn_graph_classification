package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int a;
	   int b;
	   int m;
	   int k;
	   int l;
	   int i;
	   int j;
	   int c;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (a = 6;a <= n;a += 2)
	   {
		 b = a / 2;
		 c = 0;
		 for (m = 3;m <= b;m += 2)
		 {
		   k = Math.sqrt(m);
		   for (i = 2;i <= k;i++)
		   {
			  if (m % i == 0)
			  {
			  break;
			  }
		   }
		   if (i >= k + 1)
		   {
			 l = Math.sqrt(a - m);
			 for (j = 2;j <= l;j++)
			 {
			  if ((a - m) % j == 0)
			  {
			  break;
			  }
			 }
			  if (j >= l + 1)
			  {
			  System.out.printf("%d=%d+%d",a,m,a - m);
			  System.out.print("\n");
			  c = 1;
			  }
			  else
			  {
				  c = 0;
			  }
		   }
		   if (c == 1)
		   {
			   break;
		   }
		 }
	   }
		return 0;
	}


}

