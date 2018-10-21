package <missing>;

public class GlobalMembers
{
	public static double mianji(double a,double b,double c,double d,double s,double ww)
	{
		double www;
		double PI = 3.1415926;
		www = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(ww * PI / 360) * Math.cos(ww * PI / 360);
		if (www < 0)
		{

				 return (-1);
		}
		else
		{
		return (Math.sqrt(www));
		}
	}
	public static int Main()
	{
		  double a;
		  double b;
		  double c;
		  double d;
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
		  double s = (a + b + c + d) / 2;
		  double ww;
		  String tempVar5 = ConsoleInput.scanfRead();
		  if (tempVar5 != null)
		  {
			  ww = Double.parseDouble(tempVar5);
		  }
		  ww = ww;
		  double ss = -1;
		  ss = mianji(a, b, c, d, s, ww);
		  if (ss >= 0)
		  {
		  System.out.printf("%.4lf",ss);
		  }
		  else
		  {
		  System.out.print("Invalid input");
		  }
	}

}

