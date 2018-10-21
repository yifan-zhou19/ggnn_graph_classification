package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int n;
	  int j;
	  int a = 0;
	  int b = 0;
	  int c = 0;
	  int d = 0;
	  double w;
	  double x;
	  double y;
	  double z;
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
			j = Integer.parseInt(tempVar2);
		}
		if (j <= 18)
		{
		  a++;
		}
		  else if (19 <= j != 0 && j <= 35)
		  {
		  b++;
		  }
		  else if (36 <= j != 0 && j <= 60)
		  {
		  c++;
		  }
		  else
		  {
			  d++;
		  }
	  }
		  w = (double)a / n * 100;
		  x = (double)b / n * 100;
		  y = (double)c / n * 100;
		  z = (double)d / n * 100;
		  System.out.printf("1-18: %.2lf%%\n",w);
		  System.out.printf("19-35: %.2lf%%\n",x);
		  System.out.printf("36-60: %.2lf%%\n",y);
		  System.out.printf("60??: %.2lf%%\n",z);
		  return 0;
	}


}

