package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  double a;
		  double b;
		  double c;
		  double x1;
		  double x2;
		  double Delta;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (int i = 1;i <= n;i++)
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
		  Delta = (b * b - 4 * a * c);
		  if (Delta > 0)
		  {
			  x1 = (-b + Math.sqrt(Delta)) / (2 * a);
		  x2 = (-b - Math.sqrt(Delta)) / (2 * a);
		  System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
		  }
		  else if (Math.abs(Delta) < 1e-7)
		  {
			  x1 = (-b) / (2 * a);
		  System.out.printf("x1=x2=%.5f\n",x1);
		  }
		  else
		  {
			   x1 = (-b + Math.sqrt(-Delta)) / (2 * a);
		   x2 = (-b - Math.sqrt(-Delta)) / (2 * a);

		  if (Math.abs(b) < 1e-7)
		  {
		  System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",(b / (2 * a)),(Math.sqrt(4 * a * c - b * b) / (2 * a)),(b / (2 * a)),(Math.sqrt(4 * a * c - b * b) / (2 * a)));
		  }
		  else
		  {
		  System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",(-b / (2 * a)),(Math.sqrt(4 * a * c - b * b) / (2 * a)),(-b / (2 * a)),(Math.sqrt(4 * a * c - b * b) / (2 * a)));
		  }
		  }

		  }

	}



}

