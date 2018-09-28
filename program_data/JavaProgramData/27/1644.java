package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double x1 = 0;
		double x2 = 0;
		double a;
		double b;
		double c;
		double i;
		double j;
		double k;
		double d;
		double e;
		for (i = 1, j = 1, k = 1;i <= n, j <= n, k <= n;i++, j++, k++)
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
		 x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		 x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		 if (((x1) * (x2) >= 0) && ((x1) != (x2)))
		 {
		   System.out.printf("x1=%.5lf;x2=%.5lf\n", x1, x2);
		 }
		 else if (((x1) * (x2) >= 0) && ((x1) = (x2)) != 0)
		 {
			 System.out.printf("x1=x2=%.5lf\n", x1);
		 }
		 else
		 {
			 d = -(b / (2 * a));
			 e = Math.sqrt(4 * a * c - b * b) / (2 * a);
			 System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n", d, e, d, e);
		 }
		}
	}


}

