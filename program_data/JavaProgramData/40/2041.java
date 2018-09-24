package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float a;
		float b;
		float c;
		float d;
		float A;
		float B;
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
			B = Float.parseFloat(tempVar5);
		}
		float s;
		float S;
		A = (B / 180) * PI;
		s = (a + b + c + d) / 2;
		S = (float)Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(A / 2) * Math.cos(A / 2));
		if (((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(A / 2) * Math.cos(A / 2)) < 0)
		{
			System.out.print("Invalid input");
		}
		else if (((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(A / 2) * Math.cos(A / 2)) >= 0)
		{
			System.out.printf("%.4f",S);
		}
		return (0);
	}
















}

