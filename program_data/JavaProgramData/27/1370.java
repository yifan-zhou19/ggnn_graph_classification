package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{

		int n;
		int r = 1;
		float a;
		float b;
		float c;
		float a1;
		float a2;
		double x1;
		double x2;
		double w;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (r <= n)
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
			r++;
			x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		   if (b * b - 4 * a * c > 0F)
		   {
			   System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
		   }
		   else
		   {
			   if (b * b - 4 * a * c == 0F)
			   {
				System.out.printf("x1=x2=%.5lf\n",x1);
			   }
			   else
			   {
				  a1 = (-b) / (2 * a);
				  a2 = (-b) / (2 * a);
				  w = Math.sqrt(-(b * b - 4 * a * c)) / (2 * a);
				  if (b != 0F)
				  {
				   System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",a1,w,a2,w);
				  }
				  else
				  {
				   System.out.printf("x1=0.00000+%.5lfi;x2=0.00000-%.5lfi\n",w,w);
				  }
			   }

		   }
		}

	}

}

