package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int n;
	   int i;
	   float ave;
	   float sum;
	   float min;
	   float max;
	   float a;
	   float b;
	   float[] num = new float[300];
	   sum = 0F;
	   a = 0F;
	   b = 0F;
	   n = 0;
	   ave = 0F;
	   i = 0;
	   while (i < 299)
	   {
		   num[i] = 0F;
		   i++;
	   }
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
			   num[i] = Float.parseFloat(tempVar2);
		   }
	   }


	   i = 0;
	   while (i < n)
	   {
		   sum = sum + num[i];
		   i++;
	   }

	   ave = sum / n;


	   i = 0;
	   while (i < n - 1)
	   {
		   if (num[i] > num[i + 1])
		   {
			   max = num[i];
			   num[i] = num[i + 1];
			   num[i + 1] = max;
		   }
		   i++;
	   }
	   max = num[n - 1];

	   i = n - 1;
	   while (i > 0)
	   {
		   if (num[i - 1] > num[i])
		   {
			   min = num[i - 1];
			   num[i - 1] = num[i];
			   num[i] = min;
		   }
		   i--;
	   }
	   min = num[0];
	   a = ave - min;
	   b = max - ave;
	   if (a > b)
	   {
		   System.out.printf("%.0f",min);
	   }
	   else if (a < b)
	   {
		   System.out.printf("%.0f",max);
	   }
	   else
	   {
		   System.out.printf("%.0f,%.0f",min,max);
	   }
	}


}

