package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (t = 0;t < n;t++)
		{
			float a;
			float b;
			float c;
			double p;
			double q;
			double k;
			double x1;
			double x2;
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
			if (b * b - 4 * a * c < 0F)
			{
				k = Math.sqrt(-b * b + 4 * a * c);
				p = -b / (2 * a);
				q = k / (2 * a);
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",p,q,p,q);
			}
			else
			{
				k = Math.sqrt(b * b - 4 * a * c);
				p = -b / (2 * a);
				q = k / (2 * a);
				x1 = p + q;
				x2 = p - q;
				if (q == 0.0)
				{
					System.out.printf("x1=x2=%.5f\n",p);
				}
				else
				{
					System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
				}
			}
		}
		return 0;
	}


}

