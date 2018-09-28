package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int g;
	  String tempVar = ConsoleInput.scanfRead("\n");
	  if (tempVar != null)
	  {
		  g = Integer.parseInt(tempVar);
	  }
	  e = g / 10000;
	  d = g / 1000 - 10 * e;
	  c = g / 100 - 10 * (g / 1000);
	  b = g / 10 - 10 * (g / 100);
	  a = g - 10 * (g / 10);
	  if (g >= 10000)
	  {
		  System.out.printf("%d%d%d%d%d",a,b,c,d,e);
	  }
	  else if (g < 10000 && g >= 1000)
	  {
		  System.out.printf("%d%d%d%d",a,b,c,d);
	  }
	  else if (g < 1000 && g >= 100)
	  {
		  System.out.printf("%d%d%d",a,b,c);
	  }
	  else if (g < 100 && g >= 10)
	  {
		  System.out.printf("%d%d",a,b);
	  }
	  else
	  {
		  System.out.printf("%d",a);
	  }

	}

}

