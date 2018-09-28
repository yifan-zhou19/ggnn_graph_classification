package <missing>;

public class GlobalMembers
{
	public static float s2(float a, float b, float c, float d, float anglesum)
	{
		float s2;
		float s;
		s = (a + b + c + d) / 2;
		s2 = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(anglesum * PI / 360) * Math.cos(anglesum * PI / 360);
		return s2;
	}

	public static void Main(String[] args)
	{
		float a;
		float b;
		float c;
		float d;
		float anglesum;
		float s;
		float S;
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
			anglesum = Float.parseFloat(tempVar5);
		}
		s = s2(a, b, c, d, anglesum);
		if (s < 0F)
		{
			System.out.print("Invalid input\n");
		}
		else
		{
			S = Math.sqrt(s);
			System.out.printf("%.4lf",S);
		}
	}
}

