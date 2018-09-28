package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;


		double[] a = new double[200];
		double[] b = new double[200];
		double[] c = new double[200];
		double[] disc = new double[100];
		double[] X1 = new double[100];
		double[] X2 = new double[100];
		double[] realpart = new double[100];
		double[] imagpart = new double[100];

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
			  disc[i] = b[i] * b[i] - 4 * a[i] * c[i];
		for (i = 0;i < n;i++)
		{
				disc[i] = b[i] * b[i] - 4 * a[i] * c[i];
			   if (Math.abs(disc[i]) <= 1e-6)
			   {
			  System.out.printf("x1=x2=%.5f\n",-b[i] / (2 * a[i]));
			   }
		   else if (disc[i] > 1e-6)
		   {
			   X1[i] = (-b[i] + Math.sqrt(disc[i])) / (2 * a[i]);
			   X2[i] = (-b[i] - Math.sqrt(disc[i])) / (2 * a[i]);
			   System.out.printf("x1=%.5f;x2=%.5f\n",X1[i],X2[i]);
		   }
		   else
		   {
			   realpart[i] = -b[i] / (2 * a[i]);
			   imagpart[i] = Math.sqrt(-disc[i]) / (2 * a[i]);
			   if (Math.abs(realpart[i]) <= 1e-6)
			   {
					System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",-realpart [i],imagpart[i],-realpart[i],imagpart[i]);
			   }
						  else
						  {
							  System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",realpart[i],imagpart[i],realpart[i],imagpart[i]);
						  }

		   }
		}
	}

}

