package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			float a;
			float b;
			float c;
			float d;
		   double disc;
		   double x1;
		   double x2;
		   double realpart;
		   double imagpart;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Float.parseFloat(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Float.parseFloat(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			c = Float.parseFloat(tempVar4);
		}
		disc = b * b - 4 * a * c;
		if (Math.abs(disc) == 0)
		{
			System.out.printf("x1=x2=%.5f\n",-b / (2 * a));
		}
		else if (disc > 0)
		{
			x1 = (-b + Math.sqrt(disc)) / (2 * a);
		x2 = (-b - Math.sqrt(disc)) / (2 * a);
		System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
		}
		else
		{
			realpart = -b / (2 * a);
		imagpart = Math.sqrt(-disc) / (2 * a);
		System.out.printf("x1=%.5f+%.5fi;",realpart,imagpart);
		System.out.printf("x2=%.5f-%.5fi\n",realpart,imagpart);
		}
		}
		return 0;
	}


}

