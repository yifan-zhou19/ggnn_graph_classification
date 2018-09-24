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
		float K;
		double A;
		double B;
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
			K = Float.parseFloat(tempVar5);
		}
		s = (a + b + c + d) / 2;
		A = K * PI / 360;
		B = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.pow(Math.cos(A),2);
		if (B >= 0)
		{
			S = (B);
		System.out.printf("%.4f\n",Math.sqrt(S));
		}
		else
		{
			System.out.print("Invalid input\n");
		}
		return 0;
	}
}

