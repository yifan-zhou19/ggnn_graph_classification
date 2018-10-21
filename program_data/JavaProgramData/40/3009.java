package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double x;
		double y;
		double z;
		double s;
		double sn;
		double S;
	 final String h = "Invalid input\0";
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = Double.parseDouble(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 b = Double.parseDouble(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead(" ");
	 if (tempVar3 != null)
	 {
		 c = Double.parseDouble(tempVar3);
	 }
	 String tempVar4 = ConsoleInput.scanfRead(" ");
	 if (tempVar4 != null)
	 {
		 d = Double.parseDouble(tempVar4);
	 }
	 String tempVar5 = ConsoleInput.scanfRead(" ");
	 if (tempVar5 != null)
	 {
		 x = Double.parseDouble(tempVar5);
	 }
	 s = (a + b + c + d) / 2;
	 y = x / 2 / 180 * PI;
	 z = Math.cos(y) * Math.cos(y);
	 sn = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * z;
	 if (sn < 0)
	 {
		  System.out.printf("%s",h);
	 }
	 else
	 {
		  S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * z);
	  System.out.printf("%6.4lf",S);
	 }
	}

}

