package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 1;
		double n;
		double num;
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		double w;
		double x;
		double y;
		double z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
	   while (i <= n)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   num = Double.parseDouble(tempVar2);
		   }
		   if (num <= 18)
		   {
			a++;
			i++;
		   }
			else if (num >= 19 && num <= 35)
			{
				b++;
				i++;
			}
			else if (num >= 36 && num <= 60)
			{
				c++;
				i++;
			}
			else if (num >= 61)
			{
				d++;
				i++;
			}
	   }
		   w = a / n * 100;
		   x = b / n * 100;
		   y = c / n * 100;
		   z = d / n * 100;
		   System.out.printf("1-18: %.2lf%%\n",w);
		   System.out.printf("19-35: %.2lf%%\n",x);
		   System.out.printf("36-60: %.2lf%%\n",y);
		   System.out.printf("Over60: %.2lf%%\n",z);
			return 0;
	}





}

