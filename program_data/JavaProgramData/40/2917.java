package <missing>;

public class GlobalMembers
{
	public static float mianji(float a, float b, float c, float d, float e)
	{
		float s;
		float m;
		float q;
		float S;
		e = e / 360 * PI;
		s = (a + b + c + d) / 2;
		q = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(e) * Math.cos(e);
		if (q <= 0F)
		{
			return -1F;
		}
		else
		{
			S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(e) * Math.cos(e));
		}
		return S;

	}
	public static int Main()
	{
		float a;
		float b;
		float c;
		float d;
		float e;
		float f;
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
		f = mianji(a, b, c, d, e);
		if (f == -1F)
		{
			System.out.print("Invalid input");
		}
		else
		{
			System.out.printf("%.4f",f);
		}
		return 0;
	}

}

