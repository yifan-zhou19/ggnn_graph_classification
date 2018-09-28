package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int m;
	   int i;
	   int k;
	   int t;
	   int s = 0;
	   int p = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   m = Integer.parseInt(tempVar);
	   }
	   i = 3;
	   k = 1;
	   t = 1;
	   while (i <= m / 2)
	   {
		   while (k <= i)
		   {
			   if (i % k == 0)
			   {
				s = s + 1;
			   }
			   else
			   {
				   ;
			   }
			   k = k + 1;
		   }
		   if (s == 2)
		   {
			   while (t <= m - i)
			   {
				   if ((m - i) % t == 0)
				   {
				  p = p + 1;
				   }
				  else
				  {
					  ;
				  }
				  t = t + 1;
			   }
			   if (p == 2)
			   {
				   System.out.printf("%d %d\n",i,m - i);
			   }
			   else
			   {
				   ;
			   }
		   }
		   else
		   {
			   ;
		   }
		   s = 0;
		   p = 0;
		   t = 1;
		   k = 1;
		   i = i + 1;
	   }
	return 0;
	}
}

