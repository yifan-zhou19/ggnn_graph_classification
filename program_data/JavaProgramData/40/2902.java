package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		float a;
		float b;
		float c;
		float d;
		float s;
		float m;
		double e;
		double f;
		double g;
		double h;
		double i;
		double j;
		double k;
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
			m = Float.parseFloat(tempVar5);
		}
		s = (a + b + c + d) / 2;
		e = (s - a) * (s - b) * (s - c) * (s - d);
		k = m * 3.1415926 / 180;
		f = Math.cos(k);
		g = (f + 1) / 2;
		h = a * b * c * d * g;
		i = e - h;
		if (i < 0)
		{
			System.out.print("Invalid input\n");
		}
		else
		{
			j = Math.sqrt(i);
			System.out.printf("%.4f\n",j);
		}
	}
}

