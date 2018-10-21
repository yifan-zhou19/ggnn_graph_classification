package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		/*n = 0;*/
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		float[] a = new float[100];
		float[] b = new float[100];
		float[] c = new float[100];
		double x1;
		double x2;
		for (i = 1; i <= n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i - 1] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i - 1] = Float.parseFloat(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c[i - 1] = Float.parseFloat(tempVar4);
			}
		}
		for (i = 1; i <= n; i++)
		{
			if ((b[i - 1] * b[i - 1] - 4 * a[i - 1] * c[i - 1]) > 0)
			{
		x1 = (-b[i - 1] + Math.sqrt(b[i - 1] * b[i - 1] - 4 * a[i - 1] * c[i - 1])) / (2 * a[i - 1]);
		x2 = (-b[i - 1] - Math.sqrt(b[i - 1] * b[i - 1] - 4 * a[i - 1] * c[i - 1])) / (2 * a[i - 1]);
				System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
			}
			else if ((b[i - 1] * b[i - 1] - 4 * a[i - 1] * c[i - 1]) == 0)
			{
		x1 = (-b[i - 1] + Math.sqrt(b[i - 1] * b[i - 1] - 4 * a[i - 1] * c[i - 1])) / (2 * a[i - 1]);
		x2 = (-b[i - 1] - Math.sqrt(b[i - 1] * b[i - 1] - 4 * a[i - 1] * c[i - 1])) / (2 * a[i - 1]);
				System.out.printf("x1=x2=%.5f\n",x1);
			}
			else if ((b[i - 1] * b[i - 1] - 4 * a[i - 1] * c[i - 1]) < 0)
			{
				double i1;
				double i2;
				i1 = Math.sqrt(-b[i - 1] * b[i - 1] + 4 * a[i - 1] * c[i - 1]) / (2 * a[i - 1]);
				i2 = -b[i - 1] / (2 * a[i - 1]);
							if (i2 == -0.00000)
							{
					i2 = 0.00000;
							}
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",i2,i1,i2,i1);
			}

		}

	}
}

