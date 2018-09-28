package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  double f;
		  int n;
		  int m;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  float[] a = new float[20];
		  float[] b = new float[20];
		  float[] c = new float[20];
		  for (m = 0;m < n;m++)
		  {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a[m] = Float.parseFloat(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead(" ");
			 if (tempVar3 != null)
			 {
				 b[m] = Float.parseFloat(tempVar3);
			 }
			 String tempVar4 = ConsoleInput.scanfRead(" ");
			 if (tempVar4 != null)
			 {
				 c[m] = Float.parseFloat(tempVar4);
			 }
		  }
		  int i;
		  for (i = 0;i < n;i++)
		  {
			f = b[i] * b[i] - 4 * a[i] * c[i];
			if (f >= 0)
			{
					double p;
					double q;
					p = (-b[i] + Math.sqrt(f)) / (2 * a[i]);
					q = (-b[i] - Math.sqrt(f)) / (2 * a[i]);
					if (p == q)
					{
					   System.out.printf("x1=x2=%.5f\n",p);
					}
					else
					{
					   System.out.printf("x1=%.5f;x2=%.5f\n",p,q);
					}
			}
					else
					{
						 double d;
						 double e;
						 d = Math.sqrt(-f) / (2 * a[i]);
						 e = 0 - b[i] / (2 * a[i]);
						 System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",e,d,e,d);
					}
		  }
	}
}

