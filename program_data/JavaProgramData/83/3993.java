package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int num;
	   double[] sz = new double[10];
	   double[] sz1 = new double[10];
	   double[] sz2 = new double[10];
	   double sum;
	   double result;
	   double GPA;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   num = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < num;i++)
	   {
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 sz[i] = Double.parseDouble(tempVar2);
						 }
	   }
	   for (i = 0;i < num;i++)
	   {
						 String tempVar3 = ConsoleInput.scanfRead();
						 if (tempVar3 != null)
						 {
							 sz1[i] = Double.parseDouble(tempVar3);
						 }
	   }
	   for (i = 0;i < num;i++)
	   {
						 if (sz1[i] >= 90)
						 {
									   sz2[i] = 4.0;
						 }
						 else if (sz1[i] >= 85)
						 {
									   sz2[i] = 3.7;
						 }
						 else if (sz1[i] >= 82)
						 {
									   sz2[i] = 3.3;
						 }
						 else if (sz1[i] >= 78)
						 {
									   sz2[i] = 3.0;
						 }
						 else if (sz1[i] >= 75)
						 {
									   sz2[i] = 2.7;
						 }
						 else if (sz1[i] >= 72)
						 {
									   sz2[i] = 2.3;
						 }
						 else if (sz1[i] >= 68)
						 {
									   sz2[i] = 2.0;
						 }
						 else if (sz1[i] >= 64)
						 {
									   sz2[i] = 1.5;
						 }
						 else if (sz1[i] >= 60)
						 {
									   sz2[i] = 1.0;
						 }
						else
						{
									   sz2[i] = 0;
						}
	   }
	   result = 0;
	   sum = 0;
	   //for(i=0;i<num;i++)
	   //printf("%.2lf %.2lf\n", sz1[i], sz2[i]);
	   for (i = 0;i < num;i++)
	   {
						 result = result + sz2[i] * sz[i];
						 sum = sum + sz[i];
	   }
	   //printf("%.2lf %.2lf", result, sum);
	  GPA = result / sum;
	   System.out.printf("%.2lf", GPA);
	   scanf(" ");
	   return 0;
	}
}

