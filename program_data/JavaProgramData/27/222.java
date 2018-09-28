package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	float[][] m = new float[100][3];
	double x1;
	double x2;
	double delt;
	double a;
	double b;
	double c;
	double s;
	double t;
	int n;
	int i;
	int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i <= n - 1;i++)
	{
		 for (j = 0;j <= 2;j++)
		 {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   m[i][j] = Float.parseFloat(tempVar2);
			   }
		 }
	}
	for (i = 0;i <= n - 1;i++)
	{
		 a = (double)m[i][0];
		 b = (double)m[i][1];
		 c = (double)m[i][2];
		 delt = (double)(b * b - 4 * a * c);
		 if (delt > 0)
		 {
				x1 = (-b + 1 + Math.sqrt(b * b - 4 * a * c)) / (2 * a) - 1 / (2 * a);
				x2 = (-b + 1 - Math.sqrt(b * b - 4 * a * c)) / (2 * a) - 1 / (2 * a);
				System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
		 }
		 if (delt == 0)
		 {
				x1 = (-b + 1 + Math.sqrt(b * b - 4 * a * c)) / (2 * a) - 1 / (2 * a);
				x2 = (-b + 1 - Math.sqrt(b * b - 4 * a * c)) / (2 * a) - 1 / (2 * a);
				System.out.printf("x1=x2=%.5f\n",x1);
		 }
		 if (delt < 0)
		 {
				s = ((-b + 1) / (2 * a)) - 1 / (2 * a);
				t = (Math.sqrt(4 * a * c - b * b) / (2 * a));
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f%.5fi\n",s,t,s,-t);
		 }
	}
	}

}

