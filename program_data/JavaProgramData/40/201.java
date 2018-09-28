package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		double a; //e??????
		double b;
		double c;
		double d;
		double e;
		double s;
		double t;
		double S;
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
			 s = 1.0 / 2 * (a + b + c + d);
		t = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(e * PI * 1 / 2 / 180) * Math.cos(e * PI * 1 / 2 / 180); //(e*PI*1/2/180)???????????2
		if (t < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			S = Math.sqrt(t);
			System.out.printf("%.4f",S);
		}
	}

}

