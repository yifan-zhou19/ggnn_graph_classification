package <missing>;

public class GlobalMembers
{
	public static char[][] br = new char[1000][8];
	public static char[][] jl = new char[1000][8];
	public static int Main()
	{
	   int i;
	   int n;
	   int m;
	   int j;
	   double a;
	   double b;
	   double c;
	   double d;
	   double sum = 0.0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < n;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   m = Integer.parseInt(tempVar2);
		   }
		   a = 1.0,b = 2.0;
		   for (j = 0;j < m;j++)
		   {
			   c = b / a;
			   sum += c;
			   d = b;
			   b = b + a;
			   a = d;
		   }
		   System.out.printf("%.3lf\n",sum);
		   sum = 0.0;
	   }
		return 0;
	}

}

