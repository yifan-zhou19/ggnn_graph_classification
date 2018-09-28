package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   double a;
	   double b;
	   double c;
	   double d;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   i = 1;
	   a = 0;
	   b = 0;
	   c = 0;
	   d = 0;
	   while (i <= n)
	   {
		   int e;
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   e = Integer.parseInt(tempVar2);
		   }
		   if (e <= 18)
		   {
			   a++;
		   }
		   else if (e >= 19 && e <= 35)
		   {
			   b++;
		   }
		   else if (e >= 36 && e <= 60)
		   {
			   c++;
		   }
		   else
		   {
			   d++;
		   }
		   i++;
	   }
	   System.out.printf("1-18: %.2lf%%\n",a * 100 / (a + b + c + d));
	   System.out.printf("19-35: %.2lf%%\n",b * 100 / (a + b + c + d));
	   System.out.printf("36-60: %.2lf%%\n",c * 100 / (a + b + c + d));
	   System.out.printf("60??: %.2lf%%\n",d * 100 / (a + b + c + d));
	   return 0;
	}
}

