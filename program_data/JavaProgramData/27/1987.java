package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float a;
		float b;
		float c;
		float d;
		float p;
		float q;
		double x1;
		double x2;
		int i;
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;++i)
		{
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
			d = Math.sqrt(b * b - 4 * a * c);
			if (d > 0F)
			{
				x1 = (-b + d) / (2 * a);
				x2 = (-b - d) / (2 * a);
				System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
			}
			else if (d == 0F)
			{
				x1 = (-b + d) / (2 * a);
				System.out.printf("x1=x2=%.5f\n",x1);
			}
			else
			{
				d = Math.sqrt(4 * a * c - b * b);
				if (b == 0F)
				{
					x1 = b / (2 * a);
					x2 = b / (2 * a);
					p = d / (2 * a);
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",x1,p,x2,p);
				}
				else
				{
					x1 = (-b) / (2 * a);
					x2 = (-b) / (2 * a);
					p = d / (2 * a);
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",x1,p,x2,p);
				}

			}


		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			k = Integer.parseInt(tempVar5);
		}
			return (0);
	}
}

