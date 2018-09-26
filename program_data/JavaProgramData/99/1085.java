package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int t;
	  int i;
	  double m;
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
	  for (i = 1;i <= n;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			t = Integer.parseInt(tempVar2);
		}
		if (t >= 1 && t <= 18)
		{
		a++;
		}
		else if (t >= 19 && t <= 35)
		{
		b++;
		}
		else if (t >= 36 && t <= 60)
		{
		c++;
		}
		else if (t >= 61)
		{
		d++;
		}
	  }
	  m = n;
	  a = 100 * a / m;
	  b = 100 * b / m;
	  c = 100 * c / m;
	  d = 100 * d / m;
	System.out.printf("1-18: %.2lf%%\n",a);
	System.out.printf("19-35: %.2lf%%\n",b);
	System.out.printf("36-60: %.2lf%%\n",c);
	System.out.printf("Over60: %.2lf%%\n",d);
	return 0;
	}

}

