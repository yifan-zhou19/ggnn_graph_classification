package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float[] a = new float[20];
		float[] b = new float[20];
		float[] c = new float[20];
		double x1;
		double x2;
		double p;
		double q;
		double m;
		int n;
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
				a[i] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Float.parseFloat(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c[i] = Float.parseFloat(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			double t;
			t = b[i] * b[i] - 4 * a[i] * c[i];
			if (t > 0)
			{
				if (c[i] == 0F)
				{
					x1 = 0;
				}
				else
				{
				x1 = (-b[i] + Math.sqrt(t)) / (2 * a[i]);
				}
				x2 = (-b[i] - Math.sqrt(t)) / (2 * a[i]);
				System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
			}
			else
			{
				if (t == 0)
				{
					if (b[i] == 0F)
					{
						m = 0;
					}
					else
					{
						m = -(b[i] / (2 * a[i]));
					}
					System.out.printf("x1=x2=%.5f\n",m);
				}
				else
				{
					if (b[i] == 0F)
					{
						p = -0.000000;
					}
					else
					{
						p = -b[i] / (2 * a[i]);
					}


					q = Math.sqrt(-t) / (2 * a[i]);
					System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",p,q,p,q);
				}
			}
		}
		return 0;
	}


}

