package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int s;
	   int k;
	   int a;
	   int b;
	   int c;
	   int d;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   s = Integer.parseInt(tempVar);
	   }
	   a = (s - s % 1000) / 1000;
	   b = (s % 1000 - s % 100) / 100;
	   c = (s % 100 - s % 10) / 10;
	   d = s % 10;
	   k = d * 1000 + c * 100 + b * 10 + a;
	   if (a == 0)
	   {
		   if (b == 0)
		   {
			   if (c == 0)
			   {
				   System.out.printf("%d",d);
			   }
			   else
			   {
				   System.out.printf("%d%d",d,c);
			   }
		   }
		   else
		   {
			   System.out.printf("%d%d%d",d,c,b);
		   }
	   }
	   else
	   {
		   System.out.printf("%d%d%d%d",d,c,b,a);
	   }







	   return 0;

	}
}

