package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] age = new int[100];
	   int i;
	   int n;
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
				age[i] = Integer.parseInt(tempVar2);
			}
	   }
	   double s1 = 0.0;
	   double s2 = 0.0;
	   double s3 = 0.0;
	   double s4 = 0.0;
	   double m = 0.0;
	   for (i = 0;i < n;i++)
	   {
		   if (1 <= age[i] != 0 && age[i] <= 18)
		   {
				 s1 += 1;
		   }
		   else if (19 <= age[i] != 0 && age[i] <= 35)
		   {
			   s2 += 1;
		   }
		   else if (36 <= age[i] != 0 && age[i] <= 60)
		   {
			   s3 += 1;
		   }
		   else if (age[i] > 60)
		   {
			   s4 += 1;
		   }
	   }
	   m = s1 + s2 + s3 + s4;

	   System.out.printf("1-18: %.2lf%%\n",100 * s1 / m);
	   System.out.printf("19-35: %.2lf%%\n",100 * s2 / m);
	   System.out.printf("36-60: %.2lf%%\n",100 * s3 / m);
	   System.out.printf("Over60: %.2lf%%\n",100 * s4 / m);

	   return 0;
	}

}

