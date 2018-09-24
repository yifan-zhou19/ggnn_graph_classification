package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  double n;
	  double x;
	  double y;
	  double a;
	  double b;
	  double m;
	  double p;
	  double q;
	  double h;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Double.parseDouble(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  x = Double.parseDouble(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  y = Double.parseDouble(tempVar3);
	  }
	  m = y / x;
	  int i = 2;
	  while (i <= n)
	  {
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			a = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			b = Double.parseDouble(tempVar5);
		}
		p = b / a;
		q = m - p;
		h = p - m;
		if (h > 0.05)
		{
		  System.out.print("better\n");
		}
		else if (q > 0.05)
		{
		  System.out.print("worse\n");
		}
		else
		{
		  System.out.print("same\n");
		}
		i++;
	  }
	  return 0;
	}

}

