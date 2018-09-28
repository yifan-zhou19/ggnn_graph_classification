package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  float a;
		  float b;
		  float c;
		  float n;
		  float p;
		  float q;
		  float l;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Float.parseFloat(tempVar);
		  }
		  float i = 1F;
		  while (i <= n)
		  {
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a = Float.parseFloat(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					b = Float.parseFloat(tempVar3);
				}
				String tempVar4 = ConsoleInput.scanfRead(" ");
				if (tempVar4 != null)
				{
					c = Float.parseFloat(tempVar4);
				}
				l = b * b - 4 * a * c;
				if (b != 0F)
				{
					  p = -b / (2 * a);
				}
				else
				{
					  p = b / (2 * a);
				}

				if (l < 0F)
				{
				   q = Math.sqrt(-l) / (2 * a);
				   System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",p,q,p,q);
				}
				else
				{
					 q = Math.sqrt(l) / (2 * a);
					 if (p + q == p - q)
					 {
						System.out.printf("x1=x2=%.5f\n",p);
					 }
					  else
					  {
						System.out.printf("x1=%.5f;x2=%.5f\n",(p + q),(p - q));
					  }
				}
				 i++;
		  }
	}

}

