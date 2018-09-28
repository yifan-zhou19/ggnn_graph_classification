package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  double a;
	  double b;
	  double c;
	  double s;
	  double x1;
	  double x2;
	  int n;
	  int i;
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
		  a = Double.parseDouble(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  b = Double.parseDouble(tempVar3);
	  }
	  String tempVar4 = ConsoleInput.scanfRead(" ");
	  if (tempVar4 != null)
	  {
		  c = Double.parseDouble(tempVar4);
	  }
	  s = b * b - 4 * a * c;
	  if (s > 0)
	  {
		  System.out.printf("x1=%.5f;x2=%.5f\n",(-b + Math.sqrt(s)) / (2 * a) + 0,(-b - Math.sqrt(s)) / (2 * a) + 0);
	  }
	  else if (s == 0)
	  {
		  System.out.printf("x1=x2=%.5f\n",-b / (2 * a) + 0);
	  }
	  else
	  {
		  System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",-b / (2 * a) + 0,Math.sqrt(-s) / (2 * a) + 0,-b / (2 * a) + 0,Math.sqrt(-s) / (2 * a) + 0);
	  }
	  }

	}

}

