package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int n;
	  float a;
	  float b;
	  float c;
	  double x1;
	  double x2;
	  double d;
	  double e;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= n;i++)
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
	 d = b * b - 4 * a * c;
	if (b == 0F)
	{
		if (d > 0)
		{
		  x1 = (Math.sqrt(b * b - 4 * a * c)) / (2 * a);
	   x2 = (- Math.sqrt(b * b - 4 * a * c)) / (2 * a);

	 System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
		}
		else
		{
		if (d == 0)
		{
		x1 = (Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		System.out.printf("x1=x2=%.5f\n",x1);
		}

		else
		{
			e = Math.sqrt(-d) / (-2 * a);

	  if (e > 0)
	  {
		System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",b,e,b,e);
	  }
		else
		{
		 System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",b,-e,b,-e);
		}
		}
		}
	}




	else
	{
	if (d > 0)
	{
		  x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
	   x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

	 System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
	}
		else
		{
		if (d == 0)
		{
		x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		System.out.printf("x1=x2=%.5f\n",x1);
		}
		else
		{
			e = Math.sqrt(-d) / (-2 * a);

	  if (e > 0)
	  {
		System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",-b / (2 * a),e,-b / (2 * a),e);
	  }
		else
		{
		 System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",-b / (2 * a),-e,-b / (2 * a),-e);
		}
		}
		}
	}
	  }
	}


}

