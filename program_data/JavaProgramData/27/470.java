package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double t = 0.00001;
		float a;
		float b;
		float c;
		double x1;
		double x2;
		double j;
		double w;
		double delta;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			a = b = c = 0F;
			delta = 0;
			x1 = x2 = 0;
			j = w = 0;
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
			delta = b * b - 4 * a * c;
			if (Math.abs(delta) < t)
			{
				x1 = - b / (2 * a);
				System.out.printf("x1=x2=%.5f\n",x1);
			}
			else if (delta > 0)
			{
				x1 = (-b + Math.sqrt(delta)) / (2 * a);
				x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
			}
			else
			{
				w = -b / (2 * a);
				if (w < t && w > -t)
				{
					w = 0;
				}
				j = Math.sqrt(-delta) / (2 * a);
				if (j > 0)
				{
					System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",w,j,w,j);
				}
				else
				{
					j = -j;
					System.out.printf("x1=%.5f-%.5fi;x2=%.5f+%.5fi\n",w,j,w,j);
				}
			}
		}
		return 0;
	}
}

