package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	double a;
	double b;
	double c;
	double d;
	double e;
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
	 d = b * b - 4 * a * c;
	 if (b == 0)
	 {
		 e = 0;
	 }
	 else
	 {
		 e = (-b) / (2 * a);
	 }
	if (d > 0)
	{
	  System.out.printf("x1=%.5lf;x2=%.5lf\n",e + Math.sqrt(d) / (2 * a),e - Math.sqrt(d) / (2 * a));
	}
	else if (d < 0)
	{
	  System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf%.5lfi\n",e,Math.sqrt(-d) / (2 * a),e,-Math.sqrt(-d) / (2 * a));
	}
	  else
	  {
		  System.out.printf("x1=x2=%.5lf\n",e);
	  }
	 }
	return 0;
	}
}

