package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float a;
		float b;
		float c;
		float d;
		float k;
		float s;
		float x;
		int e;
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
			e = Integer.parseInt(tempVar5);
		}
		k = (float)e * pi / 180;
		k = k / 2;
		s = a + b + c + d;
		s = s / 2;
		x = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(k) * Math.cos(k);
		if (x < 0F)
		{
			System.out.print("Invalid input\n");
		}
		else
		{
			System.out.printf("%.4f\n",Math.sqrt(x));
		}
		return 0;
	}

}

