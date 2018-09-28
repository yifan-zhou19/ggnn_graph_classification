package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  double[][] e = new double[100][3];
		  int i;
		  for (i = 0;i < n;i++)
		  {
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  e[i][0] = Double.parseDouble(tempVar2);
						  }
						  String tempVar3 = ConsoleInput.scanfRead(" ");
						  if (tempVar3 != null)
						  {
							  e[i][1] = Double.parseDouble(tempVar3);
						  }
						  String tempVar4 = ConsoleInput.scanfRead(" ");
						  if (tempVar4 != null)
						  {
							  e[i][2] = Double.parseDouble(tempVar4);
						  }
		  }
		  double[][] a = new double[100][2];
		  for (i = 0;i < n;i++)
		  {
						  if ((e[i][1] * e[i][1] - 4 * e[i][0] * e[i][2]) > 0)
						  {
							   a[i][0] = (-e[i][1] + Math.sqrt(e[i][1] * e[i][1] - 4 * e[i][0] * e[i][2])) / (2 * e[i][0]);
							   a[i][1] = (-e[i][1] - Math.sqrt(e[i][1] * e[i][1] - 4 * e[i][0] * e[i][2])) / (2 * e[i][0]);
							   System.out.printf("x1=%.5lf;x2=%.5lf\n",a[i][0],a[i][1]);
						  }
						  if ((e[i][1] * e[i][1] - 4 * e[i][0] * e[i][2]) == 0)
						  {
							   a[i][0] = (-e[i][1]) / (2 * e[i][0]);
							   a[i][1] = (-e[i][1]) / (2 * e[i][0]);
							   System.out.printf("x1=x2=%.5lf\n",a[i][0]);
						  }
						  if ((e[i][1] * e[i][1] - 4 * e[i][0] * e[i][2]) < 0)
						  {
							   char c = 'i';
							   double p;
							   double q;
							   if (e[i][1] == 0)
							   {
									p = (e[i][1]) / (2 * e[i][0]);
									q = (Math.sqrt(4 * e[i][0] * e[i][2] - e[i][1] * e[i][1])) / (2 * e[i][0]);
									System.out.printf("x1=%.5lf+%.5lf%c;x2=%.5lf-%.5lf%c\n",p,q,c,p,q,c);
							   }
							   else
							   {
								   p = (-e[i][1]) / (2 * e[i][0]);
								   q = (Math.sqrt(4 * e[i][0] * e[i][2] - e[i][1] * e[i][1])) / (2 * e[i][0]);
								   System.out.printf("x1=%.5lf+%.5lf%c;x2=%.5lf-%.5lf%c\n",p,q,c,p,q,c);
							   }
						  }
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

