package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int n;
		double a;
		double b;
		double c;
		double p;
		double q;
		double x1;
		double x2;
		double s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
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

		s = b * b - 4 * a * c;
		if (s > 0)
		{
			x1 = (-b + Math.sqrt(s)) / (2 * a);
				x2 = (-b - Math.sqrt(s)) / (2 * a);
				System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
		}
		else if (s == 0)
		{
			x1 = -b / (2 * a);
			System.out.printf("x1=x2=%.5f\n",x1);
		}
		 else
		 {
			 if (b != 0)
			 {
			 double p = Math.sqrt(-s) / (2 * a);
			 double q = -b / (2 * a);
		  System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",q,p,q,p);
			 }
		  else
		  {
			double p = Math.sqrt(-s) / (2 * a);
			double q = 0.00000;
		  System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",q,p,q,p);
		  }

		 }
		}
	}

}

