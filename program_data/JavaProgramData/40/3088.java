package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		float a;
		float b;
		float c;
		float d;
		float angle;
		float dangle;
		float p;
		float q;
		float outcome;
		float PI = 3.1415926F;
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
			angle = Float.parseFloat(tempVar5);
		}
		float s;
		s = (a + b + c + d) / 2;
		p = (s - a) * (s - b) * (s - c) * (s - d);
		dangle = (angle / 360) * PI;
		q = a * b * c * d * (Math.cos(dangle) * Math.cos(dangle));
		if (p - q > 0F)
		{
				outcome = Math.sqrt(p - q);
		System.out.printf("%.4f",outcome);
		}
		else
		{
			System.out.print("Invalid input");
		}
		return 0;
	}







}

