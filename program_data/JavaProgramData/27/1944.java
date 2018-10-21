package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i = 1;
		  double a;
		  double b;
		  double c;
		  double x1;
		  double x2;
		  double d;
		  double f;
		  double k;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  while (i <= n)
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
					 f = -b / (2 * a);
					 if (b == 0)
					 {
						 f = 0;
					 }
					 d = b * b - 4 * a * c;
					 if (d > 0)
					 {
							x1 = f + Math.sqrt(d) / (2 * a);
							x2 = f - Math.sqrt(d) / (2 * a);
							System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
					 }
					 else if (d == 0)
					 {
						 System.out.printf("x1=x2=%.5f\n",f);
					 }
					 else
					 {
							k = Math.sqrt(-d) / (2 * a);
							System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",f,k,f,k);
					 }
					 i++;
		  }
	}
}

