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
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  a = n / 10000;
	  b = (n - a * 10000) / 1000;
	  c = (n - a * 10000 - b * 1000) / 100;
	  d = (n - a * 10000 - b * 1000 - c * 100) / 10;
	  e = n % 10;
	  if (a > 0)
	  {
		  System.out.print("00001");
	  }
	  else if (b > 0)
	  {
		  System.out.printf("%d%d%d%d",e,d,c,b);
	  }
	  else if (c > 0)
	  {
		  System.out.printf("%d%d%d",e,d,c);
	  }
	  else if (d > 0)
	  {
		  System.out.printf("%d%d",e,d);
	  }
	  else
	  {
		  System.out.printf("%d",e);
	  }
	  return 0;
	}
}

