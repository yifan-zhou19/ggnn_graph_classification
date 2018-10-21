package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
	double a;
	double b;
	double c;
	double d;
	double x1;
	double x2;
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
				  a = Double.parseDouble(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  b = Double.parseDouble(tempVar3);
			  }
			  String tempVar4 = ConsoleInput.scanfRead();
			  if (tempVar4 != null)
			  {
				  c = Double.parseDouble(tempVar4);
			  }
		  d = -4 * a * c + b * b;
		  if (d > 0)
		  {
			  x1 = (-b + Math.sqrt(d)) / (2 * a);
		  x2 = (-b - Math.sqrt(d)) / (2 * a);
		  System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
		  }
		  else if (d == 0)
		  {
			  x1 = (-b + Math.sqrt(d)) / (2 * a);
		  System.out.printf("x1=x2=%.5lf\n",x1);
		  }
		  else
		  {
			  System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",(-b) / (2 * a), Math.sqrt(-d) / (2 * a),(-b) / (2 * a),Math.sqrt(-d) / (2 * a));
		  }
		  }
	}
}

