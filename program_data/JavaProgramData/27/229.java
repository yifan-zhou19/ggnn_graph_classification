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
		double d;
		double x1;
		double x2;
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
				a[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c[i] = Double.parseDouble(tempVar4);
			}
		}
		for (i = 1;i <= n;i++)
		{
			if ((b[i] * b[i] - 4 * a[i] * c[i]) >= 0)
			{
				d = Math.sqrt(b[i] * b[i] - 4 * a[i] * c[i]);
			 if (d <= 0.0000001 && d >= -0.0000001)
			 {
				 x1 = (-b[i]) / (2 * a[i]);
			  System.out.printf("x1=x2=%.5f\n",x1);
			 }
			 else
			 {
				  x1 = (-b[i] + d) / (2 * a[i]);
			   x2 = (-b[i] - d) / (2 * a[i]);
			   System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
			 }
			}
			else
			{
				  d = Math.sqrt(-b[i] * b[i] + 4 * a[i] * c[i]);
			   System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",0 - b[i] / (2 * a[i]),d / (2 * a[i]),0 - b[i] / (2 * a[i]),d / (2 * a[i]));
			}
		}
	}

}

