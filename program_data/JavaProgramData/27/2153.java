package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		float a;
		float b;
		float c;
		double x1;
		double x2;
		double e;
		double f;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		   for (m = 1;m <= n;m++)
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
			  if (b * b - 4 * a * c > 0F)
			  {
				  x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				  x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				  System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
			  }
			  else if (b * b - 4 * a * c == 0F)
			  {
				  x1 = x2 = -b / (2 * a);
				  if (x2 == -0)
				  {
					  System.out.print("x1=x2=0.00000\n");
				  }
				 else
				 {
				  System.out.printf("x1=x2=%.5lf\n",x1);
				 }
			  }
			  else
			  {
				  e = -b / (2 * a);
				  if (e == -0)
				  {
					  e = 0;
				  }
				  else
				  {
					  e = e;
				  }
				  f = Math.sqrt(4 * a * c - b * b) / (2 * a);
				  System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",e,f,e,f);
			  }
		   }



		return 0;
	}
}

