package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		double mianji = new double(double a,double b,double c,double d,double j);
	  double x;
	  double y;
	  double z;
	  double t;
	  double w;
	  double s;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 x = Double.parseDouble(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 y = Double.parseDouble(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 z = Double.parseDouble(tempVar3);
	 }
	 String tempVar4 = ConsoleInput.scanfRead();
	 if (tempVar4 != null)
	 {
		 t = Double.parseDouble(tempVar4);
	 }
	 String tempVar5 = ConsoleInput.scanfRead();
	 if (tempVar5 != null)
	 {
		 w = Double.parseDouble(tempVar5);
	 }
	 s = mianji(x, y, z, t, w);
	 if (s != -1)
	 {
	 System.out.printf("%.4lf\n",s);
	 }
	 else
	 {
	 System.out.print("Invalid input\n");
	 }

	}
	 public static double mianji(double a,double b,double c,double d,double j)
	 {
		 double S;
		 double s;
		 double s2;
	 double hudu;
	  hudu = j / 360 * 3.1415926;
	  S = (a + b + c + d) / 2;
	  s2 = (S - a) * (S - b) * (S - c) * (S - d) - a * b * c * d * Math.cos(hudu) * Math.cos(hudu);
	  if (s2 < 0)
	  {
	  s = -1;
	  }
	  else
	  {
	  s = Math.sqrt(s2);
	  }
	  return (s);
	 }

}

