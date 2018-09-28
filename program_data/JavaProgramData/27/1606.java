package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int m;
		double a;
		double b;
		double c;
		double x1;
		double x2;
		double dt;
		double xubu;
		double shibu;
		for (m = 1;m < n + 1;m++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead("""");
			if (tempVar3 != null)
			{
				b = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead("""");
			if (tempVar4 != null)
			{
				c = Double.parseDouble(tempVar4);
			}
			dt = b * b - 4 * a * c;
			if (dt > 0)
			{
				x1 = (-b + Math.sqrt(dt)) / (a * 2);
								x2 = (-b - Math.sqrt(dt)) / (a * 2);
				System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
			}
			else if (dt == 0)
			{
				x1 = (-b) / (a * 2);
				System.out.printf("x1=x2=%.5lf\n",x1);
			}
			else if (dt < 0)
			{
				xubu = (Math.sqrt(-dt)) / (2 * a);
				shibu = (-b) / (a * 2);
								if (shibu == 0)
								{
				  System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",-shibu,xubu,-shibu,xubu);
								}
	else if (shibu == -0)
	{
		System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",-shibu,xubu,-shibu,xubu);
	}
	else
	{
	System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",shibu,xubu,shibu,xubu);
	}



			}
		}





	}


}

