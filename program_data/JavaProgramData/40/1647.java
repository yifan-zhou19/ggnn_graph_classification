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
		float m;
		float n;
		float p;
		float q;
		float t;
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
		s = a + b + c + d;
		s = s / 2;
		m = s - a;
		n = s - b;
		p = s - c;
		q = s - d;
		t = m * n * p * q - a * b * c * d * (Math.cos(e * PI / 360.0)) * (Math.cos(e * PI / 360.0));
		if (t < 0F)
		{
		System.out.print("Invalid input");
		}
		else
		{
			t = Math.sqrt(t);
			System.out.printf("%.4f",t);
		}
		return 0;
	}

}

