package <missing>;

public class GlobalMembers
{
	public static int shusu(int n)
	{
		int k;
	   k = (int)Math.sqrt(n);
	   int i;
	   int t;
	   if (n == 3)
	   {
	   return 0;
	   }
	   else
	   {
		  for (i = 3,t = 0;i <= k;i = i + 2)
		  {
	   if (n % i == 0)
	   {
	   t = t + 1;
	   }
		  }
	   return t;
	   }
	}
	public static int Main()
	{
		int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int i;
		  for (i = 3;i <= n / 2;i = i + 2)
		  {
			 if (shusu(i) == 0 && shusu(n - i) == 0)
			 {
		  System.out.printf("%d %d\n",i,n - i);
			 }
		  }

	}

}

