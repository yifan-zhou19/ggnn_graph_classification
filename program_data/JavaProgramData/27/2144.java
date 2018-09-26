package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  double a;
		  double b;
		  double c;
		  double d;



		  for (i = 1;i <= n;i++)
		  {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c = Double.parseDouble(tempVar4);
			}
			d = b * b - 4 * a * c;

			if (d == 0)
			{
				System.out.printf("x1=x2=%.5lf\n",-b / (2 * a));
			}
			else
			{
					if (d > 0)
					{
					   if ((-b) / (2 * a) < 0.00001 && ((-b) / (2 * a))>-0.00001)
					   {

						  System.out.printf("x1=0.00000+%.5lf;x2=0.00000-%.5lf\n",Math.sqrt(d) / (2 * a),Math.sqrt(d) / (2 * a));
					   }
					   else
					   {
						   System.out.printf("x1=%.5lf;x2=%.5lf\n",(-b + Math.sqrt(d)) / (2 * a),(-b - Math.sqrt(d)) / (2 * a));
					   }
					}
					else if ((-b) / (2 * a) < 0.00001 && (-b) / (2 * a)>-0.00001)
					{
						  System.out.printf("x1=0.00000+%.5lfi;x2=0.00000-%.5lfi\n",Math.sqrt(-d) / (2 * a),Math.sqrt(-d) / (2 * a));
					}
					   else
					   {
						System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",-b / (2 * a),Math.sqrt(-d) / (2 * a),-b / (2 * a),Math.sqrt(-d) / (2 * a));
					   }
			}
		  }


	}

}

