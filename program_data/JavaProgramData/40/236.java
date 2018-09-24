package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double s = 1;
		double zzz;
		double area;
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
			zzz = Double.parseDouble(tempVar5);
		}
		zzz = zzz * PI / 360;
		s = 0.5 * (a + b + c + d);
		if (((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(zzz) * Math.cos(zzz)) < 0)
		{
			System.out.print("Invalid input");
			return 0;
		}
		area = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(zzz) * Math.cos(zzz));
		System.out.printf("%.4lf\n",area);


		return 0;
	}

}

