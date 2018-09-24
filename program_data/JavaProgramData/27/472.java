package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  float a;
		  float b;
		  float c;
		  float disc;
		  double x1;
		  double x2;
		  double realpart;
		  double imagpart;
		  int i;
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 1;i <= n;i = i + 1)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a = Float.parseFloat(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  b = Float.parseFloat(tempVar3);
		  }
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  c = Float.parseFloat(tempVar4);
		  }
		  disc = b * b - 4 * a * c;
		  if (Math.abs(disc) <= 1e-6)
		  {
			System.out.printf("x1=x2=%.5f\n",-b / (2 * a) + 0);
		  }
			else
			{

			  if (disc > 1e-6F)
			  {
			  realpart = -b / (2 * a) + 0;
			  imagpart = Math.sqrt(disc) / (2 * a);
			   x1 = realpart + imagpart;
			   x2 = realpart - imagpart;
			   if (Math.abs(x1) <= 1e-6)
			   {
			   System.out.printf("x1=%.5f;x2=%.5f\n",Math.abs(x1),x2);
			   }
				else
				{
				System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
				}

			  }
			  else
			  {
			  realpart = -b / (2 * a) + 0;
			  imagpart = Math.sqrt(-disc) / (2 * a);
			  System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",realpart,imagpart,realpart,imagpart);

			  }
			}
		  }
	}

}

