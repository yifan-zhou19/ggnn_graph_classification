package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] s = new int[100];
	   int i;
	   double n;
	   double a = 0;
	   double b = 0;
	   double c = 0;
	   double d = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Double.parseDouble(tempVar);
	   }
	   for (i = 0;i < n;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   s[i] = Integer.parseInt(tempVar2);
		   }
	   }
	   for (i = 0;i < n;i++)
	   {
		   if (s[i] >= 1 && s[i] <= 18)
		   {
		   a++;
		   }
		   else if (s[i] >= 19 && s[i] <= 35)
		   {
		   b++;
		   }
		   else if (s[i] >= 36 && s[i] <= 60)
		   {
		   c++;
		   }
		   else
		   {
		   d++;
		   }
	   }
	   a = a / n * 100;
	   b = b / n * 100;
	   c = c / n * 100;
	   d = d / n * 100;
	   System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%\n",a,b,c,d);
	   return 0;
	}

}

