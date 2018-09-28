package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	   int n;
	   int i;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   int age;
	   int a = 0;
	   int b = 0;
	   int c = 0;
	   int d = 0;
	   double aa = 0;
	   double bb = 0;
	   double cc = 0;
	   double dd = 0;
	   for (i = 1;i < n + 1;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   age = Integer.parseInt(tempVar2);
		   }
		   if (age <= 18 && age >= 1)
		   {
			   a++;
		   }
		   else if (age <= 35 && age >= 19)
		   {
			   b++;
		   }
		   else if (age <= 60 && age >= 36)
		   {
			   c++;
		   }
		   else
		   {
			   d++;
		   }
	   }
			aa = ((double)a / (double)n) * 100;
			bb = ((double)b / (double)n) * 100;
			cc = ((double)c / (double)n) * 100;
			dd = ((double)d / (double)n) * 100;
			System.out.printf("1-18: %.2lf%%\n",aa);
			System.out.printf("19-35: %.2lf%%\n",bb);
			System.out.printf("36-60: %.2lf%%\n",cc);
			System.out.printf("60??: %.2lf%%\n",dd);
	}

}

