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
		float m;
		float n;
		float A;
		float e;
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
			A = Float.parseFloat(tempVar5);
		}
		s = (float)(a + b + c + d) / 2;
		n = (s - a) * (s - b) * (s - c) * (s - d);
		e = (float)A * 3.1415926 / 360;
		m = a * b * c * d * Math.cos(e) * Math.cos(e);
		if (n < 0F)
		{
			System.out.print("Invalid input\n");
		}
		else
		{
		S = Math.sqrt(n - m);

		System.out.printf("%.4f\n",S);
		}
		return 0;
	}
}

