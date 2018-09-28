package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		float a;
		float b;
		float c;
		float d;
		float x;
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
			x = Float.parseFloat(tempVar5);
		}
		float y;
		float z;
		y = x * PI / 360;
		z = (a + b + c + d) / 2;
		if (Math.sqrt((z - a) * (z - b) * (z - c) * (z - d) - a * b * c * d * Math.cos(y) * Math.cos(y)) >= 0)
		{
			s = Math.sqrt((z - a) * (z - b) * (z - c) * (z - d) - a * b * c * d * Math.cos(y) * Math.cos(y));
			System.out.printf("%.4f",s);
		}
		else
		{
			System.out.print("Invalid input\n");
		}
	}


}

