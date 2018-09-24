package <missing>;

public class GlobalMembers
{
	public static void Main(void argc, String[] args)
	{
		double a;
		double b;
		double c;
		double d;
		double e;
		double s;
		double area;
		double temp;
		double angle;
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
			e = Double.parseDouble(tempVar5);
		}
		angle = pi * (e / 360);
		s = (a + b + c + d) / 2;
		temp = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(angle) * Math.cos(angle);
		if (temp < 0)
		{
		  System.out.print("Invalid input");
		}
		else
		{
			area = Math.sqrt(temp);
			System.out.printf("%.4f\n",area);
		}
	}
}

