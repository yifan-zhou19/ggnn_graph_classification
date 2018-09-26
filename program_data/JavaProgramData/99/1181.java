package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int o = 0;
	int p = 0;
	int q = 0;
	int s = 0;
	int sum = 0;
	double a;
	double b;
	double c;
	double d;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] nl = new int[n];
	for (i = 0;i < n;i++)
	{
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  nl[i] = Integer.parseInt(tempVar2);
	  }
	}
	for (i = 0;i < n;i++)
	{
	  if ((nl[i]) >= 1 && (nl[i]) <= 18)
	  {
		   o++;
	  }
	  else if ((nl[i]) >= 19 && (nl[i]) <= 35)
	  {
		   p++;
	  }
	  else if ((nl[i]) >= 36 && (nl[i]) <= 60)
	  {
		   q++;
	  }
	  else
	  {
		   s++;
	  }
	}
	   sum = o + p + q + s;
	   a = (100.00 * o) / sum;
	   b = (100.00 * p) / sum;
	   c = (100.00 * q) / sum;
	   d = (100.00 * s) / sum;
	   System.out.printf("1-18: %.2lf%\n",a);
	   System.out.printf("19-35: %.2lf%\n",b);
	   System.out.printf("36-60: %.2lf%\n",c);
	   System.out.printf("Over60: %.2lf%\n",d);
	return 0;
	}
}

