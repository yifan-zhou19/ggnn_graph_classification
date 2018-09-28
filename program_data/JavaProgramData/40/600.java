package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float a;
		float b;
		float c;
		float d;
		float e;
		float S;
		float s;
		float g;
		float m;
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
			e = Float.parseFloat(tempVar5);
		}
		g = (float)e / 360 * 3.1415926;
		s = (float)1.0 / 2 * (a + b + c + d);
		m = (float)(s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(g) * Math.cos(g);
		if (m < 0F)
		{
			System.out.print("Invalid input");
		}
		else
		{
			S = (float)Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(g) * Math.cos(g));
		System.out.printf("%.4f",S);
		}
		return 0;
	}
}

