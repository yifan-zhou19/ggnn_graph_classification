package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int a;
	  int b;
	  int c;
	  int d;
	  int x;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  x = Integer.parseInt(tempVar);
	  }
	  if (x == 0)
	  {
		  System.out.print("0");
	  }
	  else if (x <= 9)
	  {
		  System.out.printf("%d",x);
	  }
	  else if (x <= 99)
	  {
		  a = x % 10;
		  b = (x - a) / 10;
		  System.out.printf("%d%d",a,b);
	  }
	  else if (x <= 999)
	  {
		 a = x % 10;
		 b = ((x - a) % 100) / 10;
		 c = (x - 10 * b - a) / 100;
		 System.out.printf("%d%d%d",a,b,c);
	  }
	  else if (x <= 9999)
	  {
		a = x % 10;
		b = ((x - a) % 100) / 10;
		c = ((x - 10 * b - a) / 100) % 10;
		d = (x - 100 * c - 10 * b - a) / 1000;
		System.out.printf("%d%d%d%d",a,b,c,d);
	  }
	  else
	  {
		  System.out.print("00001");
	  }
	  System.out.print("\n");
	}
}

