package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  float[] a = new float[1000];
		  float gen;
		  float pan;
		  float p;
		  float q;
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
					  a[3 * i] = Float.parseFloat(tempVar2);
				  }
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  a[3 * i + 1] = Float.parseFloat(tempVar3);
				  }
				  String tempVar4 = ConsoleInput.scanfRead();
				  if (tempVar4 != null)
				  {
					  a[3 * i + 2] = Float.parseFloat(tempVar4);
				  }

		  }
				for (i = 0;i < n;i++)
				{
			   pan = a[3 * i + 1] * a[3 * i + 1] - 4 * a[3 * i] * a[3 * i + 2];
			   if (Math.abs(pan) <= 0.00001)
			   {
				  System.out.printf("x1=x2=%.5f\n",-a[3 * i + 1] / (2 * a[3 * i]));
			   }
			   gen = Math.sqrt(Math.abs(pan));
			   p = -a[3 * i + 1] / (2 * a[3 * i]),q = gen / (2 * a[3 * i]);
			   if (Math.abs(p) <= 0.000001)
			   {
					  p = 0.00000F;
			   }
			   if (pan > 0.00001F)
			   {
				  System.out.printf("x1=%.5f;x2=%.5f\n",p + q,p - q);
			   }
			   if (pan < -0.00001F)
			   {
				  System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",p,q,p,q);
			   }
				}
		  //printf("%f%f%f",a[0],a[1],a[2]);


	}
}

