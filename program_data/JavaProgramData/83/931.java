package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int x;
	   float[] a = new float[100];
	   float jd;
	   float sumx;
	   float sumj;
	   int[] b = new int[20];
	   for (i = 0;i <= 59;i++)
	   {
		   a[i] = 0F;
	   }
	   for (i = 60;i <= 63;i++)
	   {
		   a[i] = 1F;
	   }
	   for (i = 64;i <= 67;i++)
	   {
		   a[i] = 1.5F;
	   }
	   for (i = 68;i <= 71;i++)
	   {
		   a[i] = 2F;
	   }
	   for (i = 72;i <= 74;i++)
	   {
		   a[i] = 2.3F;
	   }
	   for (i = 75;i <= 77;i++)
	   {
		   a[i] = 2.7F;
	   }
	   for (i = 78;i <= 81;i++)
	   {
		   a[i] = 3F;
	   }
	   for (i = 82;i <= 84;i++)
	   {
		   a[i] = 3.3F;
	   }
	   for (i = 85;i <= 89;i++)
	   {
		   a[i] = 3.7F;
	   }
	   for (i = 90;i <= 100;i++)
	   {
		   a[i] = 4F;
	   }
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   sumx = 0F;
	   sumj = 0F;
	   for (i = 0;i < n;i++)
	   {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 b[i] = Integer.parseInt(tempVar2);
			 }
		  sumx = sumx + b[i];

	   }
	   for (i = 0;i < n;i++)
	   {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   x = Integer.parseInt(tempVar3);
		   }
		sumj = sumj + a[x] * b[i];

	   }

	   jd = sumj / sumx;
	   System.out.printf("%.2f",jd);
	   return 0;


	}

}

