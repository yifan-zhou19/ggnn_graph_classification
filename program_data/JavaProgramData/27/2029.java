package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int h = 1;
		double a;
		double b;
		double c;
		double e;
		double x1;
		double x2;
		double y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (h = 1;h <= n;h++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			c = Double.parseDouble(tempVar4);
		}
		y = b * b - 4 * a * c;
		if (y > 0)
		{
		x1 = (-b + Math.sqrt(y)) / (2 * a);
		x2 = (-b - Math.sqrt(y)) / (2 * a);
		if (c == 0)
		{
		System.out.printf("x1=0.00000;x2=%.5f\n",x2);
		}
		else
		{
		System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
		}
		}
		else
		{
		if (y == 0)
		{
		x1 = x2 = (-b) / (2 * a);
		System.out.printf("x1=x2=%.5f\n",x1);
		}
		else
		{
		e = (Math.sqrt(-y)) / (2 * a);
		if (b == 0)
		{
		System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",0.00000,e,0.00000,e);
		}
		else
		{
		System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",(-b) / (2 * a),e,(-b) / (2 * a),e);
		}
		}
		}
		}
		System.in.read();
		System.in.read();
		System.in.read();
	}
}

