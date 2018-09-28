package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	   int x;
	   int a;
	   int b;
	   int c;
	   int d;
	   int e;
	   int m = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   x = Integer.parseInt(tempVar);
	   }
	   a = x % 10;
	   m = 10 * m + a;
	   b = (x / 10) % 10;
	   m = 10 * m + b;
	   c = (x / 100) % 10;
	   m = 10 * m + c;
	   d = (x / 1000) % 10;
	   m = 10 * m + d;
	   e = (x / 10000) % 10;
	   m = 10 * m + e;
	   if (e == 0)
	   {
		   m = m / 10;
	   }
	   else
	   {
		   m = m;
	   }
	   if (e == 0,d == 0)
	   {
		   m = m / 10;
	   }
	   else
	   {
		   m = m;
	   }
	   if (e == 0,d == 0,c == 0)
	   {
		   m = m / 10;
	   }
	   else
	   {
		   m = m;
	   }
	   if (e == 0,d == 0,c == 0,b == 0)
	   {
		   m = m / 10;
	   }
	   else
	   {
		   m = m;
	   }
	   System.out.printf("%d",m);
	}

}

