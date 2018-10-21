package <missing>;

public class GlobalMembers
{
	public static int su(int x2)
	{
	   int i;
	   int x;
	   x = x2 / 2;
	   for (i = 3 ; i < x ; i++)
	   {
		if (x2 % i == 0)
		{
		 return 0;
		}
	   }
	   return 1;
	}

	public static int Main()
	{
	   int n;
	   int i;
	   int f = 1;
	   int x1 = 3;
	   int x2 = 5;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (; x1 < n ; x1 = x2)
	   {
		for (x2 = x1 + 2 ; x2 <= n ; x2 += 2)
		{
		 if (su(x2) != 0)
		 {
		   if (x2 == x1 + 2)
		   {
				System.out.printf("%d %d\n", x1, x2);
				f = 0;
		   }
		   break;
		 }
		}
	   }
	   if (f != 0)
	   {
		System.out.print("empty");
	   }
	  // getchar (); getchar ();
	   return 0;
	}

}

