package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int m;
	 int n;
	 int i;
	 int j;
	 int x;
	 int y;
	 int p;
	 int q;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 n = m / 2;
	 i = 3;
	 while (i <= n)
	 {
	  x = Math.sqrt(i);
	  for (p = 3;p <= x;p++)
	  {
	   if (i % p == 0)
	   {
		   break;
	   }
	  }
	  if (p >= x + 1)
	  {
		  j = m - i;
		y = Math.sqrt(j);
		for (q = 3;q <= y;q++)
		{
		 if (j % q == 0)
		 {
			 break;
		 }
		}
		if (q >= y + 1)
		{
		System.out.printf("\n%d %d\n",i,j);
		}
	  }
		i += 2;
	 }
	   return 0;
	}
}

