package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float PI = 3.1415926F;
		float a;
		float b;
		float c;
		float d;
		float y;
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
			y = Float.parseFloat(tempVar5);
		}
		double x = y / 2.0;
		double s = (a + b + c + d) / 2;
		double ss = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(x * PI / 180) * Math.cos(x * PI / 180);
		if (ss < 0)
		{
			System.out.print("Invalid input\n");
		}
		else
		{
			double mianji = Math.sqrt(ss);
			System.out.printf("%.4f\n",mianji);
		}
		return 1;
	}


}

