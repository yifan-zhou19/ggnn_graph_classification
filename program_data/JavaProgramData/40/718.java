package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float a;
		float b;
		float c;
		float d;
		float s;
		double S;
		double m;
		double e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Float.parseFloat(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Float.parseFloat(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Float.parseFloat(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			d = Float.parseFloat(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			e = Double.parseDouble(tempVar5);
		}
		m = (e * 3.1415926) / (2 * 180);
		s = 0.5 * (a + b + c + d);
			 if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(m) * Math.cos(m) < 0)
			 {
			 System.out.print("Invalid input");
			 }
			 else
			 {
			  S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(m) * Math.cos(m));
			   System.out.printf("%.4lf", S);
			 }
		return 0;
	}

}

