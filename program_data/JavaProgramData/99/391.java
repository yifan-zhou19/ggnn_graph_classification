package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int i;
		 int n;
		 int a = 0;
		 int b = 0;
		 int c = 0;
		 int d = 0;
		int[] age = new int[100];
		double m;
		double o;
		double p;
		double q;
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
			age[i] = Integer.parseInt(tempVar2);
		}
	   if (age[i] <= 18 && age[i] >= 1)
	   {
		a = a + 1;
	   }
		else if (age[i] <= 35 && age[i] >= 19)
		{
		b = b + 1;
		}
	   else if (age[i] <= 60 && age[i] >= 36)
	   {
		c = c + 1;
	   }
	  else if (age[i] > 60)
	  {
		  d = d + 1;
	  }
		 }
	m = 1.0 * a / n * 100;
	o = 1.0 * b / n * 100;
	p = 1.0 * c / n * 100;
	q = 1.0 * d / n * 100;
	System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%",m,o,p,q);
	  return 0;
	}

}

