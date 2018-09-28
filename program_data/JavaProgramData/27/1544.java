package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		 double x1;
		 double x2;
		 double[][] s = new double[100][3];
		 double a;
		 double b;
		 double c;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (i = 0;i < n;i++)
		 {
			 for (j = 0;j < 3;j++)
			 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 s[i][j] = Double.parseDouble(tempVar2);
			 }
			 }
		 }
		 for (i = 0;i < n;i++)
		 {
			 a = s[i][0];
			  b = s[i][1];
			  c = s[i][2];
		 if (b * b >= 4 * a * c)
		 {
			  x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			   x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			   if (x1 == x2)
			   {
				   System.out.printf("x1=x2=%.5lf\n",x1);
			   }
			   else
			   {
				   System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
			   }
		 }
		 else
		 {
			  x1 = (-b) / (2 * a);
			  if (x1 == 0)
			  {
				  x1 = 0;
			  }
			  x2 = Math.sqrt(4 * a * c - b * b) / (2 * a);
			  x2 = Math.abs(x2);
			  System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",x1,x2,x1,x2);
		 }
		 }
	  return 0;
	}
}

