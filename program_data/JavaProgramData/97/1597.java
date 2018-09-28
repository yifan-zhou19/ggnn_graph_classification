package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int a;
	   int b;
	   int c;
	   int d;
	   int e;
	   int f;
	   int l;
	   int m;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   a = n / 100;
	   l = n / 10 % 10;
	   b = l / 5;
	   c = l % 5 / 2;
	   d = (l % 5) % 2;
	   m = n % 10;
	   e = m / 5;
	   f = m % 5;
	   System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",a,b,c,d,e,f);
	   return 0;
	}
}

