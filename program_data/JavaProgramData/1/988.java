package <missing>;

public class GlobalMembers
{
	public static int sum;
	public static void f(int x,int min)
	{
		int p;
	  if (x == 1)
	  {
		  sum++;
	  }
		 else
		 {
			 for (p = min;p <= x;p++)
			 {
				   if (x % p == 0)
				   {
					   f(x / p, p);
				   }
			 }
		 }
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (i = 1;i <= n;i++)
	  {
			  sum = 0;
		   k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   for (j = 2;j <= k;j++)
		   {
				if (k % j == 0)
				{
					f(k / j, j);
				}
		   }
		   System.out.print(sum);
		   System.out.print("\n");
	  }
	 return 0;
	}

}

