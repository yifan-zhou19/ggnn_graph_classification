package <missing>;

public class GlobalMembers
{
	public static float area(float a, float b, float c, float d, float s, float p)
	{
		p = (m * PI) / (2 * 180);
		s = (a + b + c + d) / 2;
	   if (((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(p) * Math.cos(p)) < 0)
	   {
	return -1F;
	   }
		S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(p) * Math.cos(p));
		return S;
	}
		public static float a;
		public static float b;
		public static float c;
		public static float d;
		public static float m;
		public static float r;
		public static float s;
		public static float p = 0F;
		public static float S;
	public static int Main()
	{
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
			m = Float.parseFloat(tempVar5);
		}
		S = area(a, b, c, d, s, p);
		if (S < 0F)
		{
			System.out.print("Invalid input\n");
		}
		else
		{
			System.out.printf("%.4f\n",S);
		}
		return 0;
	}

}

