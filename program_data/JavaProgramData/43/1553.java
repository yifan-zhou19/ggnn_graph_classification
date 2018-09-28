package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int a;
		int b;
		int i;
		int k;
		int l;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	l = m / 2;
	for (a = 3;a <= l;a += 2)
	{
		  k = Math.sqrt(a);
	   for (i = 2;i <= k;i++)
	   {
		  if (a % i == 0)
		  {
			  break;
		  }
	   }
	   if (i >= k + 1)
	   {
			 b = m - a;
		 k = Math.sqrt(b);
	   for (i = 2;i <= k;i++)
	   {
		  if (b % i == 0)
		  {
			  break;
		  }
	   }
	   if (i >= k + 1)
	   {
		 System.out.printf("%d %d\n",a,b);
	   }
	   }
	}
	}
}

