package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		double[] x1 = new double[11];
		double[] x2 = new double[11];
		double[] disc = new double[11];
		double[] real = new double[11];
		double[] imag = new double[11];
		float[] a = new float[11];
		float[] b = new float[11];
		float[] c = new float[11];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (;n > 11;)
		{
			System.out.print("Wrong input,please input again.\n");
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Float.parseFloat(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				b[i] = Float.parseFloat(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				c[i] = Float.parseFloat(tempVar5);
			}
		}
		for (i = 0;i < n;i++)
		{
			disc[i] = b[i] * b[i] - 4 * a[i] * c[i];
				if (disc[i] > 1e-6)
				{
					x1[i] = (-b[i] + Math.sqrt(disc[i])) / (2 * a[i]);
					x2[i] = (-b[i] - Math.sqrt(disc[i])) / (2 * a[i]);
					System.out.printf("x1=%.5f;x2=%.5f\n",x1[i],x2[i]);
				}
				else if (disc[i] <= 1e-6 && disc[i] >= -1e-6)
				{
					x1[i] = -b[i] / (2 * a[i]);
					System.out.printf("x1=x2=%.5f\n",x1[i]);
				}
				else
				{
					real[i] = -b[i] / (2 * a[i]);
					imag[i] = Math.sqrt(-disc[i]) / (2 * a[i]);
					System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",real[i],imag[i],real[i],imag[i]);
				}
		}
	}


}

