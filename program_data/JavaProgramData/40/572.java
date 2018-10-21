package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		float a;
		float b;
		float c;
		float d;
		float alf;
		double halfa;
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
			alf = Float.parseFloat(tempVar5);
		}
		s = (a + b + c + d) / 2;
		halfa = p * alf / 360;
		double S;
		if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.pow(Math.cos(halfa),2) >= 0)
		{
			S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.pow(Math.cos(halfa),2));
		System.out.printf("%.4f",S);
		}
		else
		{
			System.out.print("Invalid input");
		}
	}

}

