package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  i = 0;
		  double x1;
		  double x2;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  float[] a = new float[n];
		  float[] b = new float[n];
		  float[] c = new float[n];
		  double delta;
		  double d;
		  double e;
		  while (i < n)
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
				  i++;
		  }
		  i = 0;
		  while (i < n)
		  {
			 delta = (b[i]) * (b[i]) - 4 * a[i] * c[i];
			 if (delta > 0)
			 {
						x1 = (-b[i] + Math.sqrt(delta)) / (2 * a[i]);
						x2 = (-b[i] - Math.sqrt(delta)) / (2 * a[i]);
						System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
			 }
			 if (delta == 0)
			 {
						 x1 = -b[i] / (2 * a[i]);
						 System.out.printf("x1=x2=%.5f\n",x1);
			 }
			 if (delta < 0)
			 {
						 d = -b[i] / (2 * a[i]);
						 e = Math.sqrt(-delta) / (2 * a[i]);
						 if (b[i] == 0F)
						 {
						 System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",-d,e,-d,e);
						 }
						 else
						 {
						 System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",d,e,d,e);
						 }
			 }
			 i++;
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

