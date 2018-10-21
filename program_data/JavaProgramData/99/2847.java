package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] pp = new int[100];
	   int i;
	   int n;
	   int a = 0;
	   int b = 0;
	   int c = 0;
	   int d = 0;
	   int sum;
	   double e;
	   double f;
	   double g;
	   double j;
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
		   pp[i] = Integer.parseInt(tempVar2);
	   }
	   if (pp[i] < 19)
	   {
		   a++;
	   }
	   else if (pp[i] >= 19 && pp[i] <= 35)
	   {
		   b++;
	   }
	   else if (pp[i] >= 36 && pp[i] <= 60)
	   {
		   c++;
	   }
	   else if (pp[i] >= 61)
	   {
		   d++;
	   }

	   }
		sum = a + b + c + d;
		e = 1.0 * (100000 * a / sum);
		f = 1.0 * (100000 * b / sum);
		g = 1.0 * (100000 * c / sum);
		j = 1.0 * (100000 * d / sum);
		System.out.printf("1-18: %.2lf%%\n",e / 1000);
		System.out.printf("19-35: %.2lf%%\n",f / 1000);
		System.out.printf("36-60: %.2lf%%\n",g / 1000);
		System.out.printf("60??: %.2lf%%\n",j / 1000);
			return 0;
	}
}

