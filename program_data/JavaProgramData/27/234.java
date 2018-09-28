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
		  for (i = 1;i <= n;i++)
		  {
				 double ai;
				 double bi;
				 double ci;
				 double di;
				 double ei;
				 double fi;
				 double gi;
				 double x1i;
				 double x2i;
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 ai = Double.parseDouble(tempVar2);
				 }
				 String tempVar3 = ConsoleInput.scanfRead(" ");
				 if (tempVar3 != null)
				 {
					 bi = Double.parseDouble(tempVar3);
				 }
				 String tempVar4 = ConsoleInput.scanfRead(" ");
				 if (tempVar4 != null)
				 {
					 ci = Double.parseDouble(tempVar4);
				 }

				 di = bi * bi - 4 * ai * ci;

				 if (di > 0)
				 {
						gi = Math.sqrt(di);
						x1i = (-bi + gi) / (2 * ai);
						x2i = (-bi - gi) / (2 * ai);
						System.out.printf("x1=%.5lf;x2=%.5lf\n",x1i,x2i);
				 }
				 else if (di == 0)
				 {
						 x1i = x2i = (-bi) / (2 * ai);
						 System.out.printf("x1=x2=%.5lf\n",x1i);
				 }
				 else if (di < 0)
				 {
						 gi = Math.sqrt(-di);
						 if (bi == 0)
						 {
							 ei = bi / (2 * ai);
						 }
						 else
						 {
							 ei = -bi / (2 * ai);
						 }
						 fi = (gi) / (2 * ai);
						 System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",ei,fi,ei,fi);
				 }
		  }

	}




}

