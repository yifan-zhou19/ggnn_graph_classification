package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
	float a;
	float b;
	float c;
	float d;
	float s;
	float S;
	float J;
	float j;
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
		J = Float.parseFloat(tempVar5);
	}
	j = (float)(3.1415926 * J) / 360;
	s = (a + b + c + d) / 2;
	if (((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(j) * Math.cos(j)) > 1e-6)
	{
		S = (float)Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(j) * Math.cos(j));
	System.out.printf("%.4f",S);
	}
	else
	{
	System.out.print("Invalid input");
	}
	 }
}

