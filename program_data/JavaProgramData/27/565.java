package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double a;
		double b;
		double c;
		double x1;
		double x2;
		double k;
		int i;
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
		k = b * b - 4 * a * c;
		if (k > 0)
		{
				 System.out.printf("x1=%.5f;x2=%.5f\n",(-b + Math.sqrt(k)) / (2 * a),(-b - Math.sqrt(k)) / (2 * a));
		}
		if (k == 0)
		{
				  System.out.printf("x1=x2=%.5f\n",(-b + Math.sqrt(k)) / (2 * a));
		}
		if (k < 0)
		{
			if (b == 0)
			{
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",0.0,Math.sqrt(-k) / (2 * a),0.0,Math.sqrt(-k) / (2 * a));
			}
			else
			{
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",(-b) / (2 * a),Math.sqrt(-k) / (2 * a),(-b) / (2 * a),Math.sqrt(-k) / (2 * a));
			}
		}
		}
		return 0;
	}

}

