package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int a;
	   int b;
	   int n;
	   int c;
	   int d;
	   int e;
	   int f;
	   d = 0;
	   e = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (a = 0;a < n;a += 1)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   b = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   c = Integer.parseInt(tempVar3);
		   }
		   if ((b >= 90) && (b <= 140) && (c >= 60) && (c <= 90))
		   {
				d += 1;
				if (d > e)
				{
				   e = d;
				}
		   }
		   else
		   {
				   d = 0;
		   }
	   }
	   System.out.printf("%d\n",e);
	   return 0;
	}
}

