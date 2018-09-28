package <missing>;

public class GlobalMembers
{
	public static double mj(float a,float b,float c,float d,float e)
	{

		double t;
		double s;
		double k;
		k = (double)3.1415926 * e / 360;
		s = (a + b + c + d) / 2;
		if (((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(k) * Math.cos(k)) < 0)
		{
			t = -1;
		}
		else
		{
		t = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(k) * Math.cos(k));
		}
		return (t);
	}
	public static void Main()
	{

		double f;
		float a;
		float b;
		float c;
		float d;
		float e;
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
		f = mj(a, b, c, d, e);
		if (f < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			System.out.printf("%.4f",f);
		}
	}

}

