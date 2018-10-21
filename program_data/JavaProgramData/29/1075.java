package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int m;
	   int n;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   m = Integer.parseInt(tempVar);
	   }
	   for (int i = 0;i < m;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   n = Integer.parseInt(tempVar2);
		   }
		   double s = 0;
		   int a = 2;
		   int b = 1;
		   int c;
		   for (int j = 1;j <= n;j++)
		   {
			   s += (1.0 * a) / b;
			   c = a;
			   a = a + b;
			   b = c;
		   }
		   System.out.printf("%.3lf\n",s);
	   }
	   return 0;
	}
}

