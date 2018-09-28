package <missing>;

public class GlobalMembers
{
	public static float surface(float a, float b, float c, float d, float o)
	{
		float face;
		float s;
		s = (a + b + c + d) / 2;
		if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * (Math.cos(PI * o / 360)) * (Math.cos(PI * o / 360)) < 0)
		{
			return (-1);
		}
		else
		{
		face = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * (Math.cos(PI * o / 360)) * (Math.cos(PI * o / 360)));
		}
		return face;
	}
	public static void Main()
	{
		float a;
		float b;
		float c;
		float d;
		float o;
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
			o = Float.parseFloat(tempVar5);
		}
		if (surface(a, b, c, d, o) == -1F)
		{
			System.out.print("Invalid input");
		}
		else
		{
		System.out.printf("%.4f",surface(a, b, c, d, o));
		}
	}
}

