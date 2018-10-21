package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float a;
		float b;
		float c;
		float d;
		float an;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Float.parseFloat(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead("\n ");
		if (tempVar2 != null)
		{
			b = Float.parseFloat(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead("\n ");
		if (tempVar3 != null)
		{
			c = Float.parseFloat(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead("\n ");
		if (tempVar4 != null)
		{
			d = Float.parseFloat(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead("\n ");
		if (tempVar5 != null)
		{
			an = Float.parseFloat(tempVar5);
		}
		float s;
		s = (a + b + c + d) / 2;
		float angel = an * 2 * 3.1415926 / 360;
		double S;
		S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * (Math.cos(angel / 2)) * (Math.cos(angel / 2)));
		if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * (Math.cos(angel / 2)) * (Math.cos(angel / 2)) < 0)
		{
				 System.out.print("Invalid input");
		}
		else
		{
			  System.out.printf("%.4lf",S);
		}
		return 0;
	}
}

