package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  double a;
	  double b;
	  double c;
	  double p;
	  double q;
	  double d;
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
		d = b * b - 4.0 * a * c;
		if (d >= 0)
		{
		  q = Math.sqrt(d) / (2.0 * a);
		  p = -b / (2.0 * a);
		  if (q - 0 >= 0.00001)
		  {
			  System.out.printf("x1=%.5f;x2=%.5f\n",p + q,p - q);
		  }
		  else
		  {
			if (p < 0.00001 && p>-0.00001)
			{
				System.out.print("x1=x2=0.00000\n");
			}
			else
			{
				System.out.printf("x1=x2=%.5f\n",p);
			}
		  }
		}
		else
		{
		  q = Math.sqrt(-d) / (2.0 * a);
		  p = -b / (2.0 * a);
		  if (p < 0.00001 && p>-0.00001)
		  {
			  System.out.printf("x1=0.00000+%.5fi;x2=0.00000-%.5fi\n",q,q);
		  }
		  else
		  {
			  System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",p,q,p,q);
		  }
		}
	  }
	}
}

