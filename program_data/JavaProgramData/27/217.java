package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double a;
		double b;
		double c;
		double disc;
		double x1;
		double x2;
		double realpart;
		double imagpart;
		for (i = 1;i <= n;i++)
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
		disc = b * b - 4 * a * c;
		if (Math.abs(disc) <= 1e-6)
		{
				  x1 = -b / (2 * a);
				  x2 = -b / (2 * a);
				  System.out.printf("x1=x2=%7.5f\n",x1);
		}
		else
		{
		if (disc > 1e-6)
		{
				   x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				   x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				   System.out.printf("x1=%7.5f;x2=%7.5f\n",x1,x2);
		}
		else
		{
			realpart = -b / (2 * a);
			imagpart = Math.sqrt(-disc) / (2 * a);
			if (realpart == 0)
			{
			System.out.printf("x1=0.00000+%7.5fi;x2=0.00000-%7.5fi\n",imagpart,imagpart);
			}
			else
			{
			System.out.printf("x1=%7.5f+%7.5fi;x2=%7.5f-%7.5fi\n",realpart,imagpart,realpart,imagpart);
			}
		}
		}
		}
		return 0;
	}
}

