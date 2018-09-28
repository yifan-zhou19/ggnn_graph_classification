package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		double a;
		double b;
		double c;
		double d;
		double jiaodu;
		double hudu;
		double s;
		double square;
		double pingfang;
		double zhuanhuan = double;
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
			jiaodu = Double.parseDouble(tempVar5);
		}
		s = (a + b + c + d) / 2;
		pingfang = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(zhuanhuan(jiaodu)) * Math.cos(zhuanhuan(jiaodu));
		if (pingfang < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			square = Math.sqrt(pingfang);
			System.out.printf("%.4lf",square);
		}

	}

	public static double zhuanhuan(double jiaodu)
	{
		double e;
		e = PI * jiaodu / 360;
		return e;
	}
}

