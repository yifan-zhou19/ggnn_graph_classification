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
		double t;
		double n;
		double m;
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
			t = Double.parseDouble(tempVar5);
		}
		e = (a + b + c + d) / 2;
		n = Math.sqrt((e - a) * (e - b) * (e - c) * (e - d) - a * b * c * d * Math.cos(t * PI / 360) * Math.cos(t * PI / 360));
		m = (e - a) * (e - b) * (e - c) * (e - d) - a * b * c * d * Math.cos(t * PI / 360) * Math.cos(t * PI / 360);
		if (m < 0)
		{
			System.out.print("Invalid input");
		}
		if (m >= 0)
		{
			System.out.printf("%.4lf",n);
		}
		return 0;
	}

}

