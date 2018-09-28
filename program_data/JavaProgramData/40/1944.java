package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float a;
		float b;
		float c;
		float d;
		float r;
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
			r = Float.parseFloat(tempVar5);
		}
		if (r < 0F || r>360F)
		{
			return 0;
		}
		else
		{
			s = (a + b + c + d) / 2;
			S = (float) Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(r * 3.1415926 / 360) * Math.cos(r * 3.1415926 / 360));
		}
		if (((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(r * 3.1415926 / 360) * Math.cos(r * 3.1415926 / 360)) < 0)
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

