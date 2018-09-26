package <missing>;

public class GlobalMembers
{
	public static float s(float a, float b, float c, float d, float alpha)
	{
	float S;
	float s;
	float n;
	float r;
	s = (a + b + c + d) / 2;
	r = alpha / 2 / 360 * 3.1415926 * 2;
	n = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(r) * Math.cos(r);
	if (n < 0F)
	{
	return 0F;
	}
	else
	{
		S = Math.sqrt(n);
	return S;
	}
	}

	public static void Main()
	{
	float a;
	float b;
	float c;
	float d;
	float alpha;
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
		alpha = Float.parseFloat(tempVar5);
	}
	if (s(a, b, c, d, alpha) == 0F)
	{
	System.out.print("Invalid input");
	}
	else
	{
	System.out.printf("%.4f", s(a, b, c, d, alpha));
	}
	}
}

