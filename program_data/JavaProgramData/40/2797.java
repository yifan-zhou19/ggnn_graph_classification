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
	float fanhuizhi;
	float function = new float(float a,float b,float c, float d, float angle);
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
		angle = Float.parseFloat(tempVar5);
	}
	fanhuizhi = function(a, b, c, d, angle);
	if (fanhuizhi == -1F)
	{
		System.out.print("Invalid input");
	}
	else
	{
	System.out.printf("%.4f",fanhuizhi);
	}
	return 0;
	}

	public static float function(float a,float b,float c, float d, float angle)
	{
	float s;
	float genhao;
	double fanhuizhi;
	double ANGLE;
	ANGLE = angle / 360 * 3.1415926;
	s = (a + b + c + d) / 2;
	genhao = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(ANGLE) * Math.cos(ANGLE);
	if (genhao < 0F)
	{
		fanhuizhi = -1;
	}
	else
	{
	fanhuizhi = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(ANGLE) * Math.cos(ANGLE));
	}
	return fanhuizhi;
	}

}

