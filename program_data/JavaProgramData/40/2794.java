package <missing>;

public class GlobalMembers
{
	public static float area(float a,float b,float c,float d,float angle)
	{
		float s;
		float e;
		s = (a + b + c + d) / 2;
		e = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(angle / 2 / 180 * 3.1415926) * Math.cos(angle / 2 / 180 * 3.1415926);
		if (e < 0F)
		{
			return -1F;
		}
		else
		{
			return Math.sqrt(e);
		}
	}

	public static int Main()
	{
		float a;
		float b;
		float c;
		float d;
		float angle;
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
			angle = Float.parseFloat(tempVar5);
		}
		if (area(a, b, c, d, angle) == -1F)
		{
			System.out.print("Invalid input");
		}
		else
		{
			System.out.printf("%.4f",area(a, b, c, d, angle));
		}
		return 0;
	}
}

