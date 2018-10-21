package <missing>;

public class GlobalMembers
{
	public static void s(float a,float b,float c,float d,float e)
	{
		float f;
		float g;
		float h;
		f = (a + b + c + d) / 2;
		g = (e / 360) * 3.1415926;
		if (((f - a) * (f - b) * (f - c) * (f - d) - a * b * c * d * Math.cos(g) * Math.cos(g)) > 0)
		{
			h = Math.sqrt((f - a) * (f - b) * (f - c) * (f - d) - a * b * c * d * Math.cos(g) * Math.cos(g));
			System.out.printf("%.4f\n",h);
		}
		if (((f - a) * (f - b) * (f - c) * (f - d) - a * b * c * d * Math.cos(g) * Math.cos(g)) <= 0)
		{
			System.out.print("Invalid input\n");
		}
	}
	public static void Main()
	{
		float S;
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
		String tempVar2 = ConsoleInput.scanfRead("\n");
		if (tempVar2 != null)
		{
			b = Float.parseFloat(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead("\n");
		if (tempVar3 != null)
		{
			c = Float.parseFloat(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead("\n");
		if (tempVar4 != null)
		{
			d = Float.parseFloat(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead("\n");
		if (tempVar5 != null)
		{
			e = Float.parseFloat(tempVar5);
		}
		s(a, b, c, d, e);
	}


}

