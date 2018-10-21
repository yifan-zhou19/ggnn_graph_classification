package <missing>;

public class GlobalMembers
{
	  public static int Main()
	  {
		  int n;
		  int m;
		  int a = 0;
		  int b = 0;
		  int c = 0;
		  int d = 0;
		  int i = 1;
		  double e;
		  double f;
		  double g;
		  double h;
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
			m = Integer.parseInt(tempVar2);
		}
		if (m > 0 && m <= 18)
		{
				  a += 1;
		}
			  else if (m > 18 && m <= 35)
			  {
			  b += 1;
			  }
				  else if (m > 35 && m <= 60)
				  {
					  c += 1;
				  }
				  else if (m > 60)
				  {
					  d += 1;
				  }
		  }
		  System.out.printf("1-18: %.2lf%%\n",e = 100.00 * a / n);
		  System.out.printf("19-35: %.2lf%%\n",f = 100.00 * b / n);
		  System.out.printf("36-60: %.2lf%%\n",g = 100.00 * c / n);
		  System.out.printf("60??: %.2lf%%\n",h = 100.00 * d / n);
		  return 0;
	  }
}

