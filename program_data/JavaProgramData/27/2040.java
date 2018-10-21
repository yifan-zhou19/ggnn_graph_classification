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
		double[] disc = new double[100];
		double[] x1 = new double[100];
		double[] x2 = new double[100];
		double[] realpart = new double[100];
		double[] imagpart = new double[100];
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
			a[i] = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[i] = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			c[i] = Double.parseDouble(tempVar4);
		}
		}
		for (i = 0;i < n;i++)
		{
		disc[i] = b[i] * b[i] - 4 * a[i] * c[i];
		if (Math.abs(disc[i]) <= 1e-6)
		{
			System.out.printf("x1=x2=%.5lf\n",-b[i] / (2 * a[i]));
		}
		else
		{
			if (disc[i] > 1e-6)
			{
				x1[i] = (-b[i] + Math.sqrt(disc[i])) / (2 * a[i]);
				x2[i] = (-b[i] - Math.sqrt(disc[i])) / (2 * a[i]);
				System.out.printf("x1=%.5lf;x2=%.5lf\n",x1[i],x2[i]);
			}
			else
			{
				realpart[i] = -b[i] / (2 * a[i]);
				imagpart[i] = Math.sqrt(-disc[i]) / (2 * a[i]);
				if (realpart[i] == 0)
				{
					realpart[i] = 0;
				}
				System.out.printf("x1=%.5lf+%.5lfi;",realpart[i],imagpart[i]);
				System.out.printf("x2=%.5lf-%.5lfi\n",realpart[i],imagpart[i]);
			}
		}
		}
			return 0;
	}
}

