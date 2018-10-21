package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int t;
	   int e;
	   int max;
	   int smax;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (int i = 0;i < n;i++)
	   {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   t = Integer.parseInt(tempVar2);
	   }
	   if (i == 0)
	   {
	   max = t;
	   }
	   if (i == 1)
	   {
		   if (t >= max)
		   {

	   e = max;
	   max = t;
	   smax = e;
		   }
		   else
		   {
			   smax = t;
		   }
	   }
//C++ TO JAVA CONVERTER WARNING: The right shift operator was not replaced by Java's logical right shift operator since the left operand was not confirmed to be of an unsigned type, but you should review whether the logical right shift operator (>>>) is more appropriate:
	   if (i >> 1 != 0)
	   {
		   if (t >= max)
		   {
	   e = max;
	   max = t;
	   smax = e;
		   }
	   if (t >= smax != 0 && t < max)
	   {
		   smax = t;
	   }
	   }
	   }
	   System.out.printf("%d\n%d",max,smax);
	   return 0;
	}
}

