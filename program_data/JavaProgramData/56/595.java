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
	  e = n - a * 10000 - b * 1000 - c * 100 - d * 10;

	  System.out.printf("%d",e);
	  if (d != 0)
	  {
		  System.out.printf("%d",d);
	  }
	  if (c != 0)
	  {
		  System.out.printf("%d",c);
	  }
	  if (b != 0)
	  {
		  System.out.printf("%d",b);
	  }
	  if (a != 0)
	  {
		  System.out.printf("%d",a);
	  }

	  return 0;

	}

}

