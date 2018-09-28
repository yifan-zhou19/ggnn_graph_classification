package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float a;
		float b;
		float c;
		float d;
		float aef;
		float bt;
		float S;
		float s;
		float m;
		float x;
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
			aef = Float.parseFloat(tempVar5);
		}
		s = (a + b + c + d) / 2;
		bt = aef / 180 * 3.1415926 / 2;
		m = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(bt) * Math.cos(bt);
		if (m > 0F)
		{
			S = Math.sqrt(m);
			System.out.printf("%.4f",S);
		}
		else
		{
			System.out.print("Invalid input");
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			x = Float.parseFloat(tempVar6);
		}
		return 0;
	}

}

