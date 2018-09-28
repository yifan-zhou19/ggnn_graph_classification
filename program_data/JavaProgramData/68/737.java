package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int a;
		int b;
		int j;
		int k;
		int i;
		int t;
		int s;
		int q = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		 for (i = 6;i <= n;i = i + 2)
		 {
		   System.out.printf("%ld=",i);
		   for (a = 3;a <= (i / 2);a = a + 2)
		   {
			   t = Math.sqrt(a);
			   b = i - a;
			   s = Math.sqrt(b);
			   q = 0;
				 for (j = 3;j <= t;j = j + 2)
				 {
				  if (a % j == 0)
				  {
				  q = 1;
				  }
				 }
			  for (k = 3;k <= s;k = k + 2)
			  {
				  if (b % k == 0)
				  {
				  q = 1;
				  }
			  }
			  if (q == 0)
			  {
				  System.out.printf("%ld+%ld",a,b);
			  break;
			  }
		   }
		System.out.print("\n");
		 }
	}

}

