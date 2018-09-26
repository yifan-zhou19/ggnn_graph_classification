package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 float[][] x = new float[100][3];
	 float a;
	 float b;
	 float c;
	 float d;
	 int i;
	 int n;
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
		   x[i][1] = Float.parseFloat(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   x[i][2] = Float.parseFloat(tempVar3);
	   }
	   String tempVar4 = ConsoleInput.scanfRead();
	   if (tempVar4 != null)
	   {
		   x[i][3] = Float.parseFloat(tempVar4);
	   }
	 }
	 for (i = 1;i <= n;i++)
	 {
	   a = x[i][1];
	   b = x[i][2];
	   c = x[i][3];
	   d = b * b - 4 * a * c;
	   if (d > 0F && c == 0F)
	   {
		 System.out.printf("x1=%.5f;x2=%.5f\n",c,(-b - Math.sqrt(d)) / (2 * a));
	   }
	   if (d > 0F && c != 0F)
	   {
		 System.out.printf("x1=%.5f;x2=%.5f\n",(-b + Math.sqrt(d)) / (2 * a),(-b - Math.sqrt(d)) / (2 * a));
	   }
	   if (d == 0F)
	   {
		 System.out.printf("x1=x2=%.5f\n",(-b + Math.sqrt(d)) / (2 * a));
	   }
	   if (d < 0F && b == 0F)
	   {
		 System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",b,Math.sqrt(-d) / (2 * a),b,Math.sqrt(-d) / (2 * a));
	   }
		 if (d < 0F && b != 0F)
		 {
		 System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",-b / (a * 2),Math.sqrt(-d) / (2 * a),-b / (2 * a),Math.sqrt(-d) / (2 * a));
		 }
	 }
	}

}

