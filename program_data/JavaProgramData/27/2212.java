package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float[] a = new float[100];
		float[] b = new float[100];
		float[] c = new float[100];
		int n;
		int i;
		double k;
		double m;
		double p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
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
		for (i = 1;i <= n;i++)
		{
			k = (b[i] * b[i] - 4 * a[i] * c[i]);
			if (k == 0)
			{
				System.out.printf("x1=x2=%.5lf\n",(-b[i]) / (2 * a[i]));
			}
			if (k > 0)
			{
				System.out.printf("x1=%.5lf;x2=%.5lf\n",((-b[i]) + Math.sqrt(k)) / (2 * a[i]),((-b[i]) - Math.sqrt(k)) / (2 * a[i]));
			}
			if (k < 0)
			{
				m = (-b[i]) / (2 * a[i]);
				p = Math.sqrt((-k)) / (2 * a[i]);
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",m,p,m,p);
			}
		}
		return 0;

	}


}

