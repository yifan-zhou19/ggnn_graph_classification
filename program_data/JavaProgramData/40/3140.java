package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double e;
		double sum;
		double k;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Double.parseDouble(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b = Double.parseDouble(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		c = Double.parseDouble(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		d = Double.parseDouble(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		e = Double.parseDouble(tempVar5);
	}


	e /= 360;

	e *= 3.1415926;
	sum = (a + b + c + d) / 2;
	sum = ((sum - a) * (sum - b) * (sum - c) * (sum - d) - a * b * c * d * Math.cos(e) * Math.cos(e));
	if (sum < 0)
	{
		System.out.print("Invalid input");
	}
	else
	{
		sum = (a + b + c + d) / 2;
	sum = ((sum - a) * (sum - b) * (sum - c) * (sum - d) - a * b * c * d * Math.cos(e) * Math.cos(e));
	sum = Math.sqrt(sum);
	System.out.printf("%.4f\n",sum);
	}
	return 0;
	}
}

