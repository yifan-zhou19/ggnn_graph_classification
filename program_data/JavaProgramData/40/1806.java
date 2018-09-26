package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 double a;
		 double b;
		 double c;
		 double d;
		 double s;
		 double S;
		 double p;
		 double t;
		 double k;
		 double r;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a = Double.parseDouble(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 b = Double.parseDouble(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 c = Double.parseDouble(tempVar3);
		 }
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 d = Double.parseDouble(tempVar4);
		 }
		 String tempVar5 = ConsoleInput.scanfRead();
		 if (tempVar5 != null)
		 {
			 r = Double.parseDouble(tempVar5);
		 }
		 k = r * PI / 360;
		 t = Math.cos(k);
		 p = Math.pow(t,2);
		 s = (a + b + c + d) / 2;
		 if (((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * p) < 0)
		 {
			 System.out.print("Invalid input");
		 }

		 else
		 {
			 S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * p);

		 System.out.printf("%.4lf\n",S);
		 }
		 return 0;
	}
}

