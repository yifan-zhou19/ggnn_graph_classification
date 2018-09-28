package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  double delta;
	  double p;
	  double q;
	  double x1;
	  double x2;
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
				 delta = b[i] * b[i] - 4 * a[i] * c[i];
				   p = -(b[i] / (2 * a[i]));
				   q = Math.sqrt(Math.abs(delta)) / (2 * a[i]);
				   if (delta == 0)
				   {
				   System.out.printf("x1=x2=%.5f\n",p);
				   }
				  else if (delta > 0)
				  {
					x1 = p + q;
					x2 = p - q;
					 System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
				  }
				 else
				 {
					 System.out.printf("x1=%.5f+%.5fi;",p,q);
					 System.out.printf("x2=%.5f-%.5fi\n",p,q);
				 }
			}
	return 0;
	}

}

