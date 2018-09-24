package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{

			double a;
			double b;
			double c;
			double d;
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
			d = b * b - 4 * a * c;
					   if (b == 0)
					   {
						   b = (-1) * b;
					   }
			if (d == 0)
			{
				System.out.printf("x1=x2=%.5lf\n",(-1) * b / (2 * a));
			}
			else if (d > 0)
			{
				System.out.printf("x1=%.5lf;x2=%.5lf\n",((-1) * b + Math.sqrt(d)) / (2 * a),((-1) * b - Math.sqrt(d)) / (2 * a));
			}
			else if (d < 0)
			{
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",(-1) * b / (2 * a),Math.sqrt((-1) * d) / (2 * a),(-1) * b / (2 * a),Math.sqrt((-1) * d) / (2 * a));
			}
		}

	}



}

