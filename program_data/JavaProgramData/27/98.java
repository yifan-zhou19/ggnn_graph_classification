package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int d;
	 double a;
	 double b;
	 double c;
	 double p;
	 double x1;
	 double x2;
	 double o;
	 double q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	 for (d = 0;d < n;d++)
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
		 p = b * b - 4 * a * c;
		 o = Math.sqrt(-p) / (2 * a);
		 q = -b / (2 * a);
		 if (p < -ESSP)
		 {
			 System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf%.5lfi\n",q,o,q,-o);
		 }
		 else if (p > ESSP)
		 {
			 x1 = (-b + Math.sqrt(p)) / (2 * a);
			 x2 = (-b - Math.sqrt(p)) / (2 * a);
			 System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
		 }
		 else
		 {
			 x1 = -b / (2 * a);
			 System.out.printf("x1=x2=%.5lf\n",x1);
		 }
	 }
	}

}

