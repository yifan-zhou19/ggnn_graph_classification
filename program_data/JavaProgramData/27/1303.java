package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;

		float[] a = new float[100];
		float[] b = new float[100];
		float[] c = new float[100];
		double x1;
		double x2;
		double d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}


		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a[i]) = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(b[i]) = Float.parseFloat(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				(c[i]) = Float.parseFloat(tempVar4);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			d = b[i] * b[i] - 4 * a[i] * c[i];

			if (d > 0)
			{
				x1 = (-b[i]) / (2 * a[i]) + Math.sqrt(b[i] * b[i] - 4 * a[i] * c[i]) / (2 * a[i]);
				x2 = (-b[i]) / (2 * a[i]) - Math.sqrt(b[i] * b[i] - 4 * a[i] * c[i]) / (2 * a[i]);
				System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
			}
			else if (d == 0)

			{
				x1 = (-b[i]) / (2 * a[i]);
				System.out.printf("x1=x2=%.5f\n",x1);
			}
			else
			{
				x1 = -b[i] / (2 * a[i]);
				x2 = Math.sqrt(-d) / (2 * a[i]);
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",x1,x2,x1,x2);
			}
		}
	}

}

