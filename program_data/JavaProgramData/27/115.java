package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
	float a;
	float b;
	float c;
	float d;
	double disc;
	double x1;
	double x2;
	double rpart;
	double ipart;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)

	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Float.parseFloat(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Float.parseFloat(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			c = Float.parseFloat(tempVar4);
		}
	disc = b * b - 4 * a * c;
	d = -b / (2 * a);
	if (Math.abs(disc) <= 1e-6)
	{
		System.out.printf("x1=x2=%.5lf\n",d);
	}
	else
	{
	if (disc > 1e-6)
	{
		x1 = (-b + Math.sqrt(disc)) / (2 * a);
	x2 = (-b - Math.sqrt(disc)) / (2 * a);
	System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
	}
	else
	{
		rpart = -b / (2 * a);
	ipart = Math.sqrt(-disc) / (2 * a);
	System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",rpart,ipart,rpart,ipart);
	}
	}
	}
	return 0;
	}

}

