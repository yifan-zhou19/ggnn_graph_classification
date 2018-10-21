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
		  double x1;
		  double x2;
		  double[] p = new double[50];
		  double[][] s = new double[50][3];
		  int i;
		  int k;
		  for (k = 0;k < n;k++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  s[k][0] = Double.parseDouble(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  s[k][1] = Double.parseDouble(tempVar3);
			  }
			  String tempVar4 = ConsoleInput.scanfRead();
			  if (tempVar4 != null)
			  {
				  s[k][2] = Double.parseDouble(tempVar4);
			  }
			  double a;
			  double b;
			  double c;
			  a = s[k][0];
			  b = s[k][1];
			  c = s[k][2];
			  p[k] = b * b - 4 * a * c;
		  }
		  for (i = 0;i < n;i++)
		  {
			  double a;
			  double b;
			  double c;
			  a = s[i][0];
			  b = s[i][1];
			  c = s[i][2];
			  p[i] = b * b - 4 * a * c;
			  if (p[i] > 0)
			  {
				  x1 = (-b + Math.sqrt(p[i])) / (2 * a);
				  x2 = (-b - Math.sqrt(p[i])) / (2 * a);
				  System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
			  }
			  else if (p[i] == 0)
			  {
				  x1 = (-b) / (2 * a);
				  System.out.printf("x1=x2=%.5f\n",x1);
			  }
			  else if (p[i] < 0)
			  {
				  double q1;
				  double q2;
				  q1 = -b / (2 * a);
				  q2 = Math.sqrt(-p[i]) / (2 * a);
				  if (b == 0)
				  {
					  System.out.printf("x1=0.00000+%.5fi;x2=0.00000-%.5fi\n",q2,q2);
				  }
				  else
				  {
					  System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",q1,q2,q1,q2);
				  }
			  }

		  }
		   return 0;
	  }
}

