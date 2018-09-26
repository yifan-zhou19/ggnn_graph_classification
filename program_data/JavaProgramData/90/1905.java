package <missing>;

public class GlobalMembers
{
	public static int work(int m, int n)
	{
	   int sum;
	   if (n == 1)
	   {
		   return 1;
	   }
	   sum = work(m, n - 1);
	   if (m >= n)
	   {
		   sum += work(m - n, n);
	   }
	   return sum;
	}

	public static int Main()
	{
	   int t;
	   int m;
	   int n;
	   for (scanf("%d", t) ; t > 0 ; t--)
	   {
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 m = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 n = Integer.parseInt(tempVar2);
		 }
		 System.out.printf("%d\n", work(m, n));
	   }
	  // getchar (); getchar ();
	   return 0;
	}

}

