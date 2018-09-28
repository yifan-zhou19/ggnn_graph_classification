package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int p;
		  int n;
		  double a;
		  double b;
		  double c;
		  double x1;
		  double x2;
		  double m;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (p = 1;p <= n;p++)
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
		  m = b * b - 4 * a * c;
		  if (m > 0)
		  {
				 x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				 x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				 System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
		  }
		  else if (m == 0)
		  {
				 x1 = -b / (2 * a);
				 System.out.printf("x1=x2=%.5f\n",x1);
		  }
		  else
		  {
			  if (-b / (2 * a) == -0.00000)
			  {
			  System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",b / (2 * a),Math.sqrt(-m) / (2 * a),b / (2 * a),Math.sqrt(-m) / (2 * a));
			  }
			  else
			  {
			  System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",-b / (2 * a),Math.sqrt(-m) / (2 * a),-b / (2 * a),Math.sqrt(-m) / (2 * a));
			  }
		  }
		  }
	}

}

