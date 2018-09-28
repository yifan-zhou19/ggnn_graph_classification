package <missing>;

public class GlobalMembers
{
	//struct
	public static int Main()
	{
		float a;
		float b;
		float c;
		float d;
		float e;
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
		double r;
		r = e / 360 * 3.1415926;
		float s;
		float S;
		s = (a + b + c + d) / 2;
		double w;
		w = Math.cos(r);
		if (((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * w * w) >= 0)
		{
			S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * w * w);
		System.out.printf("%.4f",S);
		}
		else
		{
		System.out.print("Invalid input");
		}

	}

}

