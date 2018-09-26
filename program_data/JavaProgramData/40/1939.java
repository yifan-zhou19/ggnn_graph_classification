package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	float a;
	float b;
	float c;
	float d;
	float e;
	float f;
	float g;
	float s;
	float S;
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
	s = (a + b + c + d) / 2;
	f = (float)(e * (PI / 180));
	g = (float)(Math.cos(f / 2));
	S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * g * g);
	if (((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * g * g) >= 0)
	{
	System.out.printf("%.4f",S);
	}
	else
	{
	System.out.print("Invalid input");
	}
		return 0;
	}

}

