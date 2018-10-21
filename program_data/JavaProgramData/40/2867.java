package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double jiao;
		int fanhui;
	  double mianji = new double(double aa,double bb,double cc,double dd,double jiaojiao);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = Double.parseDouble(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead("\n");
	  if (tempVar2 != null)
	  {
		  b = Double.parseDouble(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead("\n");
	  if (tempVar3 != null)
	  {
		  c = Double.parseDouble(tempVar3);
	  }
	  String tempVar4 = ConsoleInput.scanfRead("\n");
	  if (tempVar4 != null)
	  {
		  d = Double.parseDouble(tempVar4);
	  }
	  String tempVar5 = ConsoleInput.scanfRead("\n");
	  if (tempVar5 != null)
	  {
		  jiao = Double.parseDouble(tempVar5);
	  }
	  c = mianji(a, b, c, d, jiao);
	  if (c == 0)
	  {
		  System.out.print("Invalid input");
	  }
	  else
	  {
		  System.out.printf("%.4f",c);
	  }
	  System.in.read();
	  System.in.read();
	}
	public static double mianji(double aa,double bb,double cc,double dd,double jiaojiao)
	{
		double s;
		double ban;
		double panduan;
		double fanhui;
	  ban = (jiaojiao * 0.01745329) / 2.0000;
	  s = (aa + bb + cc + dd) / 2.0000;
	  panduan = (s - aa) * (s - bb) * (s - cc) * (s - dd) - aa * bb * cc * dd * Math.cos(ban) * Math.cos(ban);
	  if (panduan > 0)
	  {
		  fanhui = Math.sqrt(panduan);
	  }
	  else
	  {
		  fanhui = 0;
	  }
	  return fanhui;
	}
}

