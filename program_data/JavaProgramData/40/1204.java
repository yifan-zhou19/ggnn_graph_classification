package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float a;
		float b;
		float c;
		float d;
		float e;
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
			e = Float.parseFloat(tempVar5);
		}
		s = Math.sqrt(((a + b + c + d) / 2 - a) * ((a + b + c + d) / 2 - b) * ((a + b + c + d) / 2 - c) * ((a + b + c + d) / 2 - d) - a * b * c * d * Math.cos(e * 3.1415926 / 360) * Math.cos(e * 3.1415926 / 360));
		if (((a + b + c + d) / 2 - a) * ((a + b + c + d) / 2 - b) * ((a + b + c + d) / 2 - c) * ((a + b + c + d) / 2 - d) - a * b * c * d * Math.cos(e * 3.1415926 / 360) * Math.cos(e * 3.1415926 / 360) >= 0)
		{
		System.out.printf("%.4f",s);
		}
			if (((a + b + c + d) / 2 - a) * ((a + b + c + d) / 2 - b) * ((a + b + c + d) / 2 - c) * ((a + b + c + d) / 2 - d) - a * b * c * d * Math.cos(e * 3.1415926 / 360) * Math.cos(e * 3.1415926 / 360) < 0)
			{
				System.out.print("Invalid input");
			}
	return 0;
	}
}

