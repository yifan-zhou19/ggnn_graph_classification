package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int prime = int;
	 int m;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 int a;
	 int b;
	 for (a = 3;a <= m / 2;a = a + 2)
	 {
	  if (prime(a) != 0)
	  {
	   b = m - a;
	   if (prime(b) != 0)
	   {
		System.out.printf("%d %d\n",a,b);
	   }
	  }
	 }

	 return 0;
	}

	public static int prime(int n)
	{
	 int i;
	 int k = Math.sqrt(n);
	 for (i = 2;i <= k;i++)
	 {
	  if (n % i == 0)
	  {
		  break;
	  }
	 }
	 if (i > k)
	 {
		 return 1;
	 }
	 else
	 {
		 return 0;
	 }
	}
}

