package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;

	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//  struct
	//  {
	//	  double a,b,c;
	//  }
	//  xs[100];
	  for (i = 0;i < n;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  xs[i].a = tempVar2;
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  xs[i].b = tempVar3;
		  }
		  String tempVar4 = ConsoleInput.scanfRead(" ");
		  if (tempVar4 != null)
		  {
			  xs[i].c = tempVar4;
		  }
	  }
	  for (i = 0;i < n;i++)
	  {
		  double a1;
		  double b1;
		  double c1;
		  a1 = xs[i].a;
		  b1 = xs[i].b;
		  c1 = xs[i].c;
		  if ((b1 * b1 - 4 * a1 * c1) > 0)
		  {
			  double x1;
			  double x2;
			  x1 = (-b1 + Math.sqrt(b1 * b1 - 4 * a1 * c1)) / (2 * a1);
			  x2 = (-b1 - Math.sqrt(b1 * b1 - 4 * a1 * c1)) / (2 * a1);
			  System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
		  }
		  if ((b1 * b1 - 4 * a1 * c1) == 0)
		  {
			  double x1;
			  double x2;
			  x1 = x2 = (-b1) / (2 * a1);
			  System.out.printf("x1=x2=%.5lf\n",x1);
		  }
		  if ((b1 * b1 - 4 * a1 * c1) < 0)
		  {
			  double t1;
			  double t2;
			  t1 = (-b1) / (2 * a1);
			  t2 = Math.sqrt(4 * a1 * c1 - b1 * b1) / (2 * a1);
			  if (t1 == -0.00000)
			  {
				  System.out.printf("x1=0.00000+%.5lfi;x2=0.00000-%.5lfi\n",t2,t2);
			  }
			  else
			  {
				  System.out.printf("x1=%.5lf+%.5lfi;",t1,t2);
				  System.out.printf("x2=%.5lf-%.5lfi\n",t1,t2);
			  }
		  }
	  }

	}


}

