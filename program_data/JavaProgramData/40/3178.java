package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float a;
		float b;
		float c;
		float d;
		float s;
		float S;
		float k;
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
			k = Float.parseFloat(tempVar5);
		}
		s = (a + b + c + d) / 2;
		S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(k * 3.1415926 / 360) * Math.cos(k * 3.1415926 / 360));
		if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(k * 3.1415926 / 720) * Math.cos(k * 3.1415926 / 720) >= 0)
		{
		System.out.printf("%.4f",S);
		}
		else
		{
		System.out.print("Invalid input");
		}
	}
}

