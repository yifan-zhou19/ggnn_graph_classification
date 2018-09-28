package <missing>;

public class GlobalMembers
{
	public static double mianji(double x,double y,double z,double m,double n)
	{
		double pan;
		double s;
		s = (x + y + z + m) / 2;
		pan = Math.sqrt((s - x) * (s - y) * (s - z) * (s - m) - x * y * z * m * Math.cos(n * pai / 180) * Math.cos(n * pai / 180));
		if (pan >= 0)
		{
			return pan;
		}
		else
		{
			return -1;
		}
	}
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double q;
		double mian;
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
			q = Double.parseDouble(tempVar5);
		}
		mian = mianji(a, b, c, d, q / 2);
		if (mian == -1)
		{
		System.out.print("Invalid input\n");
		}
		else
		{
			System.out.printf("%.4lf\n",mian);
		}
		return 0;
	}


}

