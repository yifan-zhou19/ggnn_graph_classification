package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int q;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  double[][] p = new double[n][3];
		  int j;
		  for (j = 0;j < n;j++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  p[j][0] = Double.parseDouble(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  p[j][1] = Double.parseDouble(tempVar3);
		  }
		  String tempVar4 = ConsoleInput.scanfRead(" ");
		  if (tempVar4 != null)
		  {
			  p[j][2] = Double.parseDouble(tempVar4);
		  }
		  }
		  for (q = 0;q < n;q++)
		  {
		  double a;
		  double b;
		  double c;
		  double x1;
		  double x2;
		  double d;
		  double e;
		  a = p[q][0];
		  b = p[q][1];
		  c = p[q][2];
		  if (b * b - 4 * a * c > 0)
		  {
			  x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		   x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		   System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
		  }
		   else
		   {
			   if (b * b - 4 * a * c == 0)
			   {
		   x1 = -b / (2 * a);
		   x2 = -b / (2 * a);
		   System.out.printf("x1=x2=%.5f\n",x1);
			   }
		   else
		   {
		   d = 0 - b / (2 * a);
		   e = (Math.sqrt(4 * a * c - b * b)) / (2 * a);
		   System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",d,e,d,e);
		   }
		   }
		  }
	}

}

