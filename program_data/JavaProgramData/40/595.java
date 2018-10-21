package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		float a;
		float b;
		float c;
		float d;
		double S;
		double s;
		double o;
		double m;
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
			o = Double.parseDouble(tempVar5);
		}
		s = (a + b + c + d) / 2;
		m = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(o / 2 * DefineConstants.PI / 180) * Math.cos(o / 2 * DefineConstants.PI / 180);
		if (m < 0)
		{
			System.out.print("Invalid input\n");
		}
		else
		{
			S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(o / 2 * DefineConstants.PI / 180) * Math.cos(o / 2 * DefineConstants.PI / 180));
		System.out.printf("%.4lf\n",S);
		}


	}

}

final class DefineConstants
{
	public static final double PI = 3.1415927;
}

