package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];
		double det;
		double t;
		double x;
		double y;
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
				a[i - 1] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i - 1] = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c[i - 1] = Double.parseDouble(tempVar4);
			}
		}

		for (i = 1;i <= n;i++)
		{
			det = b[i - 1] * b[i - 1] - 4 * a[i - 1] * c[i - 1];
			t = -b[i - 1] / (2 * a[i - 1]);
			x = Math.sqrt(det) / (2 * a[i - 1]);
			y = Math.sqrt(-det) / (2 * a[i - 1]);
			if (det < 0)
			{
					 if (t != 0)
					 {
			   System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",t,y,t,y);
					 }
			   else
			   {
				   System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",-t,y,-t,y);
			   }
			}
			else if (det > 0)
			{
			   System.out.printf("x1=%.5lf;x2=%.5lf\n",x + t,t - x);
			}
			else
			{
			   System.out.printf("x1=x2=%.5lf\n",t);
			}
		}
	}
}

