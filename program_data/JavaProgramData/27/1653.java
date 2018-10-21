package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j = 0;
		int i;
		double a;
		double b;
		double c;
		double x1;
		double x2;
		double p;
		double q;
		double k;

	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }

		  while (j < n)
		  {
				j++;
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
			p = -b / (2.0 * a);
			q = Math.sqrt(b * b - 4.0 * a * c);
		if (b * b - 4.0 * a * c != 0.0)
		{
			 if (b * b - 4.0 * a * c > 0.0)
			 {
				   x1 = (-b + Math.sqrt(b * b - 4.0 * a * c)) / (2.0 * a);
				   x2 = (-b - Math.sqrt(b * b - 4.0 * a * c)) / (2.0 * a);
					   if (q - 0 >= 0.00001)
					   {
						 System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
					   }
					   else
					   {
						if (p < 0.00001 && p>-0.00001)
						{
							System.out.print("x1=x2=0.00000");
						}
						else
						{
							System.out.printf("x1=x2=%.5f\n",p);
						}
					   }
			 }
			 else
			 {
				  k = (Math.sqrt(4.0 * a * c - b * b)) / (2 * a);
				  if (q - 0 >= 0.00001)
				  {
					System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",p,k,p,k);
				  }
				  else
				  {
					  if (p < 0.00001 && p>-0.00001)
					  {
						  System.out.printf("x1=0.00000+%.5fi;x2=0.00000-%.5fi\n",k,k);
					  }
					  else
					  {
						  System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",p,k,p,k);
					  }
				  }
			 }
		}

		else
		{
			   x1 = x2 = -b / (2.0 * a);
			   if (p < 0.00001 && p>-0.00001)
			   {
				   System.out.print("x1=x2=0.00000");
			   }
			   else
			   {
				   System.out.printf("x1=x2=%.5f\n",x1,x2);
			   }
		}
		  }

	}
}

