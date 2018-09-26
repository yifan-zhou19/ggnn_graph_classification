package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float a;
		float b;
		float c;
		float d;
		float m;
		float jd;
		float s;
		float S;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Float.parseFloat(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Float.parseFloat(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Float.parseFloat(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			d = Float.parseFloat(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			m = Float.parseFloat(tempVar5);
		}
		jd = m * PI / 360;
		s = (a + b + c + d) / 2;
		S = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(jd) * Math.cos(jd);
		if (S < 0F)
		{
			System.out.print("Invalid input");
		}
		else
		{
			System.out.printf("%.4f\n",Math.sqrt(S));
		}
		return 0;
	}
}

