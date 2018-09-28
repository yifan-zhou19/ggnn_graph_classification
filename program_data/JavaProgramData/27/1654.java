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
		double e;
		double f;
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
	//    printf("%f %f %f",a[1],b[1],c[1]);
		for (i = 1;i <= n;i++)
		{
		  d = b[i] * b[i] - 4 * a[i] * c[i];
		  e = -b[i] / (2 * a[i]);
		  {
			 if ((e < 0.000001) && (e>-0.000001))
			 {
		  e = 0;
			 }
		  }
		  if (d > 0.000001)
		  {
			System.out.printf("x1=%.5f;x2=%.5f\n",(-b[i] + Math.sqrt(d)) / (2 * a[i]),(-b[i] - Math.sqrt(d)) / (2 * a[i]));
		  }
		  else if (d < -0.000001)
		  {
			f = Math.sqrt(-d) / (2 * a[i]);
			System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",e,f,e,f);
		  }
		  else
		  {
			System.out.printf("x1=x2=%.5f\n",e);
		  }
		}
	}

}

