package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  double n;
	  double i;
	  double a;
	  double b;
	  double c;
	  double d;
	  double e;
	  i = 1;
	  a = 0;
	  b = 0;
	  c = 0;
	  d = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Double.parseDouble(tempVar);
	  }
	  while (i <= n)
	  {
	  i = i + 1;
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  e = Double.parseDouble(tempVar2);
	  }
	  if (e <= 18)
	  {
	  a = a + 1;
	  }
	  else if (e <= 35)
	  {
	  b = b + 1;
	  }
	  else if (e <= 60)
	  {
	  c = c + 1;
	  }
	  else
	  {
	  d = d + 1;
	  }
	  }
	  a = 100 * a / n;
	  b = 100 * b / n;
	  c = 100 * c / n;
	  d = 100 * d / n;
	  System.out.printf("1-18: %.2lf",a);
	  System.out.print("%%\n");
	  System.out.printf("19-35: %.2lf",b);
	  System.out.print("%%\n");
	  System.out.printf("36-60: %.2lf",c);
	  System.out.print("%%\n");
	  System.out.printf("60??: %.2lf",d);
	  System.out.print("%%\n");
	  return 0;
	}
}

