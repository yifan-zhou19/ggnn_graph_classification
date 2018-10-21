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
		double x1;
		double x2;
		float[] a = new float[N];
		float[] b = new float[N];
		float[] c = new float[N];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Float.parseFloat(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c[i] = Float.parseFloat(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a != 0F)
			{
				double m;
				double n;
				double p;
			  m = (-b[i]) / (2 * a[i]);
			  n = Math.sqrt((b[i] * b[i] - 4 * a[i] * c[i])) / (2 * a[i]);
			  p = Math.sqrt(4 * a[i] * c[i] - b[i] * b[i]) / (2 * a[i]);
			  if (b[i] * b[i] - 4 * a[i] * c[i] > 0F)
			  {
				  x1 = m + n;
				  x2 = m - n;
				 System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
			  }
			  else if (b[i] * b[i] - 4 * a[i] * c[i] == 0F)
			  {
				 System.out.printf("x1=x2=%.5f\n",m);
			  }
			  else
			  {
				System.out.printf("x1=%.5f+%.5fi;",m,p);
				System.out.printf("x2=%.5f-%.5fi\n",m,p);
			  }
			}
		}
	}
}

