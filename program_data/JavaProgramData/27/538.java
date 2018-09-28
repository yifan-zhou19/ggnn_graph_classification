package <missing>;

public class GlobalMembers
{
	public static int file0()
	{
		float a;
		float b;
		float c;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Float.parseFloat(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  b = Float.parseFloat(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  c = Float.parseFloat(tempVar3);
		  }
			  double x1;
			  double x2;
			  double p;
			  double e;
			  double f;
			  a = 4 * a;
			  b = 4 * b;
			  c = 4 * c;

				p = b * b - 4 * a * c;
				if (p > 0)
				{
				   x1 = (-b + Math.sqrt(p)) / (2 * a);
				 x2 = (-b - Math.sqrt(p)) / (2 * a);

				 System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
				}

			   else if (p == 0)
			   {
			   x1 = x2 = (-b + Math.sqrt(p)) / 2 * a;
			   System.out.printf("x1=x2=%.5f\n",x1);

			   }
			   else if (p < 0)
			   {
			   e = -b / (2 * a);
			   f = Math.sqrt(-p) / (2 * a);
			   if (e == -0)
			   {
			   e = 0;
			   }

			   System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",e,f,e,f);

			   }

	}
	public static int Main()
	{
		  int n;
		  int r;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  r = 0;
		  for (r = 0;r <= n;r++)
		  {
			 if (r < n)
			 {

		  file0();
			 }
		  }
	return 0;
	}

}

