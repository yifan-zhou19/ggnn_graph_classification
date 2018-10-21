package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 float a;
	 float b;
	 float c;
	 double x1;
	 double x2;
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
		 if (b * b - 4 * a * c > 0F)
		 {
			x1 = (double)(0 - b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			x2 = (double)(0 - b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
		 }
		 if (b * b - 4 * a * c == 0F)
		 {
			x1 = x2 = (double)(0 - b) / (2 * a);
			System.out.printf("x1=x2=%.5lf\n",x1);
		 }
		 if (b * b - 4 * a * c < 0F)
		 {
			x1 = (double)(Math.sqrt(4 * a * c - b * b)) / (2 * a);
			x2 = (double)(0 - b) / (2 * a);
			System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",x2,x1,x2,x1);
		 }
	 }
	}

}

