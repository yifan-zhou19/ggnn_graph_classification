package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double[] x1 = new double[100];
		double[] x2 = new double[100];
		double[] num1 = new double[100];
		double[] num2 = new double[100];
		double[] num3 = new double[100];
		float[] a = new float[100];
		float[] b = new float[100];
		float[] c = new float[100];
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
			num1[i] = b[i] * b[i] - 4 * a[i] * c[i];
				if (num1[i] > 1e-6)
				{
					x1[i] = (-b[i] + Math.sqrt(num1[i])) / (2 * a[i]);
					x2[i] = (-b[i] - Math.sqrt(num1[i])) / (2 * a[i]);
					System.out.printf("x1=%.5f;x2=%.5f\n",x1[i],x2[i]);
				}
				else if (num1[i] <= 1e-6 && num1[i] >= -1e-6)
				{
					x1[i] = -b[i] / (2 * a[i]);
					System.out.printf("x1=x2=%.5f\n",x1[i]);
				}
				else
				{
					num2[i] = -b[i] / (2 * a[i]);
					num3[i] = Math.sqrt(-num1[i]) / (2 * a[i]);
					System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",num2[i],num3[i],num2[i],num3[i]);
				}
		}
		return 0;
	}


}

