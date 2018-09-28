package <missing>;

public class GlobalMembers
{
	public static int qj(double a,double b,double c)
	{
		double x1;
		double x2;
		double e;
		double f;
		double g;
		double d;
		d = b * b - 4 * a * c;
		if (d > 0)
		{
		   e = (-b + Math.sqrt(d)) / (2 * a);
						f = (-b - Math.sqrt(d)) / (2 * a);
						if (e == 0)
						{
						e = 0;
						}
					   System.out.printf("x1=%.5f;x2=%.5f\n",e,f);
		}
			 else if (d == 0)
			 {
						   e = (-b) / (2 * a);
						   if (e == 0)
						   {
						e = 0;
						   }
						   System.out.printf("x1=x2=%.5f\n",e);
			 }
			  else
			  {
						   e = (-b) / (2 * a);
						   f = Math.sqrt(-d) / (2 * a);
						   if (e == 0)
						   {
						e = 0;
						   }
						   System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",e,f,e,f);
			  }
	}
	public static int Main()
	{
		double a;
		double b;
		double c;
		int n;
		int i;
		i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	   while (i < n)
	   {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			c = Double.parseDouble(tempVar4);
		}
		qj(a, b, c);
		i++;
	   }
	}

}

