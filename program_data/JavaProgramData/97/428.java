package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int a;
	   int b;
	   int c;
	   int d;
	   int e;
	   int f;
	   int g;
	   int x;
	   int y;
	   int z;
	   int h;
	   int i;
	   int j;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a = Integer.parseInt(tempVar);
	   }
	   z = a % 100;
	   x = a - z;
	   b = x / 100;
	   y = z % 50;
	   x = z - y;
	   c = x / 50;
	   z = z - x;
	   x = z % 20;
	   y = z - x;
	   d = y / 20;
	   z = x % 10;
	   y = x - z;
	   e = y / 10;
	   y = z % 5;
	   x = z - y;
	   f = x / 5;
	   g = y;
	   System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",b,c,d,e,f,g);
	return 0;
	}
}

