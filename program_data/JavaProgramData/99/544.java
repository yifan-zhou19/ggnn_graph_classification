package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int i;
	   int j;
	   int a;
	   int b;
	   int c;
	   int d;
	   a = 0;
	   b = 0;
	   c = 0;
	   d = 0;
	   double x;
	   double y;
	   double z;
	   double w;
	   double n;
	   int[] tt = new int[10000];
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
			   tt[i] = Integer.parseInt(tempVar2);
		   }
			if (tt[i] <= 18)
			{
				a++;
			}
			else if (tt[i] <= 35)
			{
				b++;
			}
				 else if (tt[i] <= 60)
				 {
					 c++;
				 }
					  else
					  {
						  d++;
					  }
	   }
	   x = (a * 100) / n;
	   y = (b * 100) / n;
	   z = (c * 100) / n;
	   w = (d * 100) / n;

	   System.out.printf("1-18: %.2lf%%\n",x);
	   System.out.printf("19-35: %.2lf%%\n",y);
	   System.out.printf("36-60: %.2lf%%\n",z);
	   System.out.printf("60??: %.2lf%%\n",w);


	}
}

