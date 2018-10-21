package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double a;
		double b;
		double c;
		double d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	  int[] sz = new int[n];
	  int j;
	  int r;
	   a = 0;
	   b = 0;
	   c = 0;
	   d = 0;
	  for (j = 0;j < n;j++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  sz[j] = Integer.parseInt(tempVar2);
		  }
		  if (sz[j] <= 18)
		  {
			  a = a + 1;
		  }
		  else
		  {
			  if (sz[j] <= 35)
			  {
				  b = b + 1;
			  }
			  else
			  {
				  if (sz[j] <= 60)
				  {
					  c = c + 1;
				  }
				  else
				  {
					  d = d + 1;
				  }
			  }
		  }
	  }
		  a = 100 * a / n;
		  System.out.printf("1-18: %.2lf%%\n",a);
		  b = 100 * b / n;
		  System.out.printf("19-35: %.2lf%%\n",b);
		  c = 100 * c / n;
		  System.out.printf("36-60: %.2lf%%\n",c);
		  d = 100 * d / n;
		  System.out.printf("Over60: %.2lf%%",d);
		  return 0;
	}





}

