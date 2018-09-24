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
		float angle2;
		double S;
		double sum;
		double PI = 3.1415926;
		double angle;
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
		s = (a + b + c + d) / 2;
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			angle2 = Float.parseFloat(tempVar5);
		}
		angle = angle2 / 2 / 180 * PI;
		sum = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(angle) * Math.cos(angle);
		if (sum >= 0)
		{
			S = Math.sqrt(sum);
			System.out.printf("%.4f",S);
		}
		else
		{
			System.out.print("Invalid input");
		}

	}


}

