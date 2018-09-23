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
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = Integer.parseInt(tempVar);
	  }
	  if (a >= 10000)
	  {
		  b = a % 10;
		c = a % 100 - b;
		c = c / 10;
		d = a % 1000 - 10 * c - b;
		d = d / 100;
		e = a % 10000 - 10 * c - b - 100 * d;
		e = e / 1000;
		f = a - 10 * c - b - 100 * d - 1000 * e;
	  System.out.printf("%d%d%d%d%d",b,c,d,e,f);
	  }
	  else if (a >= 1000)
	  {
			  b = a % 10;
		c = a % 100 - b;
		c = c / 10;
		d = a % 1000 - 10 * c - b;
		d = d / 100;
		e = a - 10 * c - b - 100 * d;
		e = e / 1000;

	  System.out.printf("%d%d%d%d",b,c,d,e);
	  }
	  else if (a >= 100)
	  {
			  b = a % 10;
		c = a % 100 - b;
		c = c / 10;
		d = a - 10 * c - b;
		d = d / 100;


	  System.out.printf("%d%d%d",b,c,d);
	  }
	 else if (a >= 10)
	 {
			  b = a % 10;
		c = a % 100 - b;

		c = c / 10;
		d = d / 100;
		e = e / 100;
		f = f / 10000;

	  System.out.printf("%d%d",b,c);
	 }
	  else
	  {
	System.out.printf("%d",a);
	  }
	  return 0;
	}

}

