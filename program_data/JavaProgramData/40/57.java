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
			k = Float.parseFloat(tempVar5);
		}
		s = 1.000 / 2.000 * (a + b + c + d);

		if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(k / 360.0 * 3.1415926) * Math.cos(k / 360.0 * 3.1415926) < 0)
		{
		System.out.print("Invalid input");
		}
		else
		{
			System.out.printf("%.4f",Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(k / 360.0 * 3.1415926) * Math.cos(k / 360.0 * 3.1415926)));
		}


		return 0;
	}

}

