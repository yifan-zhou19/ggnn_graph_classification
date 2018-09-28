package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	int n;
	int m;
	double a;
	double b;
	double c;
	double d;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	a = b = c = d = 0;
	for (i = 0;i < n;i++)
	{
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  m = Integer.parseInt(tempVar2);
	  }
	  if (m < 19)
	  {
		  a += 1;
	  }
	  else if (18 < m && m < 36)
	  {
		  b += 1;
	  }
	  else if (36 <= m != 0 && m <= 60)
	  {
		  c += 1;
	  }
	  else if (m >= 61)
	  {
		  d += 1;
	  }
	}
	a = 100 * a / n;
	b = 100 * b / n;
	c = 100 * c / n;
	d = 100 * d / n;
	System.out.print("1-18: ");
	System.out.printf("%.2lf%%\n",a);
	System.out.print("19-35: ");
	System.out.printf("%.2lf%%\n",b);
	System.out.print("36-60: ");
	System.out.printf("%.2lf%%\n",c);
	System.out.print("60??: ");
	System.out.printf("%.2lf%%\n",d);
	}
}

