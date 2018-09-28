package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[] x1 = new double[99];
		double[] x2 = new double[99];
		double[] a = new double[99];
		double[] b = new double[99];
		double[] c = new double[99];
		double[] disc = new double[99];
		double[] realpart = new double[99];
		double[] imagpart = new double[99];
		for (i = 0;i < n;i++)
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
		for (i = 0;i < n;i++)
		{
			disc[i] = b[i] * b[i] - 4 * a[i] * c[i];
			if (disc[i] == 0)
			{
				System.out.printf("x1=x2=%.5lf\n",-b[i] / (2 * a[i]));
			}
			else if (disc[i] > 0)
			{
					x1[i] = (-b[i] + Math.sqrt(disc[i])) / (2 * a[i]);
					x2[i] = (-b[i] - Math.sqrt(disc[i])) / (2 * a[i]);
					System.out.printf("x1=%.5lf;x2=%.5lf\n",x1[i],x2[i]);
			}
			else
			{
					realpart[i] = -b[i] / (2 * a[i]);
					imagpart[i] = Math.sqrt(-disc[i]) / (2 * a[i]);
					(b[i] == 0)?System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",-realpart[i],imagpart[i],-realpart[i],imagpart[i]):printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",realpart[i],imagpart[i],realpart[i],imagpart[i]);
			}
		};
		return 0;
	}





}

