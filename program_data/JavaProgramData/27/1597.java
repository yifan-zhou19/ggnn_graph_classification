package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		float[] x = new float[100];
		float[] y = new float[100];
		float[] z = new float[100];
			 double x1;
			 double x2;
			 double p;
			 double q;
			 double a;
			 double b;
			 double c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 1;j <= n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[j] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[j] = Float.parseFloat(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				z[j] = Float.parseFloat(tempVar4);
			}
		}
		for (j = 1;j <= n;j++)
		{
			a = x[j];
			b = y[j];
			c = z[j];
			if (b * b > 4 * a * c)
			{
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
			}
			else if (b * b == 4 * a * c)
			{
				x1 = -b / (2 * a);
				System.out.printf("x1=x2=%.5f\n",x1);
			}
			else
			{
				p = -b / (2 * a);
				q = Math.sqrt(4 * a * c - b * b);
				q = q / (2 * a);
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",p,q,p,q);
			}
		}

	}
}

