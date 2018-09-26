package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int j;
		float[] a = new float[10];
		float[] b = new float[10];
		float[] c = new float[10];
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[j] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[j] = Float.parseFloat(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c[j] = Float.parseFloat(tempVar4);
			}
			double d;
			d = b[j] * b[j] - 4 * a[j] * c[j];
			if (d == 0)
			{
				double e;
				double f;
				e = (-b[j]) / (2 * a[j]);
				f = (Math.sqrt(d)) / (2 * a[j]);
				if (e == 0)
				{
				e = 0;
				}
				if (f == 0)
				{
				f = 0;
				}
				System.out.printf("x1=x2=%.5f\n",e);
			}
			else if (d > 0)
			{
				double e;
				double f;
				e = (-b[j]) / (2 * a[j]);
				f = (Math.sqrt(d)) / (2 * a[j]);
				if (e == 0)
				{
				e = 0;
				}
				if (f == 0)
				{
				f = 0;
				}
				System.out.printf("x1=%.5f;x2=%.5f\n",e + f,e - f);
			}
			else if (d < 0)
			{
				double e;
				double f;
				e = (-b[j]) / (2 * a[j]);
				f = (Math.sqrt(-d)) / (2 * a[j]);
				if (e == 0)
				{
				e = 0;
				}
				if (f == 0)
				{
				f = 0;
				}
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",e,f,e,f);
			}
		}
		return 0;
	}

}

