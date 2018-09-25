package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int year;
	  int i;
	   double a;
	   double b;
	   double c;
	   double d;
		a = 0;
		b = 0;
		c = 0;
		d = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   year = Integer.parseInt(tempVar2);
	   }
	   if (year <= 18 && year >= 1)
	   {
		  a++;
	   }
	  if (year > 18 && year <= 35)
	  {
	   b++;
	  }
	   if (year > 35 && year <= 60)
	   {
	   c++;
	   }
		if (year > 60)
		{
		 d++;
		}
	  }
		 System.out.printf("1-18: %.2lf", a / n * 100);
		 System.out.print("%%\n");
		System.out.printf("19-35: %.2lf", b / n * 100);
		System.out.print("%%\n");
		System.out.printf("36-60: %.2lf", c / n * 100);
		System.out.print("%%\n");
		  System.out.printf("60??: %.2lf", d / n * 100);
		  System.out.print("%%\n");
		 return 0;
	}
}

